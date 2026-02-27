package frontend;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise4 {
    //    Question 1:
//    In ngẫu nhiên ra 1 số nguyên
    public static void question_1() {
        Random rd = new Random();
        int ngauNhien = rd.nextInt();
        System.out.println(ngauNhien);
    }

    //Question 2:
    //In ngẫu nhiên ra 1 số thực
    public static void question_2() {
        Random rd = new Random();
        float ngauNhien = rd.nextFloat();
        System.out.println(ngauNhien);
    }

    //
    //Question 3:  Khai báo 1 array bao gồm các tên của các bạn trong lớp,
    // sau đó in ngẫu nhiên ra tên của 1 bạn
    public static void question_3() {
        String[] hoTen = {"Nguyễn A", "Nguyễn B", "Nguyễn C", "Nguyễn D"};
        Random rd = new Random();
        int index = rd.nextInt(hoTen.length);
        System.out.println("Họ Tên: " + hoTen[index]);
    }

    //Question 4:
    //Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-121995
    public static void question_4() {
        LocalDate strart = LocalDate.of(1995, 7, 24);
        LocalDate end = LocalDate.of(1995, 12, 20);
        //đổi sang số
        long startDay = strart.toEpochDay();
        long endDay = end.toEpochDay();
        long radomDay = ThreadLocalRandom.current().nextLong(startDay, endDay + 1);
        LocalDate radomDate = LocalDate.ofEpochDay(radomDay);
        System.out.println("Ngày ngẫu nhiên: " + radomDate);
    }

    //Question 5:
    //Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
    public static void question_5() {
        LocalDate end = LocalDate.now();
        LocalDate start = end.minusYears(1);

        long startDay = start.toEpochDay();
        long endDay = end.toEpochDay();

        long radomDay = ThreadLocalRandom.current().nextLong(startDay, endDay + 1);
        LocalDate radomDate = LocalDate.ofEpochDay(radomDay);
        System.out.println("Ngày ngẫu nhiên: " + radomDate);
    }

    /*   Question 6:
       Lấy ngẫu nhiên 1 ngày trong quá khứ*/
    public static void question_6() {
        LocalDate today = LocalDate.now();
        LocalDate start = today.minusYears(30);
        LocalDate end = today.minusDays(1);

        long startDay = start.toEpochDay();
        long endtDay = end.toEpochDay();

        long radomDay = ThreadLocalRandom.current().nextLong(startDay, endtDay + 1);
        LocalDate radomDate = LocalDate.ofEpochDay(radomDay);
        System.out.println("Ngày ngẫu nhiên trong quá khứ: " + radomDate);
    }

    //Question 7:
    //Lấy ngẫu nhiên 1 số có 3 chữ số
    public static void question_7() {
        Random rd = new Random();
        int n = rd.nextInt(900) + 100;
        System.out.println("số ngẫu nhiên có 3 chữ số: " + n);
    }

}
