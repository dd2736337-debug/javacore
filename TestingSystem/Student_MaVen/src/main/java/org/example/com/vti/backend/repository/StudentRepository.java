package org.example.com.vti.backend.repository;

import com.mysql.cj.jdbc.JdbcConnection;
import org.example.com.vti.entity.Lecturer;
import org.example.com.vti.entity.Major;
import org.example.com.vti.entity.Student;
import org.example.com.vti.scannerutil.JdbcUtils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository{
    @Override
    public List<Student> findAll() throws SQLException {
        List<Student> list=new ArrayList<>();
        String sql="SELECT s.student_id, s.full_name, s.email, s.date_of_birth, m.major_name\n" +
                "            FROM Student s\n" +
                "            LEFT JOIN Major m ON s.major_id = m.major_id";
        Connection connection= JdbcUtils.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            Student student=new Student();
            student.setStudentId(resultSet.getInt("student_id"));
            student.setFullName(resultSet.getString("full_name"));
            student.setEmail(resultSet.getString("email"));
            student.setDateOfBirth(resultSet.getDate("date_of_birth").toLocalDate());
            Major major=new Major();
            major.setName(resultSet.getString("major_name"));
            student.setMajor(major);
            list.add(student);
        }
        return list;
    }

    @Override
    public boolean existsByEmail(String email) throws SQLException {
        String sql="SELECT * FROM Student WHERE email = ?";
        Connection connection=JdbcUtils.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,email);
        ResultSet resultSet=preparedStatement.executeQuery();
        return resultSet.next();//Có dòng là tồn tại

    }

    @Override
    public boolean insert(Student student) throws SQLException {
        String sql="INSERT INTO Student(full_name, email, date_of_birth, major_id)\n" +
                "            VALUES (?, ?, ?, ?)";
        Connection connection =JdbcUtils.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(1,student.getFullName());
        preparedStatement.setString(2,student.getEmail());
        preparedStatement.setDate(3, Date.valueOf(student.getDateOfBirth()));
        preparedStatement.setInt(4,student.getMajor().getId());
        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean updateMajor(int studentId, int majorId) throws SQLException {
        String sql="UPDATE Student SET major_id = ? WHERE student_id = ?";
        Connection connection=JdbcUtils.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,majorId);
        preparedStatement.setInt(2,studentId);
        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean existsById(int studentId) throws SQLException {
        String sql = "SELECT * FROM Student WHERE student_id = ?";

        Connection conn = JdbcUtils.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, studentId);

        ResultSet rs = ps.executeQuery();

        return rs.next(); // có dữ liệu => tồn tại
    }

    @Override
    public boolean deleteById(int studentId) throws SQLException {
        String sql="DELETE FROM Student WHERE student_id = ?";
        Connection connection=JdbcUtils.getConnection();
        PreparedStatement preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setInt(1,studentId);
        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public List<Student> findByMajorId(int majorId) throws SQLException {
        List<Student> list = new ArrayList<>();
        String sql = "SELECT s.*,m.*\n" +
                "FROM Student s\n" +
                "LEFT JOIN Major m ON s.major_id = m.major_id\n" +
                "WHERE s.major_id = ?";
        Connection connection = JdbcUtils.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, majorId);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Student student = new Student();
            student.setStudentId(resultSet.getInt("student_id"));
            student.setFullName(resultSet.getString("full_name"));
            student.setEmail(resultSet.getString("email"));
            student.setDateOfBirth(resultSet.getDate("date_of_birth").toLocalDate());
            Major major = new Major();
            major.setId(resultSet.getInt("major_id"));
            major.setName(resultSet.getString("major_name"));
            student.setMajor(major);
            list.add(student);
        }
        return list;
    }

}
