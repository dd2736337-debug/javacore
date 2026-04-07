package org.example.backend.Controller;

import org.example.backend.Service.DepartmentService;
import org.example.backend.Service.IDepartmentService;
import org.example.entity.Department;

import java.util.List;

public class DepartmentController {
    IDepartmentService departmentService = new DepartmentService();

    public List<Department> DisplayDepartment() {
        return departmentService.DisplayDepartment();
    }

    public Department findById(int id) {
        return departmentService.departmentfindById(id);
    }

    public List<Department> departmnetFindByName(String name) {
        return departmentService.departmnetFindByName(name);
    }

    public boolean deteleDepartment(int id) {
        return departmentService.deteleDepartment(id);
    }

    public boolean changeDepartmentName(int id, String newDepartmentname) {
        return departmentService.changeDepartmentName(id, newDepartmentname);
    }

    public boolean createDepartment(int id, String name) {
        return departmentService.createDepartment(id, name);
    }

}
