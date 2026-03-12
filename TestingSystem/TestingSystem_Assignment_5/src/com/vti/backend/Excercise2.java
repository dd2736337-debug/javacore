package com.vti.backend;

import com.vti.entity.*;

import java.util.ArrayList;

public class Excercise2 {
    public static void question_1() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Văn A", 1));
        students.add(new Student(2, "Nguyễn Văn B", 1));
        students.add(new Student(3, "Nguyễn Văn C ", 1));
        students.add(new Student(4, "Nguyễn Văn D", 2));
        students.add(new Student(5, "Nguyễn Văn E", 2));
        students.add(new Student(6, "Nguyễn Văn F", 2));
        students.add(new Student(7, "Nguyễn Văn G", 3));
        students.add(new Student(8, "Nguyễn Văn H", 3));
        students.add(new Student(9, "Nguyễn Văn I", 3));
        students.add(new Student(10, "Nguyễn Văn K", 3));

        System.out.println("Điểm danh:");
        for (Student s : students) {
            s.diemDanh();
        }

        System.out.println("\nNhóm 1 học bài:");
        for (Student s : students) {
            if (s.getGroup() == 1) {
                s.hocBai();
            }
        }

        System.out.println("\nNhóm 2 đi dọn vệ sinh:");
        for (Student s : students) {
            if (s.getGroup() == 2) {
                s.veSinh();
            }
        }
        System.out.println("------------");
        System.out.println("------------");
        System.out.println("------------");

    }


    public static void question_3() {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(5, 7);
        System.out.println("Chu Vi Hình Chữ Nhật:" + hinhChuNhat.chuVi());
        System.out.println("Diênn Tích Hình Chữ Nhật:" + hinhChuNhat.dienTich());

        System.out.println("----------");
        HinhVuong hinhVuong = new HinhVuong(4);
        System.out.println("Chu Vi Hình Vuông:" + hinhVuong.chuVi());
        System.out.println("Diện Tích Hình Vuông:" + hinhVuong.dienTich());

        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
    }

    public static void question_4() {
        MyMath myMath = new MyMath();
        System.out.println("Sum int: " + myMath.sum(1, 2));
        byte a = 2;
        byte b = 3;
        System.out.println("Sum byte: " + myMath.sum(a, b));
        System.out.println("Sum Float: " + myMath.sum(1f, 2f));

        System.out.println("------------");
        System.out.println();
        System.out.println();

    }

    public static void question_5() {
        DienThoaiThongMinh dienThoaiThongMinh = new DienThoaiThongMinh();
        dienThoaiThongMinh.nghe();
        dienThoaiThongMinh.goi();
        dienThoaiThongMinh.guiTinNhan();
        dienThoaiThongMinh.nhanTinNhan();
        dienThoaiThongMinh.chupHinh();
        dienThoaiThongMinh.tanCong();
    }

}
