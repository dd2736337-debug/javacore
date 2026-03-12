package com.vti.entity;

public class DienThoaiThongMinh extends DienThoaiDiDong{

    public void suDung3G(){
        System.out.println("Sử Dụng 3G");
    }

    public void chupHinh(){
        System.out.println("Chụp Hình");
    }

    @Override
    public void tanCong() {
        System.out.println("Tấn Công");
    }
}
