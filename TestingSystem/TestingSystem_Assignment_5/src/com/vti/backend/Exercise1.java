package com.vti.backend;

import com.vti.entity.MyNews;
import com.vti.entity.TuyenSinh;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        MyNews.questionh_1();
    }

    public static void questionh_2() {
        Scanner sc = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        while (true) {
            System.out.println("1.Thêm mới thí sinh.");
            System.out.println("2.Hiển Thị Thông Tin:");
            System.out.println("3.Tìm Kiếm Theo SBD:");
            System.out.println("4.Thoát Chương Trình");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    tuyenSinh.themThiSinh();
                    break;
                case 2:
                    tuyenSinh.disPlayThiSinh();
                    break;
                case 3:
                    System.out.println("Nhập SBD:");
                    int sbd = sc.nextInt();
                    sc.nextLine();
                    tuyenSinh.timThiSinh(sbd);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("phím bấm không hợp lệ!");
            }
        }
    }
}
