package org.example.froend;

import org.example.utils.JdbcUtils;
import org.example.utils.ScannerUtils;

import java.sql.SQLException;

public class Program {
    static Funcion funcion=new Funcion();
    public static void main(String[] args) throws SQLException {
        int choice;
        do {
            printMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            choice=ScannerUtils.nextInt();
            switch (choice){
                case 1:
                    funcion.findManufacturerById();
                    break;
                case 2:
                    funcion.showAllProduct();
                    break;
                case 3:
                    funcion.deleteById();
                    break;
                case 4:
                    funcion.addProduct();
                    break;
                case 5:
                    funcion.checkmail();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! ");
            }

        }while (choice!=0);

    }

    private static void printMenu(){
        int width=48;
        String line="+"+"-".repeat(width+2)+"+";
        System.out.println(line);
        System.out.printf("| %-"+width+"s |\n", "Mời bạn chọn chức năng");
        System.out.println(line);
        System.out.printf("| %-"+width+"s |\n", "1. Tìm nhà sản xuất theo id");
        System.out.printf("| %-"+width+"s |\n", "2. Hiển thị danh sách sản phẩm");
        System.out.printf("| %-"+width+"s |\n", "3. Xóa sản phẩm theo ID");
        System.out.printf("| %-"+width+"s |\n", "4. Cập nhật sản phẩm");
        System.out.printf("| %-"+width+"s |\n", "5. Kiểm tra Email");
        System.out.printf("| %-"+width+"s |\n", "0. Thoát");
        System.out.println(line);
    }
}
