package com.vti.entity;

public class Bao extends TaiLieu{
    private String ngayPhatHanh;

    public Bao(int maTaiLieu,String nhaXuatBan,int soBanPhatHanh,String ngayPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh=ngayPhatHanh;
    }

    public String toString(){
        return "Báo:{"+ super.toString() +
                ",ngày phát hành= '"+ngayPhatHanh +'\''+
                '}';
    }
}
