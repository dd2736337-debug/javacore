package com.vti.entity;

public  abstract class DienThoaiDiDong implements VuKhi {
    public void nghe(){
        System.out.println("Nghe Điện Thoại");
    }
    public void goi(){
        System.out.println("Gọi Điện Thoại");
    }
    public void guiTinNhan(){
        System.out.println("Gửi Tin Nhắn");
    }
    public  void nhanTinNhan(){
        System.out.println("Nhận Tin Nhắn");
    }
}
