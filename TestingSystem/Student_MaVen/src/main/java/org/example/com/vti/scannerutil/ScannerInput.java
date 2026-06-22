package org.example.com.vti.scannerutil;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ScannerInput {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static int nextInt() {
        while (true) {
            try {
                return Integer.parseInt(SCANNER.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.print("Sai đinh dạng! Nhập lại số nguyên: ");
            }
        }
    }

    public static int nextNonNegativeInt() {
        while (true) {
            int number = nextInt();
            if (number >= 0) {
                return number;
            }
            System.out.print("Phải >= 0, nhập lại: ");
        }
    }

    public static double nextDouble() {
        while (true) {
            try {
                return Double.parseDouble(SCANNER.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.print("Sai định dạng! Nhập lại số thực: ");
            }
        }
    }

    public static float nextFloat() {
        while (true) {
            try {
                return Float.parseFloat(SCANNER.nextLine().trim().replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.print("Sai định dạng! Nhập lại số thực: ");
            }
        }
    }

    public static String nextString() {
        while (true) {
            String input = SCANNER.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.print("Không được để trống! Nhập lại: ");
        }
    }

    public static String nextEmail() {
        while (true) {
            String email = SCANNER.nextLine().trim();
            if (email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")) {
                return email;
            }
            System.out.print("Email không hợp lệ! Nhập lại: ");
        }
    }

    public static String nextPassword() {
        while (true) {
            String password = SCANNER.nextLine().trim();
            if (password.matches(
                    "^(?=.*[a-z])" +        // chữ thường
                            "(?=.*[A-Z])" +        // chữ hoa
                            "(?=.*\\d)" +          // số
                            "(?=.*[@#$%^&+!])" +   // ký tự đặc biệt
                            "(?=\\S+$)" +          // không khoảng trắng
                            ".{8,20}$"             // 8-20 ký tự
            )) {
                return password;
            }

            System.out.print("Password phải 8-20 ký tự, gồm chữ hoa, chữ thường, số, " +
                            "ký tự đặc biệt (@#$%^&+!), không có khoảng trắng. Nhập lại: ");
        }
    }

    public static LocalDate inputDate() {

        while (true) {
            try {
                String input =SCANNER.nextLine();

                return LocalDate.parse(input);

            } catch (DateTimeParseException e) {
                System.out.println("Sai định dạng! Vui lòng nhập lại (yyyy-MM-dd)");
            }
        }
    }
}


