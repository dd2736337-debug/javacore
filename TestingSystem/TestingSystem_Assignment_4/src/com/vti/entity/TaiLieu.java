package com.vti.entity;

public class TaiLieu {
    private final int maTaiLieu;
    private final String nhaXuatBan;
    private final int soBanPhatHanh;

    public TaiLieu(int maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public int getMaTaiLieu() {
        return maTaiLieu;
    }

    public String toString() {
        return "MaTaiLieu: " + maTaiLieu +
                ",tenNhaXuatBan='" + nhaXuatBan + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh;
    }

}
