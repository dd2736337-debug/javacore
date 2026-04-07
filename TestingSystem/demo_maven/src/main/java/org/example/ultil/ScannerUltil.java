package org.example.ultil;


import org.example.backend.Repository.DepartmentRepository;
import org.example.entity.Department;

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
                System.out.println("Bạn phải nhập vào một số");
            }
        }
    }

    public static double nextDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn phải nhập vào một số thực(double)");
            }
        }
    }

    public static float nextFloat() {
        while (true) {
            try {
                return Float.parseFloat(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Sai định dạng nhập lại:");
            }
        }
    }

    public static String nextLine() {
        return sc.nextLine();
    }

    public static  int inputDepartmentId() throws SQLException {
        DepartmentRepository departmentRepository=new DepartmentRepository();
        System.out.println("Mời bạn chọn id Department để hiện thị");
        List<Department> list=departmentRepository.DisplayDepartment();
        for (Department department : list){
            System.out.println(department.getDepartmentID()+" . "+department.getDepartmentName() );
        }
        int departmentID=ScannerUltil.inputDepartmentId();
        while (true){
            boolean check=false;
            for (Department department :list){
                if (department.getDepartmentID()==departmentID){
                    check=true;
                }
            }
            //sau vong lặp kiểm tra  giá trị id có trong ds hay không
            if(check){
                break;
            }else {
                System.err.println("ID bạn nhập không tồng tại trong dnah sách");
                departmentID=ScannerUltil.nextInt();
            }
        }
        return departmentID;
    }

}
