package com.vti.ultil;

import com.vti.backend.Repository.DepartmentRepository;
import com.vti.entity.Department;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ScannerUltil {
    static Scanner sc = new Scanner(System.in);

    public static int nextInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Ban phai nhap vao mot so");
            }
        }
    }

    public static double nextDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Ban phai nhap vao mot so thuc (double)");
            }
        }
    }

    public static float nextFloat() {
        while (true) {
            try {
                return Float.parseFloat(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Sai dinh dang, nhap lai:");
            }
        }
    }

    public static String nextLine() {
        return sc.nextLine();
    }

    public static int inputDepartmentId() throws SQLException {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        List<Department> list = departmentRepository.DisplayDepartment();

        System.out.println("Moi ban chon id Department de hien thi");
        for (Department department : list) {
            System.out.println(department.getDepartmentID() + " . " + department.getDepartmentName());
        }

        while (true) {
            int departmentID = ScannerUltil.nextInt();
            boolean check = false;

            for (Department department : list) {
                if (department.getDepartmentID() == departmentID) {
                    check = true;
                    break;
                }
            }

            if (check) {
                return departmentID;
            }

            System.out.println("ID ban nhap khong ton tai trong danh sach, vui long nhap lai:");
        }
    }
}
