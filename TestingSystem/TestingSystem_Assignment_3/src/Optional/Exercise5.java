package Optional;

import entity.Department;

import java.util.Arrays;

public class Exercise5 {
    //Question 1:
    //In ra thông tin của phòng ban thứ 1 (sử dụng toString())
    public static void question_1(Department[] departments) {
        if (departments == null || departments.length == 0) {
            System.out.println("Chưa có phòng ban");
            return;
        }
        System.out.println(departments[0].toString());

    }

    //Question 2:
    //In ra thông tin của tất cả phòng ban (sử dụng toString())
    public static void question_2(Department[] departments) {
        if (departments == null || departments.length == 0) {
            System.out.println("Chưa cho phòng ban");
            return;
        }
        for (Department department : departments) {
            if (department != null) {
                System.out.println(department);
            }
        }
    }

    //    Question 3:
//    In ra địa chỉ của phòng ban thứ 1
    public static void question_3(Department[] departments) {
        if (departments == null || departments.length == 0 || departments[0] == null) {
            System.out.println("Chưa có phòng ban");
            return;
        }
        System.out.println("Địa chỉ: " + Integer.toHexString(departments[0].hashCode()));
    }

    //Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
    public static void question_4(Department[] departments) {
        if (departments == null || departments.length == 0 || departments[0] == null) {
            System.out.println("Chưa có phòng ban");
            return;
        }
        if (departments[0].departmentName != null || departments[0].departmentName.equals("Phòng A")) {
            System.out.println("Đây là Phòng A");
        } else {
            System.out.println("Đây không phải Phòng A");
        }
    }

    //Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau không
    // (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
    public static void question_5(Department[] departments) {
        if (departments == null || departments.length == 0 || departments[0] == null || departments[1] == null) {
            System.out.println("Chưa có phòng ban");
            return;
        }
        if (departments[0].departmentName != null && departments[0].departmentName.equals(departments[1].departmentName)) {
            System.out.println("Hai phòng ban này bằng nhau");
        } else {
            System.out.println("Hai phòng ban này khác nhau");
        }
    }

    //Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD) VD:
    //	 	Accounting
    //Boss of director
    //Marketing
    //Sale
    //Waiting room
    public static void question_6() {
        Department[] departments = new Department[5];
        departments[0] = new Department(1, "Accounting");
        departments[1] = new Department(2, "Boss of director");
        departments[2] = new Department(3, "Marketing");
        departments[3] = new Department(4, "Sale");
        departments[4] = new Department(5, "Waiting room");
        Arrays.sort(departments, (d1, d2) -> d1.departmentName.compareTo(d2.departmentName));
        for (Department department : departments) {
            System.out.println(department.departmentName);
        }
    }

    //Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban,
    // sau đó in ra danh sách phòng ban được sắp xếp theo tên VD:
    //Accounting
    //Boss of director
    // Marketing
    // waiting room
    // Sale
    public static void question_7() {
        Department[] departments = new Department[5];
        departments[0] = new Department(1, "Sale");
        departments[1] = new Department(2, "Marketing");
        departments[2] = new Department(3, "Accounting");
        departments[3] = new Department(4, "Waiting room");
        departments[4] = new Department(5, "Boss of director");
        Arrays.sort(departments,
                (d1, d2) -> d1.departmentName.compareTo(d2.departmentName));
        for (Department d : departments) {
            System.out.println(d.departmentName + " ");
        }
    }


}
