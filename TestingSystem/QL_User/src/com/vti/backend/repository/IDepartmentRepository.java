package com.vti.backend.Repository;

import com.vti.entity.Department;
import com.vti.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IDepartmentRepository {
    List<Department> DisplayDepartment()  throws SQLException;

    Department departmentfindById(int id) throws  SQLException ;

    List<Department> departmnetFindByName(String name) throws SQLException;
}
