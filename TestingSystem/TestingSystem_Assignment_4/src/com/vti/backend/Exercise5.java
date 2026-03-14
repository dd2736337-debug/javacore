package com.vti.backend;

import com.vti.entity.*;

import java.time.LocalDate;
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
        BookManagement bookManagement = new BookManagement();
        while (true) {
            System.out.println("----Menu----");
            System.out.println("1.Thêm mới tài liệu");
            System.out.println("2.Xóa tài liệu");
            System.out.println("3.Hiển thị thông tin");
            System.out.println("4.Tìm tài liệu:");
            System.out.println("5.Thoát Chương Trình");
            int choice = ScanerUtils.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.Book\n2.Magazine\n3.NewsPaper");
                    int choice2 = ScanerUtils.nextInt();
                    System.out.println("idDocument:");
                    String id = ScanerUtils.nextLine();
                    System.out.println("nameNXB:");
                    String nameNXB = ScanerUtils.nextLine();
                    System.out.println("soBanPhatHanh:");
                    int soBanPhatHanh = ScanerUtils.nextInt();
                    if (choice2 == 1) {
                        System.out.println("Tên Tác giả:");
                        String tenTacGia = ScanerUtils.nextLine();
                        System.out.println("Số Trang:");
                        int soTrang = ScanerUtils.nextInt();
                        bookManagement.addDocument(new Book(tenTacGia, soTrang, id, nameNXB, soBanPhatHanh));
                    } else if (choice2 == 2) {
                        System.out.println("Số Phát Hành:");
                        int so = ScanerUtils.nextInt();
                        System.out.println("Tháng Phát Hành");
                        LocalDate month = LocalDate.parse(ScanerUtils.nextLine());
                        bookManagement.addDocument(new Magazine(so, month, id, nameNXB, soBanPhatHanh));
                    } else if (choice2 == 3) {
                        System.out.println("Ngày Phát Hành:");
                        LocalDate day = LocalDate.parse(ScanerUtils.nextLine());
                        bookManagement.addDocument(new NewsPaper(day, id, nameNXB, soBanPhatHanh));
                    }
                    System.out.println("Thêm Thành Công");
                    break;
                case 2:
                    System.out.println("Mã Xóa:");
                    String maXoa = ScanerUtils.nextLine();
                    bookManagement.removeDocument(maXoa);
                    break;
                case 3:
                    bookManagement.disPlay();
                    break;
                case 4:
                    System.out.println("Nhập Loại tài liệu:(1.Book\n2.Magazine\n3.NewsPaper");
                    int choice3 = ScanerUtils.nextInt();
                    if (choice3 == 1) {
                        bookManagement.timTheoLoai("Book");
                    } else if (choice3 == 2) {
                        bookManagement.timTheoLoai("Magazine");
                    } else if (choice3 == 3) {
                        bookManagement.timTheoLoai("NewsPaper");
                    }
                    break;
                case 5:
                    return;

            }
        }
    }

}
