package org.example.com.vti.backend.service;

import org.example.com.vti.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getAllStudents();

    boolean insert(Student student);

    boolean updateMajor(int studentId, int majorId);

    boolean deleteById(int studentId);

    List<Student> findByMajorId(int majorId);
}
