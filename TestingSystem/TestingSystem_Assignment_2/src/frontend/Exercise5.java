package frontend;

import entity.Account;
import entity.Department;
import entity.Position;
import entity.PositionName;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise5 {
    //Question 1:
    //Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình

    public static void question_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số thứ 1: ");
        int so1 = sc.nextInt();
        System.out.println("Mời nhập vào số thứ 2: ");
        int so2 = sc.nextInt();
        System.out.println("Mời nhập vào số thứ 3: ");
        int so3 = sc.nextInt();
        System.out.println("Ba số vừa nhập là: " + so1 + "," + so2 + " ," + so3);
    }

    //Question 2:
    //Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
    public static void question_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số thực thứ 1: ");
        float soThuc1 = sc.nextFloat();
        System.out.println("Mời nhập vào số thực thứ 2: ");
        float soThuc2 = sc.nextFloat();
        System.out.println("Hai số thực vừa nhập là: " + soThuc1 + "," + soThuc2);

    }

    //Question 3:
    //Viết lệnh cho phép người dùng nhập họ và tên
    public static void question_3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập họ và tên");
        String hovaTen = sc.nextLine();
        System.out.println("Họ Và Tên: " + hovaTen);
    }

    //Question 4:
    //Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
    public static void question_4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào ngày sinh: ");
        String s = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngaySinh = LocalDate.parse(s, formatter);
        System.out.println("Ngày sinh của bạn là :" + ngaySinh);

    }

    //Question 5:
    //Viết lệnh cho phép người dùng tạo account (viết thành method)
    // Đối với property Position, Người dùng nhập vào 1 2 3 4 5
    // và vào chương trình sẽ chuyển thành Position.Dev, Position.Test, Position.ScrumMaster, Position.PM
    public static Account question_5() {
        Scanner sc = new Scanner(System.in);
        Account account4 = new Account();
        System.out.println("Nhập email: ");
        account4.email = sc.nextLine();
        System.out.println("nhập fullName: ");
        account4.fullName = sc.nextLine();
        System.out.println("Chọn Position: ");
        System.out.println("1.Dev");
        System.out.println("2.Test");
        System.out.println("3.ScrumMaster");
        System.out.println("4. PM");
        int so = sc.nextInt();
        switch (so) {
            case 1:
                account4.position = new Position();
                account4.position.positionName = PositionName.Dev;
                System.out.println("Nhân Viên Dev");
                break;
            case 2:
                account4.position = new Position();
                account4.position.positionName = PositionName.Test;
                System.out.println("Nhân Viên Test");
                break;
            case 3:
                account4.position = new Position();
                account4.position.positionName = PositionName.ScrumMaster;
                System.out.println("Nhân Viên ScrumMaster");
            case 4:
                account4.position = new Position();
                account4.position.positionName = PositionName.PM;
                System.out.println("Nhân Viên Pm");
            default:
                System.out.println("Lựa chon không hợp lệ");
                break;
        }
        return account4;
    }

    //Question 6:
    //Viết lệnh cho phép người dùng tạo department (viết thành method)
    public static Department question_6() {
        Scanner sc = new Scanner(System.in);
        Department department4 = new Department();
        System.out.println("Nhập departmentId: ");
        department4.departmentId = new Scanner(System.in).nextInt();
        System.out.println("Nhập departmentName: ");
        department4.departmentName = new Scanner(System.in).nextLine();
        return department4;
    }

}
