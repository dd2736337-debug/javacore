package org.example.backend.controller;

import org.example.backend.service.IManufacturerService;
import org.example.backend.service.ManufacturerService;
import org.example.entity.Manufacturer;

import java.sql.SQLException;

public class ManufacturerController {
    IManufacturerService service=new ManufacturerService();
    public Manufacturer getById(int id) throws SQLException {
        return service.getById(id);
    }
}
