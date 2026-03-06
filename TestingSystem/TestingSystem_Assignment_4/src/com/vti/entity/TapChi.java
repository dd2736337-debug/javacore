package com.vti.entity;

public class TapChi extends TaiLieu {
    private final int soPhatHanh;
    private final int thangPhatHanh;

    public TapChi(int maTaiLieu, String nhaXuatBan, int soBanPhatHanh
            , int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String toString() {
        return "Tạp Chí{" + super.toString() +
                ",Số Phát Hành=" + soPhatHanh +
                ",Tháng Phát Hành" + thangPhatHanh + "}";
    }
}
