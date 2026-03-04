package Optional;

import entity.Group;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise4 {
    //Question 1:
    //Nhập một xâu kí tự,
    // đếm số lượng các từ trong xâu kí tự đó
    // (các từ có thể cách nhau bằng nhiều khoảng trắng );
    public static void question_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi kí tự: ");
        String s = sc.nextLine().trim();
        String[] mang = s.split("\\s+");
        System.out.println(mang.length);
    }

    //Question 2:
    //Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
    public static void question_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi kí tự s1: ");
        String s1 = sc.nextLine().trim();
        System.out.println("Mời nhập chuỗi kí tự s2: ");
        String s2 = sc.nextLine().trim();
        System.out.println(s2 + " " + s1);
    }

    //Question 3:
    //Viết chương trình để người dùng nhập vào tên và kiểm tra,
    // nếu tên chư viết hoa chữ cái đầu thì viết hoa lên
    public static void question_3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        name = name.trim().toLowerCase();//bỏ khoảng trắng dư+đưa về chữ thường
        String[] mang = name.split("\\s+");//tách theo nhiều khoảng trắng
        StringBuilder sb = new StringBuilder();
        for (String m : mang) {
            sb.append(Character.toUpperCase(m.charAt(0)))
                    .append(m.substring(1)).append(" ");
        }
        System.out.println("Tên Là: " + sb.toString().trim());
    }

    //estion 4:
    //Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra VD:
    // Người dùng nhập vào "Nam", hệ thống sẽ in ra
    //"Ký tự thứ 1 là: N"
    //"Ký tự thứ 1 là: A"
    //"Ký tự thứ 1 là: M"
    public static void question_4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhâp tên: ");
        String name = sc.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Ký tự thứ " + (i + 1) + " là: " + name.charAt(i));
        }
    }

    //Question 5:
    //Viết chương trình để người dùng nhập vào họ,
    // sau đó yêu cầu người dùng nhập vào tên và
    // hệ thống sẽ in ra họ và tên đầy đủ
    public static void question_5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Họ: ");
        String ho = sc.nextLine();
        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();
        System.out.println("Họ và tên: " + ho + " " + ten);

    }

    //on 6:
    //Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ tách ra họ, tên , tên đệm VD:
    //	 	Người dùng nhập vào "Nguyễn Văn Nam"
    //	 	Hệ thống sẽ in ra
    //	 	 	"Họ là: Nguyễn"
    //"Tên đệm là: Văn"
    //"Tên là: Nam"
    public static void question_6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên : ");
        String fullName = sc.nextLine().trim().replaceAll("\\s+", " ");
        String[] mang = fullName.split(" ");
        String ho = mang[0];
        String ten = mang[mang.length - 1];
        String tenDem = "";
        for (int i = 1; i < mang.length; i++) {
            tenDem += mang[i] + " ";
        }
        System.out.println("Họ là: " + ho);
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên là: " + ten);
    }

    //Question 7:
    //Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
    // chuẩn hóa họ và tên của họ như sau:
    //Xóa dấu cách ở đầu và cuối và
    // giữa của chuỗi người dùng nhập vào
    //VD: Nếu người dùng nhập vào "
    // nguyễn văn nam   " thì sẽ chuẩn hóa thành "nguyễn văn nam"
    //Viết hoa chữ cái mỗi từ của người dùng VD
    // : Nếu người dùng nhập vào "   nguyễn văn nam   " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"
    public static void question_7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
        String name = sc.nextLine();
        name = name.trim().toLowerCase();//bỏ khoảng trắng dư+đưa về chữ thường
        String[] mang = name.split("\\s+");//tách theo nhiều khoảng trắng
        StringBuilder sb = new StringBuilder();
        for (String m : mang) {
            sb.append(Character.toUpperCase(m.charAt(0)))
                    .append(m.substring(1)).append(" ");
        }
        System.out.println("Họ và tên sau chuẩn hóa: " + sb.toString().trim());
    }

    //Question 8:
    //In ra tất cả các group có chứa chữ "Java"
    public static void question_8(Group[] groups) {
        for (Group group : groups) {
            if (group.groupName.contains("Java")) {
                System.out.println(group.groupName);
            }
        }
    }

    //Question 9:
    //In ra tất cả các group "Java"
    public static void question_9(Group[] groups) {
        if (groups == null || groups.length == 0) {
            System.out.println("Gruop không  tồn tại!");
            return;
        }
        boolean check = false;
        for (Group group : groups) {
            if (group != null && group.groupName != null && group.groupName.contains("Java")) {
                check = true;
                System.out.println("ID: " + group.groupId);
                System.out.println("Name: " + group.groupName);
                if (group.creator != null) {
                    System.out.println("Account: " + group.creator.fullName);
                } else {
                    System.out.println("Account: chưa có ");
                }
                if (group.createDate != null) {
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    System.out.println("Ngày tạo: " + dtf.format(group.createDate));
                } else {
                    System.out.println("Ngày tạo: chưa có");
                }
            }
            if (!check) {
                System.out.println("Không tìm thấy Gruop Java");
            }
        }
    }

    //Question 10 (Optional):
    //Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
    //Nếu có xuất ra “OK” ngược lại “KO”.
    //Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.
    public static void question_10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi");
        String chuoi = sc.nextLine();
        String daoChuoi = new StringBuilder(chuoi).reverse().toString();
        if (daoChuoi.equals(chuoi)) {
            System.out.println("Đây là chuỗi đối xứng");
        } else {
            System.out.println("Không phải chuỗi đối xứng ");
        }
    }

    //Question 11 (Optional): Count special Character
    //Tìm số lần xuất hiện ký tự "a" trong chuỗi
    public static void question_11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String chuoi = sc.nextLine();
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println("Sô lần kí tự 'a' : " + count);
    }

    //    Question 12 (Optional): Reverse String
