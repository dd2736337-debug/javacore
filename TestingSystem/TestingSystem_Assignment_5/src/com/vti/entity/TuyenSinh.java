package com.vti.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
    ArrayList<ThiSinh> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void themThiSinh() {
        System.out.println("Chọn Khối:\nA\nB\nC");
        String khoi = sc.nextLine();
        System.out.println("Nhập SBD:");
        int sbd = sc.nextInt();
        sc.nextLine();
        System.out.println("Họ Tên:");
        String ten = sc.nextLine();
        System.out.println("Địa Chỉ:");
        String diaChi = sc.nextLine();
        System.out.println("Mức ưu tiên:");
        int uuTien = sc.nextInt();
        sc.nextLine();
        if (khoi.equals("A")) {
            list.add(new KhoiA(sbd, ten, diaChi, uuTien));
        }
        if (khoi.equals("B")) {
            list.add(new KhoiB(sbd, ten, diaChi, uuTien));
        }
        if (khoi.equals("C")) {
            list.add(new KhoiC(sbd, ten, diaChi, uuTien));
        }
    }

    public void disPlayThiSinh() {
        for (ThiSinh thiSinh : list) {
            thiSinh.disPlay();
            System.out.println("------------");
        }
    }

    public void timThiSinh(int soBaoDanh) {
        for (ThiSinh thiSinh : list) {
            if (soBaoDanh == thiSinh.getSoBaoDanh()) {
                thiSinh.disPlay();
            }
        }
    }


}
