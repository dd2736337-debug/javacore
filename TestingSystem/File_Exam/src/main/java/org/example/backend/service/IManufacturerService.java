package org.example.backend.service;

import org.example.entity.Manufacturer;

import java.sql.SQLException;

public interface IManufacturerService {
    Manufacturer getById(int id) throws SQLException;
}
