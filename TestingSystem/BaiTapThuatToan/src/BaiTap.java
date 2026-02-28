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

    //Bài 4: Tạo 1 method có 1 tham số int truyền vào, tính tổng các số từ 1 tới n
    public static void bai_4() {
        System.out.println("Mời nhập vào số n: ");
        int n = sc.nextInt();
        int tong = 0;
        if (n < 1) return;
        for (int i = 1; i <= n; i++) {
            tong += i;
        }
        System.out.println("tổng từ 1 đến n là: " + tong);

    }

    //Bài 5: Tạo 1 method có 2 tham số truyền vào đều có kiểu dữ liệu là int,
    // tìm ước chung lớn nhất của 2 số đó
    public static void bai_5() {
        System.out.println("mời nhập vào a: ");
        int a = Math.abs(sc.nextInt());
        System.out.println("Mời nhập vào b: ");
        int b = Math.abs(sc.nextInt());
        while (a != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }
        System.out.println("UCLN là: " + b);
    }

    //Bài 6: Tạo 1 method có 2 tham số truyền vào đều có kiểu dữ liệu là int,
    // tìm bội chung nhỏ nhất của 2 số đó
    public static void bai_6() {
        System.out.println("Mời nhập vào a: ");
        int a = Math.abs(sc.nextInt());
        System.out.println("Mời nhập vào b: ");
        int b = Math.abs(sc.nextInt());
        int max = Math.max(a, b);
        if (a == 0 || b == 0) {
            System.out.println("Bội chung nhỏ nhất là 0");
            return;
        }
        while (true) {
            if (max % a == 0 && max % b == 0) {
                System.out.println(max + " là bội chung nhỏ nhất");
                break;
            }
            max++;
        }
    }

    //Bài 7: Tạo 1 method có 1 tham số truyền vào có kiểu dữ liệu là String,
    // kiểm tra xem chuỗi đó có phải là chuỗi đối xứng hay không?
    // (Chuỗi đối xứng là chuỗi mà khi đảo ngược các ký tự ta vẫn được chuỗi ban đầu)
    public static void bai_7() {
        System.out.println("Mời nhập vào chuỗi: ");
        String s = sc.nextLine();
        String daochuoi = new StringBuilder(s).reverse().toString();
        if (s.equals(daochuoi)) {
            System.out.println("Đây là chuỗi đối xứng");
        } else {
            System.out.println("Đây không phải chuỗi đối xứng");
        }
    }

    //Bài 8: Viết chương trình để giải phương trình bậc 2.
    // Gợi ý: Phương trình bậc 2 có dạng ax2 + bx + c = 0.
    public static void bai_8() {
        System.out.println("Mời nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Mời nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Mời nhập c: ");
        double c = sc.nextDouble();
        double detal = b * b - (4 * a * c);
        double x1, x2;
        if (a == 0) {
            System.out.println("Đây không phải là phương trình bậc 2");
            return;
        }
        if (detal < 0) {
            System.out.println("Phương Trình Vô Ngiệm");
        } else if (detal == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép x= " + x);
        } else {
            x1 = (-b + Math.sqrt(detal)) / (2 * a);
            x2 = (-b - Math.sqrt(detal)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }
    }

    // Bài 9: Tạo 1 method đầu vào có 3 tham số đều có kiểu dữ liệu là
    // double đại diện cho 3 cạnh của 1 tam giác, kiểm tra xem tam giác
    // đó có phải là tam giác vuông hay không.
    public static void bai_9() {
        System.out.println("mời nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.println("mời nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.println("mời nhập cạnh c: ");
        double c = sc.nextDouble();
        if (a + b <= c || c + b <= a || a + c <= b) {
            System.out.println("Đây không phải tam giác");
            return;
        }
        if (a * a + b * b == c * c || a * a + c * c == b * b || c * c + b * b == a * a) {
            System.out.println("Đây là tam giác vuông");
        } else {
            System.out.println("Đây không phải là tam giác vuông");
        }
    }

    //Bài 10: Tạo 1 method đầu vào là 1 số n có kiểu dữ liệu là int,
    // tổng hợp tất cả các số là thừa số nguyên tố từ 1 tới n]
    public static void bai_10() {
        System.out.println("Nhập số n: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Đây không phải là số nguyên tố");
            return;
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                sum += i;
            }

        }
        System.out.println("Tổng thừa số nguyên tố từ 1 đến n là: " + sum);
    }

    //Bài 11. Tạo 1 method có 2 tham số đầu vào là 2 số nguyên min và max,
    // nhập vào số nguyên để thỏa mãn số nguyên đó nhỏ hơn hoặc bằng max, lớn hơn hoặc bằng min.
    // Nếu không thỏa mãn sẽ yêu cầu nhập lại.
    public static void bai_11() {
        System.out.println("nhập max: ");
        int max = sc.nextInt();
        System.out.println("Nhập min: ");
        int min = sc.nextInt();
        if (min > max) {
            System.out.println("min phải nhỏ hơn max");
            return;
        }
        while (true) {
            System.out.println("mời nhập số trong khoảng[ " + min + " , " + max + " ]");
            int n = sc.nextInt();
            if (min <= n && n <= max) {
                System.out.println("Đây là số thỏa mãn");
                break;
            }
            System.out.println("Sai rồi nhập lại: ");
        }
    }

    //Bài 12: Tạo method để yêu cầu người dùng nhập
    // vào định dạng kiểu email (chứa ký tự @ trong chuỗi),
    // nếu nhập sai yêu cầu người dùng nhập lại.
    public static void bai_12() {
        String email;
        while (true) {
            System.out.println("Nhập email: ");
            email = sc.nextLine();
            if (email.contains("@")) {
                System.out.println("email hợp lệ");
                break;
            }
            System.out.println("Sai!Email không hợp lệ nhập lại: ");
        }
    }

    //Bài 13: Tạo method để yêu cầu người dùng nhập vào định dạng kiểu số điện thoại có số 0 ở đầu
    // và có tất cả 10 ký tự, nếu nhập sai yêu cầu người dùng nhập lại.
    public static void bai_13() {
        String soDT;
        while (true) {
            System.out.println("Nhập số điện thoại: ");
            soDT = sc.nextLine();
            if (soDT.matches("^0\\d{9}")) {
                System.out.println("Số điện thoại hợp lệ");
                break;
            }
            System.out.println("Sai!Nhập lại: ");
        }
    }

    //Bài 14: Viết chương trình để nhập vào từ màn hình 1 số,
    // sau đó in ra kết quả tổng tất cả các chữ số của số đó. Ví dụ:
    //Input: 5461
    //Output: 16 (vì 5 + 4 + 6 + 1 = 16)
    public static void bai_14() {
        System.out.println("Nhập số n");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Ouput= " + sum);
    }

    //Bài 15: Viết chương trình nhập vào số nguyên n,
    // hãy in ra tất cả các số nguyên tố từ 1 tới n.
    // (Số nguyên tố là số lớn hơn 1 chỉ chia hết cho 1 và chính nó VD: 2,3,5,7,13,…)
    public static void bai_15() {
        System.out.println("Nhập số nguyên n: ");
        int n = Math.abs(sc.nextInt());
        if (n < 2) {
            System.out.println("Đây không phải là số nguyên tố");
            return;
        }
        for (int i = 2; i <= n; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % 2 == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i + " Đây là số nguyên tố ");
            }
        }
    }

    //Bài 16: Một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải
    // hay từ phải sang trái số đó ta vẫn nhận được một số giống nhau.
    // Hãy liệt kê tất cả các số thuận nghịch độc có sáu chữ số (Ví dụ số: 558855).
    public static void bai_16() {
        for (int i = 100000; i < 999999; i++) {
            String chuoi = String.valueOf(i);
            String daochuoi = new StringBuilder(chuoi).reverse().toString();
            if (chuoi.equals(daochuoi)) {
                System.out.println(i + " là số  thuận nghịch độc");
            }
        }
    }

    //    Bài 17: Ngân hàng thông báo lãi suất là X % mỗi năm.
