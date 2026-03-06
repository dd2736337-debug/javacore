package com.vti.entity;

public class KySu extends CanBo {
    private final String nganhDaoTao;

    public KySu(String name, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(name, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public void display() {
        super.display();
        System.out.println("Ngành đạo tạo: " + nganhDaoTao);
    }
}
