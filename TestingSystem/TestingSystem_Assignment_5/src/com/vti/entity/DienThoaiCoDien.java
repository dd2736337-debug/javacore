package com.vti.entity;

public class DienThoaiCoDien extends DienThoaiDiDong {

    public void ngheRadio() {
        System.out.println("Nghe radio");
    }

    @Override
    public void tanCong() {
        System.out.println("Tấn công cổ điển");
    }
}
