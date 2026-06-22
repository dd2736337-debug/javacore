package org.example.com.vti.backend.repository;

import org.example.com.vti.entity.Lecturer;
import org.example.com.vti.entity.Student;

import java.sql.SQLException;
import java.util.List;

public interface IStudentRepository {
    //Lấy tất cả sinh viên
    List<Student> findAll() throws SQLException;

    //hàm check mail;
    boolean existsByEmail(String email) throws SQLException;

    //Hàm thêm mới
    boolean insert(Student student) throws SQLException;

    boolean updateMajor(int studentId, int majorId) throws SQLException;

     boolean existsById(int studentId) throws SQLException;

    boolean deleteById(int studentId) throws SQLException;

    List<Student> findByMajorId(int majorId) throws SQLException;



}
