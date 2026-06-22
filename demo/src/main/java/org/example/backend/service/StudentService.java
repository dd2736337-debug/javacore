package org.example.com.vti.backend.service;

import org.example.com.vti.backend.repository.IStudentRepository;
import org.example.com.vti.backend.repository.StudentRepository;
import org.example.com.vti.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService{
    IStudentRepository studentRepository=new StudentRepository();
    @Override
    public List<Student> getAllStudents() {
        try {
            return studentRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public boolean insert(Student student) {
        try {
            if (studentRepository.existsByEmail(student.getEmail())){
                return false;
            }
            return studentRepository.insert(student);
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateMajor(int studentId, int majorId) {
        try {
            if (!studentRepository.existsById(studentId)){
                return false;
            }
            return studentRepository.updateMajor(studentId,majorId);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteById(int studentId) {
        try {
            if(!studentRepository.existsById(studentId)){
                return false;
            }
            return studentRepository.deleteById(studentId);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Student> findByMajorId(int majorId) {
        try {
            return studentRepository.findByMajorId(majorId);
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

}
