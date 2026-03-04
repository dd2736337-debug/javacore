package Optional;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    //Question 1:
    //Khai báo 2 số lương có kiểu dữ liệu là float.
    //Khởi tạo Lương của Account 1 là 5240.5 $
    //Khởi tạo Lương của Account 2 là 10970.055$
    //
    //Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
    //Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
    public static void question_1() {
        float luong_1 = 5240.5f;
        float luong_2 = 10970.055f;

        int luong_1_convert = (int) luong_1;
        int luong_2_convert = (int) luong_2;
        System.out.println(luong_1_convert);
        System.out.println(luong_2_convert);
    }

    //Question 2:
    //Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)
    public static void question_2() {
        Random random = new Random();
        int number = random.nextInt(100000);
        System.out.printf("%05d", number);
    }

    //    Question 3:
//    Lấy 2 số cuối của số ở Question 2 và in ra.
//    Gợi ý:
//    Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//    Cách 2: chia lấy dư số đó cho 100
    public static void question_3() {
        Random random = new Random();
        int number = random.nextInt(100000);
        System.out.printf("%05d", number);
        //Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
        String numberStr = String.format("%05d", number);
        String soCuoi = numberStr.substring(3);
        System.out.println("Hai số cuối là : " + soCuoi);
        //Cách 2: chia lấy dư số đó cho 100
        int n = number % 100;
        System.out.printf("2 số cuối là: %02d", n);
    }

    //Question 4:
    //Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
    public static void question_4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Mời nhập a: ");
        int a = input.nextInt();
        System.out.println("Mời nhập b: ");
        int b = input.nextInt();
        if (b == 0) {
            System.out.println("Không thể chia cho 0");
            return;
        }
        System.out.println("thương của chúng: " + (double) a / b);
    }


}
