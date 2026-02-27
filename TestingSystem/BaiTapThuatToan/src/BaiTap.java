import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaiTap {
    static Scanner sc = new Scanner(System.in);

    //Bài 1: Tìm ra 1 số lớn nhất trong 1 mảng
    public static void bai_1() {
        System.out.println("Mời nhập vào số lượng phần tử:  ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        int max = mang[0];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            mang[i] = rd.nextInt();
        }
        System.out.println(Arrays.toString(mang));
        for (int i = 0; i < n; i++) {
            if (mang[i] > max) {
                max = mang[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    //Bài 2: Tạo 1 method có 1 tham số int truyền vào, kiểm tra số đó có phải là số nguyên tố hay không?
    public static void bai_2() {
        System.out.println("Mời nhập vào số n: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Đây không phải là số nguyên tố");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(n + " Đây Không phải là số nguyên tố");
                return;
            }
        }
        System.out.println(n + " Là số nguyên tố ");
    }

    //Bài 3: Viết chương trình nhập vào 1 chuỗi sau đó in ra 1 chuỗi đảo ngược của nó
    public static void bai_3() {
        System.out.println("Mời nhập vào 1 chuỗi: ");
        String chuoi = sc.nextLine();
        String chuoidao = new StringBuilder(chuoi).reverse().toString();
        System.out.println("Đây là chuỗi đảo ngược: " + chuoidao);
    }

}
