package org.example.com.vti.backend.controller;

import org.example.com.vti.backend.repository.ILecturer;
import org.example.com.vti.backend.repository.LecturerRepository;
import org.example.com.vti.backend.service.ILecturerService;
import org.example.com.vti.backend.service.LecturerService;
import org.example.com.vti.entity.Lecturer;

public class LecturerController {
    ILecturerService lecturerService=new LecturerService();

    public Lecturer findById(int lecturerId){
        return  lecturerService.findById(lecturerId);
    }
}
