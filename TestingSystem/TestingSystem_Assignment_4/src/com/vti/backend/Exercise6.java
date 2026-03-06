package com.vti.backend;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.VietnamesePhone;
import com.vti.entity.Waiter;

public class Exercise6 {
    //Question 1: abstract class & abstract method
    //Tạo 1 class Phone để lưu thông tin liên lạc, trong Phone có chứa 1 property
    // có kiểu dữ liệu là Array contacts, trong từng contact có lưu thông tin number, name
    //Tạo các abstract method
    //void insertContact(String name, String phone)
    //void removeContact(String name)
    //void updateContact(String name, String newPhone)
    //void searchContact(String name)
    //Tạo class VietnamesePhone kế thừa Phone và triển khai các method abstract
    //Viết chương trình demo

    public static void question_1() {
        VietnamesePhone vietnamesePhone = new VietnamesePhone();
        vietnamesePhone.insertContact("Nam", "0946723145");
        vietnamesePhone.insertContact("An", "0945533145");

        vietnamesePhone.searchContact("Nam");
        vietnamesePhone.updateContact("Nam", "0785632456");
        vietnamesePhone.searchContact("Nam");
        vietnamesePhone.removeContact("An");
    }

    //Question 2 (Optional):
    //Hãy xây dựng 1 class User với các thuộc tính name kiểu String và salary ratio kiểu double.
    //Viết các hàm cho phép nhập và trả về name, salary ratio.
    //Viết hàm calculatePay() dạng abstract trả về thu nhập của nhân viên, kiểu double.
    //Viết hàm displayInfor()
    public static void question_2_3() {
        Employee employee=new Employee("Nam",2.5);
        Manager manager=new Manager("An",3);
        Waiter waiter=new Waiter("Đại",1.8);

        employee.displayInfor();
        System.out.println("-------");
        manager.displayInfor();
        System.out.println("-------");
        waiter.displayInfor();
        System.out.println("-------");

    }
}
