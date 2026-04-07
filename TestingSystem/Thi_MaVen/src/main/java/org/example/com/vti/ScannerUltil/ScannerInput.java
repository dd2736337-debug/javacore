package org.example.com.vti.ScannerUltil;

import java.util.Scanner;

public class ScannerInput {
    private static final Scanner sc = new Scanner(System.in);

    //-----Int------
    public static int nextInt() {
        while (true) {
            try {
                int n = Integer.parseInt(sc.nextLine().trim());
                if (n >= 0) {
                    return n;
                } else {
                    System.out.print("Phải >=0, Nhập lại: ");
                }
            } catch (Exception e) {
                System.out.print("Sai định dạng! Nhập lại số nguyên: ");
            }
        }
    }

    //-----Double-----
    public static double nextDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine().trim().replace(",", "."));
            } catch (Exception e) {
                System.out.print("Sai định dạng! Nhập Lại số thực");
            }
        }
    }

    //------String-------
    public static String nextString() {
        while (true) {
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) return input;
            System.out.print("Không được để trống! Nhập lại: ");
        }
    }

    //----Email------

    public static String nextEmail() {
        while (true) {
            String email = sc.nextLine().trim();
            if (email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
                return email;
            }
            System.out.print("Email không hợp lệ! Nhập lại: ");
        }
    }

    //---------Password------

    public static String nextPassWord() {
        while (true) {
            String pass = sc.nextLine().trim();
            if (pass.matches("^(?=.*[A-Za-z])(?=.*\\d).{6,}$")) {
                return pass;
            }
            System.out.print("Password phải >=6 ký tự ,có cả chữ và số! Nhập lại: ");
        }
    }

    public static Float nextFloat() {
        while (true) {
            try {
                return Float.parseFloat(sc.nextLine().trim().replace(",", "."));
            } catch (Exception e) {
                System.out.print("Lỗi sai đinh dạng! Nhập lại: ");
            }
        }
    }
}
