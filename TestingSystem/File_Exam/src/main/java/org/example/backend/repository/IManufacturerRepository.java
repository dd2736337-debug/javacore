package org.example.backend.repository;

import org.example.entity.Manufacturer;

import java.sql.SQLException;

public interface IManufacturerRepository {
    Manufacturer getById(int id) throws SQLException; //Hàm tìm theo ID


}
