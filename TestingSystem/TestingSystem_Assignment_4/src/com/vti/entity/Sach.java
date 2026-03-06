package com.vti.entity;

public class Sach extends TaiLieu {
    private final String tenTacGia;
    private final int soTrang;

    public Sach(int maTaiLieu, String nhaXuatBan,
                int soBanPhatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String toString() {
        return "Sách{" + super.toString() +
                ", Tác Giả='" + tenTacGia + '\'' +
                ",soTrang=" + soTrang + '}';
    }
}
