package com.vti.entity;

public class Student {
    //Tất cả các property sẽ để là private để các class khác không chỉnh sửa hay nhìn thấy
    private int id;
    private final String name;
    private final String hometown;
    private double diemHocLuc;

    // Tạo constructor cho phép khi khởi tạo mỗi student thì
    // người dùng sẽ nhập vào tên, hometown và có điểm học lực = 0
    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.diemHocLuc = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getHometown() {
        return hometown;
    }

    public double getDiemHocLuc() {
        return diemHocLuc;
    }

    //Tạo 1 method cho phép set điểm vào
    public void setDiemHocLuc(double diemHocLuc) {
        this.diemHocLuc = diemHocLuc;
    }

    //Tạo 1 method cho phép cộng thêm điểm
    public void addDiemHocLuc(double diemHocLuc) {
        this.diemHocLuc += diemHocLuc;
    }

    //Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên, điểm học lực
    // ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm > 4.0 và < 6.0
    // thì sẽ in ra là trung bình,
    // nếu điểm > 6.0 và < 8.0 thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
    // Demo các chức năng trên bằng class ở front-end.
    public void inThongTin() {
        String hocLuc;
        if (diemHocLuc <= 4.0) {
            hocLuc = "Yếu";
        } else if (diemHocLuc > 4.0 && diemHocLuc <= 6.0) {
            hocLuc = "Trung Bình";
        } else if (diemHocLuc > 6.0 && diemHocLuc <= 8.0) {
            hocLuc = "Khá";
        } else {
            hocLuc = "Giỏi";
        }
        System.out.println(name + "-" + diemHocLuc + "-" + hocLuc);
    }


}