//    Với số tiền gửi vào là N. Sau mỗi năm,
//    tiền lãi sẽ được cộng dồn. Hỏi sau bao nhiêu năm thì số tiền đạt được ít nhất là M.
    public static void bai_17() {
        System.out.println("Nhập X: ");
        double X = sc.nextDouble();
        System.out.println("Nhập N: ");
        double N = sc.nextDouble();
        System.out.println("Nhập M: ");
        double M = sc.nextDouble();
        int year = 0;
        while (N < M) {
            N = N + (N * X / 100);
            year++;
        }
        System.out.println("Số Năm Cần Đạt được mục tiêu: " + year);
    }

    //Bài 18: Một số được xem là số may mắn nếu chỉ có các chữ số 4 và 7.
    // Cho số nguyên dương N không quá 200 chữ số.
    // Hãy kiểm tra xem N có phải số may mắn hay không.
    public static void bai_18() {
        System.out.println("Mời nhập chuỗi số: ");
        String chuoiSo = sc.nextLine();
        if (chuoiSo.isEmpty() || chuoiSo.length() > 200) {
            System.out.println("chuỗi không hợp lệ");
            return;
        }
        for (int i = 0; i < chuoiSo.length(); i++) {
            char c = chuoiSo.charAt(i);
            if (c != '4' && c != '7') {
                System.out.println("Đây không phải là số may mắn");
                return;
            }
        }
        System.out.println("Đây là số may mắn");
    }

    //Bài 19: Viết chương trình nhập vào
    // một xâu ký tự S có độ dài không quá 100 và
    // chuyển xâu đã nhập thành chữ in hoa.
    public static void bai_19() {
        System.out.println("Mời nhập chuỗi: ");
        String chuoi = sc.nextLine();
        if (chuoi.isEmpty() || chuoi.length() > 100) {
            return;
        }
        for (int i = 0; i < chuoi.length(); i++) {
            char c = chuoi.charAt(i);
            if (!Character.isLetter(c)) {
                System.out.println("chuỗi không hợp lệ");
                return;
            }
        }
        String inHoa = chuoi.toUpperCase();
        System.out.println("chuỗi sau khi in hoa: " + inHoa);
    }

    //Bài 20: Cho một xâu ký tự chỉ bao gồm các ký tự chữ cái,
    // độ dài không quá 100. Hãy thực hiện:
    //Biến đổi tất cả xâu thành viết thường,
    // nếu số lượng chữ cái viết thường lớn hơn hoặc bằng số lượng chữ cái viết hoa.
    //Biến đổi tất cả xâu thành chữ hoa,
    // nếu số lượng chữ cái viết hoa lớn hơn số lượng chữ cái viết thường.
    public static void bai_20() {
        System.out.println("Mời nhập chuỗi kí tự: ");
        String chuoi = sc.nextLine();
        if (chuoi.isEmpty() || chuoi.length() > 100) {
            System.out.println("chuỗi sai định dạng");
            return;
        }
        int countThuong = 0;
        int countHoa = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            char c = chuoi.charAt(i);
            if (Character.isLowerCase(c)) {
                countThuong++;
            } else if (Character.isUpperCase(c)) {
                countHoa++;
            }
        }
        if (countThuong >= countHoa) {
            System.out.println(chuoi.toLowerCase());
        } else {
            System.out.println(chuoi.toUpperCase());
        }
    }

    //Bài 21: Viết chương trình kiểm tra xem số nguyên dương N có thỏa mãn tính chất:
    // nếu ta lấy hai chữ số đầu và
    // hai chữ số cuối của nó thì sẽ tạo ra số có hai chữ số giống nhau hay không?
    //Input: là 1 số nguyên dương N có ít nhất 4 chữ số, nhưng không quá 18 chữ số.
    //Output: Ghi ra YES hoặc NO
    public static void bai_21() {
        System.out.println("Mời nhập chuỗi: ");
        String N = sc.nextLine();
        if (!N.matches("\\d+") || N.length() < 4 || N.length() > 18) {
            System.out.println("Chuỗi không hợp lệ");
            return;
        }
        String dauChuoi = N.substring(0, 2);
        String cuoiChuoi = N.substring(N.length() - 2);
        if (dauChuoi.equals(cuoiChuoi)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    //Bài 22: Một số kết thúc bởi hai chữ số 86 được gọi là số phát lộc.
    // Cho một số nguyên dương không quá 500 chữ số,
    // hãy kiểm tra số đó có phải số phát lộc hay không.
    public static void bai_22() {
        System.out.println("Nhập chuỗi: ");
        String chuoi = sc.nextLine();
        if (!chuoi.matches("\\d+") || chuoi.length() > 500) {
            System.out.println("Chuỗi không hợp lệ");
            return;
        }
        if (chuoi.endsWith("86")) {
            System.out.println("Đây là số phát lộc");
        } else {
            System.out.println("Đây không phải là số phát lộc");
        }
    }

    //Bài 23: Viết chương trình nhập vào 3 cạnh của tam giác,
    // kiểm tra xem đây có phải làm tam giác vuông hay không. (Áp dụng định lý pytago)
    public static void bai_23() {
        System.out.println("nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.println("nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.println("nhập cạnh c: ");
        double c = sc.nextDouble();
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Không phải tam giác");
            return;
        }
        double[] arr = {a, b, c};
        Arrays.sort(arr);

        double x = arr[0];
        double y = arr[1];
        double z = arr[2];//cạnh lớn nhất(cạnh huyền)
        if (Math.abs(x * x + y * y - z * z) < 0.0001) {
            System.out.println("Đây là tam giác vuông");
        } else {
            System.out.println("Đây không phải tam giác vuông");
        }
    }

    //Bài 24: Viết một chương trình Java nhận vào một mảng các số nguyên
    // và tính trung bình cộng của các số trong mảng
    public static void bai_24() {
        System.out.println("mời nhập số lượng phần tử trong mảng");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("số lượng không hợp lệ");
            return;
        }
        int[] mang = new int[n];
        Random rd = new Random();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            mang[i] = rd.nextInt(101);
            sum += mang[i];
        }
        System.out.println("Mảng" + Arrays.toString(mang));
        double trungBinhcong = (double) sum / n;
        System.out.println("Trung Bình Cộng là: " + trungBinhcong);

    }

    //Bài 25: Viết một chương trình Java nhận vào một chuỗi ký tự
    // và đếm số lượng chữ cái (cả chữ viết hoa và chữ viết thường) trong chuỗi đó.
    public static void bai_25() {
        System.out.println("Nhập chuỗi kí tự: ");
        String chuoi = sc.nextLine();
        if (chuoi.isEmpty() || chuoi.length() <= 0) {
            System.out.println("Chuỗi không hợp lệ!");
            return;
        }
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            char c = chuoi.charAt(i);
            if (Character.isLetter(c)) {
                count++;
            }
        }
        System.out.println("Số lượng chữ cái trong chuỗi: " + count);
    }

    //Bài 26: Viết một chương trình Java nhận vào một mảng số nguyên và
    // tìm tất cả các số trong mảng đó chia hết cho 3. In ra các số đó.
    public static void bai_26() {
        System.out.println("Mời nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            mang[i] = rd.nextInt(101);
        }
        System.out.println("Mảng là: " + Arrays.toString(mang));
        for (int x : mang) {
            if (x % 3 == 0) {
                System.out.println(x + " Đây là số chia hết cho 3");
            }
        }
    }

    //Bài 27: Viết một chương trình Java nhận vào một chuỗi ký tự và một ký tự cụ thể.
    // Đếm và in ra số lần ký tự đó xuất hiện trong chuỗi.
    //Ví dụ:
    //Input: "banana", ký tự: 'a'
    public static void bai_27() {
        System.out.println("mời nhập chuỗi: ");
        String chuoi = sc.nextLine();
        if (chuoi.isEmpty() || chuoi.length() <= 0) {
            System.out.println("chuỗi không hợp lệ!");
            return;
        }
        System.out.println("Mời nhập kí tự cần đếm: ");
        char kyTu = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            char c = chuoi.charAt(i);
            if (c == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện " + kyTu + " trong chuỗi là: " + count);
    }

    //Bài 28: Viết một chương trình Java nhận vào một chuỗi ký tự
    // và tính tổng của tất cả các chữ số trong chuỗi đó. Các ký tự không phải chữ số sẽ bị bỏ qua.
    //Ví dụ:
    //Input: "a1b2c3d4"
    public static void bai_28() {
        System.out.println("mời nhập chuỗi: ");
        String chuoi = sc.nextLine();
        if (chuoi.isEmpty() || chuoi.length() <= 0) {
            System.out.println("chuỗi không hợp lệ!");
            return;
        }
        int sum = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            char c = chuoi.charAt(i);
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        System.out.println("tổng các số trong chuỗi là: " + sum);
    }

    //Bài 29: Viết một chương trình Java nhận vào một mảng số nguyên và
    // tính tổng của tất cả các số chẵn trong mảng.
    //Ví dụ:
    //Input: [3, 8, 2, 7, 10]
    //Output: 20 (Tổng của các số chẵn là 8 + 2 + 10 = 20)
    public static void bai_29() {
        System.out.println("Mời nhập số lượng phần tử n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        Random rd = new Random();
        if (n <= 0) {
            System.out.println("Mảng không hợp lê!");
            return;
        }
        for (int i = 0; i < n; i++) {
            a[i] = rd.nextInt(101);
        }
        System.out.println("Mảng là: " + Arrays.toString(a));
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        System.out.println("Tổng các số trong mảng là: " + sum);
    }
}
