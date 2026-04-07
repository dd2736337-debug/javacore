package org.example.com.vti.forend;

import org.example.com.vti.ScannerUltil.ScannerInput;

public class Program {
    public static void main(String[] args) {
        while (true) {
            System.out.println("---------Menu----------");
            System.out.println("1.       \n"+
                    "2.               \n"+
                    "3.                \n"+
                    "4.                \n"+
                    "5.                 \n");

            int luaChon= ScannerInput.nextInt();
            switch (luaChon){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                default:
            }
        }
    }
}