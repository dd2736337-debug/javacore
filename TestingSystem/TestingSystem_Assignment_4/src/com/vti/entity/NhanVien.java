package com.vti.entity;

public class NhanVien extends CanBo {
    private final String congViec;

    public NhanVien(String name, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(name, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Công Việc: " + congViec);
    }
}
