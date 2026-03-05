package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;

import java.util.Date;

public class Exercise1 {
    //Question 1:
    //Tạo constructor cho department:
    //không có parameters
    //Có 1 parameter là nameDepartment và default id của Department = 0
    //Khởi tạo 1 Object với mỗi constructor ở trên
    public static void question_1() {
        Department department1 = new Department();
        Department department2 = new Department();
        System.out.println("Phòng Ban: " + department2);
    }
//    Question 2:
//    Tạo constructor cho Account:
//    Không có parameters
//    Có các parameter là id, Email, Username, FirstName, LastName
//    (với FullName = FirstName + LastName)
//    Có các parameter là id, Email, Username, FirstName, LastName
//    (với FullName = FirstName + LastName) và
//    Position của User, default createDate = now
//    Có các parameter là id, Email, Username, FirstName, LastName
//    (với FullName = FirstName + LastName) và Position của User, createDate
//    Khởi tạo 1 Object với mỗi constructor ở trên

    public static void question_2() {
        Account account1 = new Account();
        Account account2 = new Account(1, "dai@gmail.com", "user1", "Dương", "Đại");
        Account account3 = new Account(2, "binh@gmail.com", "user2", "Trần", "Bình", "Dev");
        Account account4 = new Account(3, "huong@gmail.com", "user3", "Thị", "Hương", "Test", new Date());
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);
    }

    //uestion 3:
    //Tạo constructor cho Group:
    //không có parameters
    //Có các parameter là GroupName,
    // Creator, array Account[] accounts, CreateDate
    //Có các parameter là GroupName,
    // Creator, array String[] usernames , CreateDate
    //Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các thông tin còn lại = null).
    // Khởi tạo 1 Object với mỗi constructor ở trên
    public static void question_3() {
        String[] usernames = {"user1", "user2", "user3",};
        Account creator = new Account();
        creator.setUserName("admin");
        Account[] accounts = new Account[2];
        accounts[0] = new Account();
        accounts[0].setUserName("user1");
        accounts[1] = new Account();
        accounts[1].setUserName("user2");
        Group group1 = new Group();
        Group group2 = new Group("Java", creator, accounts, new Date());
        Group group3 = new Group("Java", creator, usernames, new Date());
        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);
    }

}
