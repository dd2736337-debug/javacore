package org.example.com.vti.frontend;

import org.example.com.vti.backend.controller.LecturerController;
import org.example.com.vti.backend.controller.StudentController;
import org.example.com.vti.entity.Lecturer;
import org.example.com.vti.entity.Major;
import org.example.com.vti.entity.Student;
import org.example.com.vti.scannerutil.JdbcUtils;
import org.example.com.vti.scannerutil.ScannerInput;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Funtion {
    StudentController studentController = new StudentController();
//Hàm hiên thị danh sách Students
    public void showStudent() {


        List<Student> list = studentController.getAllStudents();

        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }

        System.out.println("+-----------------------------------------------------------------------------------------------+");
        System.out.printf("| %-5s | %-25s | %-25s | %-12s | %-20s |\n",
                "ID", "HỌ TÊN", "EMAIL", "NGÀY SINH", "CHUYÊN NGÀNH");
        System.out.println("+-----------------------------------------------------------------------------------------------+");

        for (Student s : list) {
            System.out.printf("| %-5d | %-25s | %-25s | %-12s |%-20s|\n",
                    s.getStudentId(),
                    s.getFullName(),
                    s.getEmail(),
                    s.getDateOfBirth(),
                    s.getMajor().getName()
            );
        }

        System.out.println("+------------------------------------------------------------------------------------");
    }

    //Hàm Thêm sinh viên mới
    public void insert(){
        System.out.println("Nhập họ và tên: ");
        String fullName= ScannerInput.nextString();
        System.out.println("Nhập Email: ");
        String email=ScannerInput.nextEmail();
        System.out.println("Nhập ngày sinh (yyyy-MM-dd)");
        LocalDate dob=ScannerInput.inputDate();
        System.out.println("Nhập major_id: ");
        int majorId=ScannerInput.nextInt();
        Student s=new Student();
        s.setFullName(fullName);
        s.setEmail(email);
        s.setDateOfBirth(dob);
        Major major =new Major();
        major.setId(majorId);
        s.setMajor(major);
        boolean result =studentController.insert(s);
        if (result){
            System.out.println("Thêm thành công!");
        }else {
            System.out.println("Thêm thất bại(có thể email đã tồn tại)");
        }
    }

    //Hàm cập nhật chuyên ngành cho sinh viên
    public void updateMajor(){
        System.out.println("Nhập ID sinh viên: ");
        int studentID=ScannerInput.nextNonNegativeInt();
        System.out.println("Nhập ID chuyên ngành mới:");
        int majorID=ScannerInput.nextNonNegativeInt();
        boolean result =studentController.updateMajor(studentID,majorID);
        if (result){
            System.out.println("Cập nhật thành công");
        }else {
            System.out.println("Cập nhật thất bại (không tồn tại SV hoặc lỗi)!");
        }
    }

    //Hàm Xóa Sinh Viên Theo Id
    public void deleteById(){
        System.out.println("Nhập ID sinh viên cần xóa: ");
        int studentId = ScannerInput.nextNonNegativeInt();
        boolean result=studentController.deleteById(studentId);
        if (result) {
            System.out.println("Xóa sinh viên thành công!");
        } else {
            System.out.println("Xóa thất bại (không tồn tại hoặc lỗi)!");
        }
    }

    //Tìm kiếm sinh viên theo chuyên ngành
    public void searchByMajor() {

        System.out.println("Nhập ID chuyên ngành cần tìm: ");
        int majorId = ScannerInput.nextInt();

        List<Student> list = studentController.findByMajorId(majorId);
        if (list.isEmpty()) {
            System.out.println("Không có sinh viên nào!");
            return;
        }
        System.out.println("+-----------------------------------------------------------------------------------------------+");
        System.out.printf("| %-5s | %-25s | %-25s | %-12s | %-20s |\n",
                "ID", "HỌ TÊN", "EMAIL", "NGÀY SINH", "CHUYÊN NGÀNH");
        System.out.println("+-----------------------------------------------------------------------------------------------+");

        for (Student s : list) {
            System.out.printf("| %-5d | %-25s | %-25s | %-12s | %-20s |\n",
                    s.getStudentId(),
                    s.getFullName(),
                    s.getEmail(),
                    s.getDateOfBirth(),
                    s.getMajor() != null ? s.getMajor().getName() : "null"
            );
        }

        System.out.println("+-----------------------------------------------------------------------------------------------+");
    }

    //Hàm tìm kiếm giảng viên theo id
    public void findById(){
        LecturerController lecturerController=new LecturerController();
        System.out.println("Nhập Id giảng viên: ");
        int id =ScannerInput.nextNonNegativeInt();
        Lecturer lecturer=lecturerController.findById(id);
        if (lecturer==null){
            System.out.println("Không tìm thấy giảng viên!");
            return;
        }
        System.out.println("+--------------------------------------------------------------------------+");
        System.out.printf("| %-5s | %-25s | %-25s | %-20s |\n",
                "ID", "HỌ TÊN", "EMAIL", "KHOA");
        System.out.println("+--------------------------------------------------------------------------+");

        System.out.printf("| %-5d | %-25s | %-25s | %-20s |\n",
                lecturer.getId(),
                lecturer.getFullName(),
                lecturer.getEmail(),
                lecturer.getDepartment()
        );

        System.out.println("+--------------------------------------------------------------------------+");
    }

    public void checkPassWord(){
        System.out.println("Nhập PassWrod: ");
        String password=ScannerInput.nextPassword();
        System.out.println("Password hợp lệ: "+password);
    }
}
