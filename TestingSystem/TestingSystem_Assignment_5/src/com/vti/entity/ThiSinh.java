package com.vti.entity;

public class ThiSinh {
    private final int soBaoDanh;
    private final String hoTen;
    private final String diaChi;
    private final int mucUuTien;

    public ThiSinh(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;

    }

    public void disPlay() {
        System.out.println("Số Báo Danh:" + this.soBaoDanh);
        System.out.println("Họ Tên:" + this.hoTen);
        System.out.println("Đia chỉ:" + this.diaChi);
        System.out.println("Mức ưu tiên:" + this.mucUuTien);
    }

    public int getSoBaoDanh() {
        return soBaoDanh;
    }
}
