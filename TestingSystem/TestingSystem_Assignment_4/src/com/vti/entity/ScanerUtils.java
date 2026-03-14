package com.vti.entity;

import java.util.Scanner;

public class ScanerUtils {
    private static Scanner sc = new Scanner(System.in);

    public static int nextInt() {
        return Integer.parseInt(sc.nextLine());
    }

    public static double nextDouble() {
        return Double.parseDouble(sc.nextLine());
    }

    public static float nextFloat() {
        return Float.parseFloat(sc.nextLine());
    }

    public static String nextLine() {
        return sc.nextLine();
    }
}
