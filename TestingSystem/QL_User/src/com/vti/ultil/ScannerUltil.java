package com.vti.ultil;

import java.util.Scanner;

public class ScannerUltil {
    static Scanner sc = new Scanner(System.in);

    public static int nextInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn phải nhập vào một số");
            }
        }
    }

    public static double nextDouble() {
        while (true) {
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Bạn phải nhập vào một số thực(double)");
            }
        }
    }

    public static float nextFloat() {
        while (true) {
            try {
                return Float.parseFloat(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Sai định dạng nhập lại:");
            }
        }
    }

    public static String nextLine() {
        return sc.nextLine();
    }
}
