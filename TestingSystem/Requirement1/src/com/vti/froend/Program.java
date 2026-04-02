package com.vti.froend;


import com.vti.Util.ScannerUltil;

public class Program {
    public static void main(String[] args) {
        menu_Manager();

    }

    public static void menu_Manager(){
        Funtion funtion = new Funtion();
        while (true) {
            System.out.println("------Menu-----");
            System.out.println(
                    "1.Hiện thị thông tin Manager\n" +
                    "2.Thoát!");
            int choice = ScannerUltil.nextInt();
            switch (choice) {
                case 1:
                    funtion.getUserByProjectId();
                    break;
                case 2:
                    return;
            }

        }
    }
}