package org.example.com.vti.frontend;

import org.example.com.vti.scannerutil.ScannerInput;

public class Program {
    static Funtion funtion=new Funtion();
    public static void main(String[] args) {
        while (true) {
            printMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = ScannerInput.nextNonNegativeInt();
            switch (choice) {
                case 1:
                    funtion.showStudent();
                    break;
                case 2:
                    funtion.insert();
                    break;
                case 3:
                    funtion.updateMajor();
                    break;
                case 4:
                    funtion.deleteById();
                    break;
                case 5:
                    funtion.searchByMajor();
                    break;
                case 6:
                    funtion.findById();
                    break;
                case 7:
                    funtion.checkPassWord();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Nhập không lệ! Nhập lại: ");
            }
        }
    }

    private static void printMenu(){
        int width=70;
        String line="+"+"-".repeat(width+2)+"+";
        System.out.println(line);
        System.out.printf("| %-"+width+"s |\n", "Mời bạn chọn chức năng");
        System.out.println(line);
        System.out.printf("| %-"+width+"s |\n", "1. Xem danh sách thông tin nhân viên");
        System.out.printf("| %-"+width+"s |\n", "2. Thêm Sinh Viên Mới");
        System.out.printf("| %-"+width+"s |\n", "3. Cập nhật chuyên ngàng cho sinh viên");
        System.out.printf("| %-"+width+"s |\n", "4. Xóa sinh viên theo id");
        System.out.printf("| %-"+width+"s |\n", "5. Tìm kiếm sinh viên theo chuyên ngành");
        System.out.printf("| %-"+width+"s |\n", "6. Tìm kiếm giảng viên theo id");
        System.out.printf("| %-"+width+"s |\n", "7. chức năng kiểm tra password");
        System.out.printf("| %-"+width+"s |\n", "8. Exit");
        System.out.println(line);
    }
}
