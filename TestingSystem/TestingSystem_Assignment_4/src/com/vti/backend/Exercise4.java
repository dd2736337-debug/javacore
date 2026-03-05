package com.vti.backend;

import com.vti.entity.Circle;
import com.vti.entity.Student;

public class Exercise4 {
    public void question_1() {
        Student student1 = new Student("Dương", "Hồ Chí Minh");
        student1.setDiemHocLuc(5.5);
        student1.addDiemHocLuc(1);
        student1.inThongTin();
    }

    public void question_2() {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(3, "blue");

        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());

        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());

        System.out.println(circle3);
        System.out.println("Area: " + circle3.getArea());

    }
}