//    Đảo ngược chuỗi sử dụng vòng lặp
    public static void question_12() {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập chuỗi");
        String chuoi = sc.nextLine();
        String chuoiDao = "";
        for (int i = chuoi.length() - 1; i >= 0; i--) {
            chuoiDao += chuoi.charAt(i);
        }
        System.out.println("Chuỗi đảo ngược là: " + chuoiDao);
    }

    //Question 13 (Optional): String not contains digit
    //Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
    //
    //Ví dụ:
    //"abc" => true
    //
    //"1abc", "abc1", "123", "a1bc", null => false
    public static void question_13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String chuoi = sc.nextLine();
        if (chuoi == null) {
            System.out.println(false);
            return;
        }
        for (int i = 0; i < chuoi.length(); i++) {
            if (Character.isDigit(chuoi.charAt(i))) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    //uestion 14 (Optional): Replace character
    //Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
    //Ví dụ:
    //"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
    public static void question_14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String chuoi = sc.nextLine();
        System.out.println("Nhập kí tự cần thay: ");
        char kitu = sc.nextLine().charAt(0);
        System.out.println("Nhập kí tự mới: ");
        char kituMoi = sc.nextLine().charAt(0);
        chuoi = chuoi.replace(kitu, kituMoi);
        System.out.println("Chuỗi được thay mới là: " + chuoi);
    }

    //Question 15 (Optional): Revert string by word
    //Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
    public static void question_15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi");
        String chuoi = sc.nextLine().trim();
        String[] mang = chuoi.split(" ");
        String chuoiDao = "";
        for (int i = 0; i < mang.length; i++) {
            StringBuilder sb = new StringBuilder(mang[i]);
            chuoiDao += sb.reverse();
            if (i < mang.length - 1) {
                chuoiDao += " ";
            }
        }
        System.out.println("chuỗi đảo là: " + chuoiDao);
    }

    //Question 16 (Optional):
    //Cho một chuỗi str và số nguyên n >= 0.
    // Chia chuỗi str ra làm các phần bằng nhau với n ký tự.
    // Nếu chuỗi không chia được thì xuất ra màn hình “KO”.
    public static void question_16() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String chuoi = sc.nextLine();
        System.out.println("Mời nhập số nguyên n: ");
        int n = new Scanner(System.in).nextInt();
        if (n <= 0 || chuoi.length() % n != 0) {
            System.out.println("KO");
            return;
        }
        for (int i = 0; i < chuoi.length(); i++) {
            System.out.println(chuoi.charAt(i));
        }
    }
}
