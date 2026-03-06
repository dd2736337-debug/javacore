package com.vti.entity;

public class CanBo {
    private final String name;
    private final int tuoi;
    private final String gioiTinh;
    private final String diaChi;

    public CanBo(String name, int tuoi, String gioiTinh, String diaChi) {
        this.name = name;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Name: " + name +
                " | Tuổi: " + tuoi +
                " | Giới Tính: " + gioiTinh +
                " | Địa Chỉ: " + diaChi);
    }


}
