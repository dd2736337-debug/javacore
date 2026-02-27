package frontend;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise2 {
    //Question 1:  Khai báo 1 số nguyên = 5 và
    // sử dụng lệnh System out printf để in ra số nguyên đó
    public static void question_1() {
        int a = 5;
        System.out.printf("Số nguên là %d", a);
    }

    //Question 2:
    //Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf
    // để in ra số nguyên đó thành định dạng như sau: 100,000,000
    public static void question_2() {
        int a = 100000000;
        System.out.printf("Số nguyên %,d", a);
    }

    //Question 3:
    //Khai báo 1 số thực = 5,567098 và sử dụng lệnh
    //System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau
    public static void question_3() {
        double a = 5.567098;
        System.out.printf("Số thực %.4f", a);
    }

    //Question 4:
    //Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định dạng như sau:
    //Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
    //Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
    public static void question_4() {
        String fullName = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân. ", fullName);
    }

    //Question 5:
    //Lấy thời gian bây giờ và in ra theo định dạng sau:
    //24/04/2020 11h:16p:20s
    public static void question_5() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");
        System.out.printf(now.format(formatter));
    }


}
