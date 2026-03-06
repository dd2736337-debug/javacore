package com.vti.entity;

public class CongNhan extends CanBo {
    private final int bac;

    public CongNhan(String name, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(name, tuoi, gioiTinh, diaChi);
        this.bac = tuoi;
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Bậc công nhân: " + bac);
    }
}
