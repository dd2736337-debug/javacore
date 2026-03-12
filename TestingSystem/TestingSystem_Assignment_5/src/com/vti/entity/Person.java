package com.vti.entity;

import java.util.Scanner;

public class Person {
    private String name;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public Person() {
    }

    public Person(String name, String gioiTinh, String ngaySinh, String diaChi) {
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();
        System.out.println("Nhập giới tính:");
        String gioiTinh = sc.nextLine();
        System.out.println("Nhập ngày sinh:");
        String ngaySinh = sc.nextLine();
        System.out.println("Nhập địa chỉ:");
        String diaChi = sc.nextLine();
    }

    public void showInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Giới Tính: " + gioiTinh);
        System.out.println("Ngày Sinh: " + ngaySinh);
        System.out.println("Địa Chỉ: " + diaChi);
    }

}
