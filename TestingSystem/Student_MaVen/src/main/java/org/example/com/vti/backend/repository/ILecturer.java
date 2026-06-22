package org.example.com.vti.backend.repository;

import org.example.com.vti.entity.Lecturer;

import java.sql.SQLException;

public interface ILecturer {
    Lecturer findById(int lecturerId) throws SQLException;


    boolean existsById(int lecturerId) throws SQLException;
}
