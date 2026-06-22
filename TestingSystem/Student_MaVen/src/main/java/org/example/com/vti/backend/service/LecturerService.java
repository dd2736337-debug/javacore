package org.example.com.vti.backend.service;

import org.example.com.vti.backend.repository.ILecturer;
import org.example.com.vti.backend.repository.IStudentRepository;
import org.example.com.vti.backend.repository.LecturerRepository;
import org.example.com.vti.entity.Lecturer;

public class LecturerService implements ILecturerService{
    ILecturer lecturer=new LecturerRepository();
    @Override
    public Lecturer findById(int lecturerId) {
        try {
            if (!lecturer.existsById(lecturerId)){
                return null;
            }
            return lecturer.findById(lecturerId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
