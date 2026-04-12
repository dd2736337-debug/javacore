package org.example.backend.service;


import org.example.backend.repository.IManufacturerRepository;
import org.example.backend.repository.ManufacturerRepository;
import org.example.entity.Manufacturer;

import java.sql.SQLException;

public class ManufacturerService implements IManufacturerService {
    @Override
    public Manufacturer getById(int id) throws SQLException {
        IManufacturerRepository repository=new ManufacturerRepository();
        if (id<=0){
            System.out.println("ID không hợp lệ!");
            return null;
        }
        return repository.getById(id);
    }
}
