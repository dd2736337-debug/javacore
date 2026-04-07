package org.example.backend.Service;

import org.example.backend.Repository.DepartmentRepository;
import org.example.backend.Repository.IDepartmentRepository;
import org.example.entity.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService implements IDepartmentService {
    IDepartmentRepository departmentRepository = new DepartmentRepository();

    @Override
    public List<Department> DisplayDepartment() {
        try {
            return (List<Department>) departmentRepository.DisplayDepartment();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("không tìm thấy department");
            return new ArrayList<>();
        }
    }

    @Override
    public Department departmentfindById(int id) {
        try {
            return departmentRepository.departmentfindById(id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Không tìm thấy department");
            return null;
        }
    }

    @Override
    public List<Department> departmnetFindByName(String name) {
        try {
            return departmentRepository.departmnetFindByName(name);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("không tìm thấy!");
            return new ArrayList<>();
        }
    }

    @Override
    public boolean deteleDepartment(int id) {
        try {
            return departmentRepository.deteleDepartment(id);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Không tìm thấy id");
            return false;
        }
    }

    @Override
    public boolean changeDepartmentName(int id, String newDepartmentname) {
        try {
            return departmentRepository.changeDepartmentName(id, newDepartmentname);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("không tìm thấy id");
            return false;
        }
    }

    @Override
    public boolean createDepartment(int id, String name) {
        try {
            return departmentRepository.createDepartment(id, name);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Thêm mới không thành công");
            return false;
        }
    }

}
