package com.vti.entity;

public class KhoiB extends ThiSinh {
    public KhoiB(int soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public void disPlay() {
        super.disPlay();
        System.out.println("Khối Thi B:(Toán, Hóa,Sinh)");
    }
}
