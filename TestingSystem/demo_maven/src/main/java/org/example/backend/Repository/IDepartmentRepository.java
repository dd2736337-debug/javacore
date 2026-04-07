package org.example.backend.Repository;


import org.example.entity.Department;

import java.sql.SQLException;
import java.util.List;

public interface IDepartmentRepository {
    List<Department> DisplayDepartment() throws SQLException;

    Department departmentfindById(int id) throws SQLException;

    List<Department> departmnetFindByName(String name) throws SQLException;

    boolean deteleDepartment(int id) throws SQLException;

    boolean changeDepartmentName(int id, String newDepartmentname) throws SQLException;

    boolean createDepartment(int id, String name) throws SQLException;
}
