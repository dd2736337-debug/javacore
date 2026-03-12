package com.vti.entity;

import java.util.Scanner;

public class Student1 extends Person {
    private String maSinhVien;
    private float diemTB;
    private String email;

    public Student1(String name, String gioiTinh, String ngaySinh, String diaChi,
                    String maSinhVien, float diemTB, String email) {
        super(name, gioiTinh, ngaySinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.diemTB = diemTB;
        this.email = email;
    }

    @Override
    public void inputInfo() {
        super.inputInfo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã SV: ");
        maSinhVien = sc.nextLine();
        System.out.println("Nhập điểm TB: ");
        diemTB = sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhập Email: ");
        email = sc.nextLine();
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Mã Sinh Viên:" + maSinhVien);
        System.out.println("Điểm Trung Bình:" + diemTB);
        System.out.println("Email:" + email);
    }

    public void hocBong() {
        if (diemTB >= 8) {
            System.out.println("Được học bổng");
        } else {
            System.out.println("Không được học bổng");
        }
    }
}
