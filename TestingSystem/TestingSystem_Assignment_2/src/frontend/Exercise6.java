package frontend;

import entity.Account;
import entity.Group;

public class Exercise6 {
    //Question 1:
    //Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
    public static void question_1() {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " là số chẵn");
            }
        }
    }

    //Question 2:
    //Tạo method để in thông tin các account
    public static void question_2(Account[] accounts) {
        if (accounts == null || accounts.length == 0) {
            System.out.println("Account này không tồn tại!");
            return;
        }
        for (Account account : accounts) {
            if (account != null) {
                System.out.println("ID: " + account.accountId);
                System.out.println("userName: " + account.userName);
                System.out.println("fullName: " + account.fullName);
                System.out.println("email: " + account.email);
                String departmentName = (account.department != null) ? account.department.departmentName : "";
                System.out.println("departmentName: " + departmentName);
                String positionName = (account.position != null) ? account.position.positionName.name() : "";
                System.out.println("positionName: " + positionName);
                System.out.println("createDate: " + account.createDate);
                if (account.groups == null || account.groups.length == 0) {
                    System.out.println(" ");
                } else {
                    for (Group group : account.groups) {
                        if (group != null) {
                            System.out.println("GroupName: " + group.groupName);
                        }
                    }
                }

                System.out.println("-------------");

            }
        }
    }

    //    Question 3:
//    Tạo method để in ra các số nguyên dương nhỏ hơn 10
    public static void question_3() {
        int i = 1;
        while (i < 10) {
            System.out.println(i + " là số nguyên duyên nhỏ hơn 10");
            i++;
        }
    }

}
