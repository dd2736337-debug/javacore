package com.vti.backend;

import com.vti.entity.*;

import java.util.Scanner;

public class Exercise5 {
    public void question_1() {
        CongNhan congNhan = new CongNhan("Dương", 25, "Nam", "Hà Nội", 5);
        KySu kySu = new KySu("Bình", 30, "Nam", "Hồ Chí Minh", "IT");
        NhanVien nhanVien = new NhanVien("Hương", 35, "Nữ", "Đà Nẵng", "Kế Toán");
        congNhan.display();
        kySu.display();
        nhanVien.display();
    }

    public void question_2() {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        while (true) {
            System.out.println("1.Thêm Cán Bộ");
            System.out.println("2.Tìm Cán Bộ");
            System.out.println("3.Hiển thị danh sách");
            System.out.println("4.Xóa Cán Bộ");
            System.out.println("5.Thoát");
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    quanLyCanBo.addCanBo();
                    break;
                case 2:
                    quanLyCanBo.search();
                    break;
                case 3:
                    quanLyCanBo.showList();
                    break;
                case 4:
                    quanLyCanBo.delete();
                    break;
                case 5:
                    return;
            }
        }
    }

    //Hãy khởi tạo Object HighSchoolStudent với các giá trị:
    // id = 1, name = "Nam", clazz = "Chuyên Văn", desiredUniversity = "Đại học công nghệ"
    public void question_3() {
        HighSchoolStudent student = new HighSchoolStudent(1, "Nam", "Chuyên Văn", "Đại Học Công Nghệ");
        System.out.println(student);
    }


    //    Xây dựng chương trình để quản lý tài liệu (QLTV) cho thư viện một cách hiệu quả.
//    Xây dựng lớp QuanLySach có các chức năng sau
//    Thêm mới tài liêu: Sách, tạp chí, báo.
//    Xoá tài liệu theo mã tài liệu.
//    Hiện thị thông tin về tài liệu.
//    Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo.
//    Thoát khỏi chương trình.
    public void question_4() {
        QuanLySach quanLySach1 = new QuanLySach();
        Sach sach1 = new Sach(1, "Kim Dong", 100, "NamCao", 200);
        TapChi tapChi1 = new TapChi(2, "Tre", 50, 10, 3);
        Bao bao = new Bao(3, "Thanh Niên", 30, "12-03-2024");

        quanLySach1.themTaiLieu(sach1);
        quanLySach1.themTaiLieu(tapChi1);
        quanLySach1.themTaiLieu(bao);
        quanLySach1.hienThiThongTin();

        System.out.println("-----Sách----");
        quanLySach1.timSach();
    }

}
