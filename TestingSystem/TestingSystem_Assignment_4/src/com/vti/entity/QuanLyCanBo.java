package com.vti.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
  private ArrayList<CanBo> danhSach=new ArrayList<>();
  Scanner sc=new Scanner(System.in);

  public void addCanBo(){
      System.out.println("1.Công Nhân");
      System.out.println("2.Kỹ Sư");
      System.out.println("3.NhânVien");

      int choice=sc.nextInt();


      System.out.println("Nhập tên: ");
      String name=new Scanner(System.in).nextLine();
      System.out.println("Nhập tuổi");
      int tuoi=new Scanner(System.in).nextInt();
      System.out.println("Nhập giới tính: ");
      String gioitinh=new Scanner(System.in).nextLine();
      System.out.println("Nhập địa chỉ: ");
      String diachi=new Scanner(System.in).nextLine();
      switch (choice){
          case 1:
              System.out.println("nhập bậc: ");
              int bac=new Scanner(System.in).nextInt();
              danhSach.add(new CongNhan(name,tuoi,gioitinh,diachi,bac));
              break;
          case 2:
              System.out.println("Nhập ngành đào tạo: ");
              String nganh=new Scanner(System.in).nextLine();
              danhSach.add(new KySu(name,tuoi,gioitinh,diachi,nganh));
              break;
          case 3:
              System.out.println("Nhập công việc: ");
              String congViec=new Scanner(System.in).nextLine();
              danhSach.add(new NhanVien(name,tuoi,gioitinh,diachi,congViec));
              break;
      }
  }
  //tìm theo tên
    public void search(){
        System.out.println("Nhập tên cần tìm: ");
        String name=new Scanner(System.in).nextLine();
        for (CanBo canbo:danhSach){
            if (canbo.getName().equals(name)){
                canbo.display();
            }
        }
    }
    //hiển thị danh sách
    public void showList(){
      for (CanBo canbo:danhSach){
          canbo.display();
          System.out.println("----------");
      }
    }
    //xóa theo tên
    public void delete(){
        System.out.println("Nhập tên cần xóa: ");
        String name=new Scanner(System.in).nextLine();
        danhSach.removeIf(cb -> cb.getName().equalsIgnoreCase(name));
    }

}
