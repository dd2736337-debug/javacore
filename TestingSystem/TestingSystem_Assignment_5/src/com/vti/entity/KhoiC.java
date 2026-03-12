package com.vti.entity;

public class KhoiC extends ThiSinh {

    public KhoiC(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void disPlay() {
        super.disPlay();
        System.out.println("Khối Thi C:(Văn,Sử,Địa");
    }
}
