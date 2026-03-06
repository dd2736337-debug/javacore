package com.vti.entity;

import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<TaiLieu> danhSach=new ArrayList<>();
    public void themTaiLieu(TaiLieu taiLieu){
        danhSach.add(taiLieu);
    }
    public void xoaTaiLieu(int maTaiLieu){
        danhSach.removeIf(t -> t.getMaTaiLieu() == maTaiLieu);
    }
    public void hienThiThongTin(){
        for(TaiLieu taiLieu:danhSach){
            System.out.println(taiLieu);
        }
    }
    public void timSach(){
        for(TaiLieu taiLieu:danhSach){
            if(taiLieu instanceof Sach){
                System.out.println(taiLieu);
            }
        }
    }
    public void timTapChi(){
        for(TaiLieu taiLieu:danhSach){
            if(taiLieu instanceof TapChi){
                System.out.println(taiLieu);
            }
        }
    }
    public void timBao(){
        for(TaiLieu taiLieu:danhSach){
            if(taiLieu instanceof Bao){
                System.out.println(taiLieu);
            }
        }
    }
}
