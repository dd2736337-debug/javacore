package com.vti.entity;

public class KhoiA extends ThiSinh {

    public KhoiA(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void disPlay() {
        super.disPlay();
        System.out.println("Khối Thi A:(Toán,Lý,Hóa)");
    }
}
