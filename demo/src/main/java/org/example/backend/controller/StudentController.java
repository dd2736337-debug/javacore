package org.example.com.vti.backend.controller;

import org.example.com.vti.backend.service.IStudentService;
import org.example.com.vti.backend.service.StudentService;
import org.example.com.vti.entity.Student;

import java.util.List;

public class StudentController {
    IStudentService studentService=new StudentService();

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    public boolean insert(Student student){
        return studentService.insert(student);
    }

    public boolean updateMajor(int studentId, int majorId){
        return studentService.updateMajor(studentId,majorId);
    }

    public boolean deleteById(int studentId){return  studentService.deleteById(studentId);}

    public List<Student> findByMajorId(int majorId){
        return studentService.findByMajorId(majorId);
    }
}

