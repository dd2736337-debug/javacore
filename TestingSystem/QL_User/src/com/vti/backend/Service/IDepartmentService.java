package com.vti.backend.Service;

import com.vti.entity.Department;

import java.util.List;

public interface IDepartmentService {
    List<Department> DisplayDepartment();

    Department departmentfindById(int id);

    List<Department> departmnetFindByName(String name);

    boolean deteleDepartment(int id);

    boolean changeDepartmentName(int id, String newDepartmentname);

    boolean createDepartment(int id, String name);
}
