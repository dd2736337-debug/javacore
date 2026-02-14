import java.util.Scanner;

public class BaiTap {
    static Scanner sc = new Scanner(System.in);

    public static void question_1() {
        //Bài 1: Tìm ra 1 số lớn nhất trong 1 mảng
        int[] dayso = {-12, -14, -5, -6, -7, -8, -10};
        int max = dayso[0];
        for (int i = 0; i < dayso.length; i++) {
            if (dayso[i] > max) {
                max = dayso[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);
    }

    //Bài 2: Tạo 1 method có 1 tham số int truyền vào,
    // kiểm tra số đó có phải là số nguyên tố hay không?
    public static void question_2() {
        System.out.println("mời nhập vào một số: ");
        int a = sc.nextInt();
        if (a < 2) {
            System.out.println("không phải là số nguyên tố");
            return;
        }
        boolean check = true;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                check = false;
                break;
            }
        }
        System.out.println(check ? "là số nguyên tố" : "không phải là số nguyên tố");
    }

    //    Bài 3: Viết chương trình nhập
//    vào 1 chuỗi sau đó in ra 1 chuỗi đảo ngược của nó
    public static void question_3() {
        System.out.println("mời nhập vào chuỗi: ");
        String a = sc.nextLine();
        //abc -> cba
        String result = "";
        //C1:
        /*for (int i =a.length()-1; i >=0 ; i--) {
            result=result+a.charAt(i);
        }
        System.out.println(result);*/
        //C2:tách chuỗi thành mảng các chữ cái
       /* String[] arrayString = a.split("");
        for (int i = arrayString.length - 1; i >= 0; i--) {
            result = result.concat(arrayString[i]);
        }
        System.out.println(result);*/
        //C3:sử dụng 1 đối tượng cũng lưu trữ và có method đảo ngược chuỗi
        StringBuffer stringBuffer = new StringBuffer(a);
        result = stringBuffer.reverse().toString();
        System.out.println(result);
    }

    //Bài 4: Tạo 1 method có 1 tham số int truyền vào,
    // tính tổng các số từ 1 tới n
    public static void question_4() {
        System.out.println("mời nhập vào 1 số nguyên: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("tổng là: " + sum);
    }

    //Bài 5: Tạo 1 method có 2 tham số truyền vào
    // đều có kiểu dữ liệu là int,
    // tìm ước chung lớn nhất của 2 số đó
    public static void question_5() {
        System.out.println("mời nhập vào số 1: ");
        int number1 = Math.abs(sc.nextInt());
        System.out.println("mời nhập vào số 2: ");
        int number2 = Math.abs(sc.nextInt());
        if (number1 == number2) {
            System.out.println("ucln là " + number1);
            return;
        }
        int a = Math.max(number1, number2);
        int b = Math.min(number1, number2);
        int ucln = 1;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0 && i > ucln) {
                ucln = i;
            }
        }
        System.out.println("ucln của 2 số là: " + ucln);
    }

    //Bài 6: Tạo 1 method có 2 tham số truyền vào đều có kiểu dữ liệu là int,
    // tìm bội chung nhỏ nhất của 2 số đó
    public static void question_6() {
        //C1:
    /*    System.out.println("mời nhập vào số 1: ");
        int number1 = Math.abs(sc.nextInt());
        System.out.println("mời nhập vào số 2: ");
        int number2 = Math.abs(sc.nextInt());
        if (number1 == 0 || number2 == 0) {
            System.out.println("bcnn là 0");
            return;
        }
        int a = Math.max(number1, number2);
        int b = Math.min(number1, number2);
        int ucln = 1;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0 && i > ucln) {
                ucln = i;
            }
        }
        int bcnn = Math.abs(number1 * number2) / ucln;
        System.out.println("bội chung nhỏ nhất là: " + bcnn);*/
        //C2:
        System.out.println("nhập vào số 1: ");
        int number1 = Math.abs(sc.nextInt());
        System.out.println("nhập vào số 2: ");
        int number2 = Math.abs(sc.nextInt());
        if (number1 == 0 || number2 == 0) {
            System.out.println("BCNN = 0 ");
            return;
        }
        int max = Math.max(number1, number2);
        while (true) {
            if (max % number1 == 0 && max % number2 == 0) {
                break;
            }
            max++;
        }
        System.out.println("BCNN là: " + max);
    }

    //Bài 7: Tạo 1 method có 1 tham số truyền vào có kiểu dữ liệu là String,
    // kiểm tra xem chuỗi đó có phải là chuỗi đối xứng hay không?
    // (Chuỗi đối xứng là chuỗi mà khi đảo ngược các ký tự ta vẫn được chuỗi ban đầu)
    public static void question_7() {
        //C1:
       /* System.out.println("mời nhập vào 1 chuỗi để kiểm tra: ");
        String s = sc.nextLine();
        boolean check = true;
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            char left = s.charAt(i);
            char right = s.charAt(length - 1 - i);
            if (left != right) {
                check = false;
            }
        }
        if (check) {
            System.out.println("Chuỗi đối xứng");
        } else {
            System.out.println("chuỗi không đối xứng");
        }*/
        C2:
        System.out.println("Mời nhập vào chuỗi để kiểm tra: ");
        String s = sc.nextLine();
        String reversed = new StringBuilder(s).reverse().toString();
        //StringBuider(s) chứa chuỗi s
        //reverse() đảo chuỗi s
        //toString() chuyển  StringBuilder về dạng String
        if (s.equals(reversed)) {
            System.out.println("Đây la chuỗi đối xứng");
        } else {
            System.out.println("Không phải là chuỗi đối xưng");
        }
    }

    //Bài 8: Viết chương trình để giải phương trình bậc 2.
    // Gợi ý: Phương trình bậc 2 có dạng ax2 + bx + c = 0.
    public static void question_8() {
        System.out.println("Mời nhập vào a: ");
        double a = sc.nextDouble();
        System.out.println("Mời nhập vào b: ");
        double b = sc.nextDouble();
        System.out.println("Mời nhập vào c: ");
        double c = sc.nextDouble();
        double delta = b * b - (4 * a * c);
        double x1, x2;
        if (a == 0) {
            if (b == 0 && c == 0)
                System.out.println("PT bậc nhất vô số nghiệm");
            else if (b == 0 && c != 0)
                System.out.println("PT bậc nhất vô nghiệm");
            else
                System.out.println("PT bậc nhất có nghiệm x= " + (-c / b));
            return;
        }
        if (delta < 0) {
            System.out.println("PT Vô Nghiệm");
        } else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
            System.out.println("PT có nghiệm kép: x1=x2= " + x1);
        } else {
            x1 = (-b + (Math.sqrt(delta))) / (2 * a);
            x2 = (-b - (Math.sqrt(delta))) / (2 * a);
            System.out.println("PT có 2 nghiệm: ");
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }
    }

    //    Bài 9: Tạo 1 method đầu vào có 3 tham số đều có kiểu dữ liệu là
//    double đại diện cho 3 cạnh của 1 tam giác, kiểm
//    tra xem tam giác đó có phải là tam giác vuông hay không.
    public static void question_9() {
        C1:
      /*  System.out.println("Mời nhập vào a: ");
        double a = sc.nextDouble();
        System.out.println("Mời nhập vào b: ");
        double b = sc.nextDouble();
        System.out.println("Mời nhập vào c: ");
        double c = sc.nextDouble();
        if (a + b <= c || a + c <= b || c + b <= a) {
            System.out.println("không phải tam giác");
            return;
        }
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("đây la tam giác vuông");
        } else {
            System.out.println("không phải tam giác vuông");
        }*/
        //C2:
        System.out.println("nhập cạnh a: ");
        double a = sc.nextDouble();
        System.out.println("nhập cạnh b: ");
        double b = sc.nextDouble();
        System.out.println("nhập cạnh c: ");
        double c = sc.nextDouble();
        //kiểm tra điều kiện là tam giác (tổng 2 cạnh sẽ lớn hơn 1 cạnh còn lại)
        double tongbinhphuong;
        double max = Math.max(a, Math.max(b, c));
        if (max == a) {
            tongbinhphuong = b * b + c * c;
        } else if (max == b) {
            tongbinhphuong = a * a + c * c;
        } else {
            tongbinhphuong = a * a + b * b;
        }
        if (max * max - tongbinhphuong == 0) {
            System.out.println("Đây là tam giác vuông");
        } else {
            System.out.println("Không Phải là tam giác vuông");
        }
    }

    //Bài 10: Tạo 1 method đầu vào là 1 số n có kiểu dữ liệu là int,
    // tổng hợp tất cả các số là thừa số nguyên tố từ 1 tới n
    public static void question_10() {
        C1:
      /*  System.out.println("Mời nhập vào số n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            boolean check = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                sum += i;
            }
        }
        System.out.println("Tổng các số nguyên tố: " + sum);*/
        //C2:
        System.out.println("Nhập vào số: ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Tổng các số nguyên tố từ 1 tới " + number + " là : " + sum);
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //    Bài 11. Tạo 1 method có 2 tham số đầu vào là 2 số nguyên min và max,
//    nhập vào số nguyên để thỏa mãn số nguyên đó nhỏ hơn hoặc bằng max,
//    lớn hơn hoặc bằng min. Nếu không thỏa mãn sẽ yêu cầu nhập lại.
    public static void question_11() {
        System.out.println("Nhập min: ");
        int min = sc.nextInt();
        System.out.println("Nhập max: ");
        int max = sc.nextInt();
        int number;
        while (true) {
            System.out.println("Nhập số trong khoảng [" + min + ", " + max + "]: ");
            number = sc.nextInt();
            if (number >= min && number <= max) {
                System.out.println("Số hợp lệ: " + number);
                break;
            }
            System.out.println("Sai! Nhập lại: ");
        }
    }

    //Bài 12: Tạo method để yêu cầu người dùng nhập vào định dạng kiểu email
    // (chứa ký tự @ trong chuỗi),
    // nếu nhập sai yêu cầu người dùng nhập lại.
    public static void question_12() {
        String email;
        while (true) {
            System.out.println("nhập email: ");
            email = sc.nextLine();
            if (email.contains("@")) {
                System.out.println("Email hợp lệ: " + email);
                break;
            }
            System.out.println("Sai! nhập lại: ");
        }
    }

    //Bài 13: Tạo method để yêu cầu người dùng nhập vào
    // định dạng kiểu số điện thoại có số 0 ở đầu và có tất cả 10 ký tự,
    // nếu nhập sai yêu cầu người dùng nhập lại.
    public static void question_13() {
        String sodt;
        while (true) {
            System.out.println("Mời nhập vào số điện thoại");
            sodt = sc.nextLine();
            if (sodt.length() == 10 && sodt.startsWith("0")) {
                System.out.println("Số điện thoại hợp lệ: " + sodt);
                break;
            }
            System.out.println("Sai! nhập lai: ");
        }
    }

    //   Bài14: Viết chương trình để nhập vào từ màn hình 1 số,
//   sau đó in ra kết quả tổng tất cả các chữ số của số đó. Ví dụ:
//Input: 5461
//Output: 16 (vì 5 + 4 + 6 + 1 = 16)
    public static void question_14() {
        System.out.println("nhâp số: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("Tổng là: " + sum);
    }

    //    Bài 15: Viết chương trình nhập vào số nguyên n,
//    hãy in ra tất cả các số nguyên tố từ 1 tới n.
//    (Số nguyên tố là số lớn hơn 1 chỉ chia hết cho 1 và chính nó VD: 2,3,5,7,13,…)
    public static void question_15() {

        System.out.println("Nhập n: ");
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i + " ");
            }
        }
    }

    //Bài 6: Một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải
    // hay từ phải sang trái số đó ta vẫn nhận được một số giống nhau.
    // Hãy liệt kê tất cả các số thuận nghịch độc có sáu chữ số (Ví dụ số: 558855).
    public static void question_16() {
        for (int i = 100000; i <= 999999; i++) {
            String number = String.valueOf(i);
            String result = "";
            for (int j = number.length() - 1; j >= 0; j--) {
                result += number.charAt(j);
            }
            if (number.equals(result)) {
                System.out.println(number);
            }
        }
    }

    //    Bài 17: Ngân hàng thông báo lãi suất là X % mỗi năm. Với số tiền gửi vào là N.
//    Sau mỗi năm, tiền lãi sẽ được cộng dồn.
//    Hỏi sau bao nhiêu năm thì số tiền đạt được ít nhất là M.
//    Yêu cầu: Viết chương trình để nhập vào 3 số thực (kiểu double) N, X và M.
//    Trong đó 0<N<M<100000 và trả về số năm để đạt được mục tiêu M
    public static void question_17() {
        System.out.println("Số tiền gửi ban đầu N: ");
        double N = sc.nextDouble();
        System.out.println("lãi suất phần trăm mỗi năm X: ");
        double X = sc.nextDouble();
        System.out.println("Số tiền muốn đạt được:  ");
        double M = sc.nextDouble();
        int year = 0;
        while (N < M) {
            N = N + N * X / 100;
            year++;
        }
        System.out.println("số năm cần để đạt được mục tiêu là: " + year);
    }

    //Bài 8: Một số được xem là số may mắn nếu chỉ có các chữ số 4 và 7.
    // Cho số nguyên dương N không quá 200 chữ số.
    // Hãy kiểm tra xem N có phải số may mắn hay không.
    public static void question_18() {
        System.out.println("Nhập số N: ");
        String N = sc.nextLine();
        boolean check = true;

        for (int i = 0; i < N.length(); i++) {
            char c = N.charAt(i);
            if (c != '4' && c != '7') {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Đây là số may mắn");
        } else {
            System.out.println("Không phải số may mắn");
        }
    }

    //Bài 19: Viết chương trình nhập vào một xâu ký tự S có độ dài không quá 100
    // và chuyển xâu đã nhập thành chữ in hoa.
    public static void question_19() {
        System.out.println("Mời nhập chuỗi: ");
        String s = sc.nextLine();
        s = s.toUpperCase();
        System.out.println("chuỗi sau khi in hoa: " + s);
    }

    //Bài 20: Cho một xâu ký tự chỉ bao gồm các ký tự chữ cái, độ dài không quá 100.
    // Hãy thực hiện:
    //Biến đổi tất cả xâu thành viết thường,
    // nếu số lượng chữ cái viết thường lớn hơn hoặc bằng số lượng chữ cái viết hoa.
    //Biến đổi tất cả xâu thành chữ hoa,
    // nếu số lượng chữ cái viết hoa lớn hơn số lượng chữ cái viết thường.
    public static void question_20() {
        System.out.println("nhập chuỗi: ");
        String s = sc.nextLine();
        int thuong = 0;
        int HOA = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                thuong++;
            } else if (Character.isLowerCase(c)) {
                HOA++;
            }
        }
        if (thuong > HOA) {
            System.out.println(s.toLowerCase());
        } else {
            System.out.println(s.toUpperCase());
        }
    }

    //Bài 21: Viết chương trình kiểm tra xem số nguyên dương N có thỏa mãn tính chất:
    // nếu ta lấy hai chữ số đầu và hai chữ số cuối của nó thì
    // sẽ tạo ra số có hai chữ số giống nhau hay không?
    public static void question_21() {
        System.out.println("nhập vào số N: ");
        String n = sc.nextLine();
        if (n.length() < 4) {
            System.out.println("phải có ít nhất 4 số trở lên! không hợp lệ: ");
            return;
        }
        String dauchuoi = n.substring(0, 2);
        String cuoichuoi = n.substring(n.length() - 2);
        if (dauchuoi.equals(cuoichuoi)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    //Bài 22: Một số kết thúc bởi hai chữ số 86 được gọi là số phát lộc.
    // Cho một số nguyên dương không quá 500 chữ số,
    // hãy kiểm tra số đó có phải số phát lộc hay không.
    public static void question_22() {
        System.out.println("Nhập vào: ");
        String so = sc.nextLine();
        if (so.endsWith("86")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    //Bài 23: Viết chương trình nhập vào 3 cạnh của tam giác,
    // kiểm tra xem đây có phải làm tam giác vuông hay không. (Áp dụng định lý pytago)
    public static void question_23() {
        System.out.println("nhập a: ");
        double a = sc.nextDouble();
        System.out.println("nhập b: ");
        double b = sc.nextDouble();
        System.out.println("nhập c: ");
        double c = sc.nextDouble();
        double max = Math.max(a, Math.max(b, c));
        double tongbinhphuong;
        if (max == a) {
            tongbinhphuong = b * b + c * c;
        } else if (max == b) {
            tongbinhphuong = a * a + c * c;
        } else {
            tongbinhphuong = a * a + b * b;
        }
        if (tongbinhphuong == max * max) {
            System.out.println("Tam Giác Vuông");
        } else {
            System.out.println("Không phải tam giác vuông");
        }
    }

    //Bài 24: Viết một chương trình Java nhận vào một mảng các số nguyên
    // và tính trung bình cộng của các số trong mảng.
    public static void question_24() {
      /*  C1:cho người dùng nhập vào mảng
        System.out.println("Mời nhập số vào mảng");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Số không hợp lệ!");
        }
        int a[]=new int[n];
        int sum  =0;
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        double trungbinhcong=(double) sum/n;
        System.out.println("Trung Bình Cộng= "+trungbinhcong);*/
        int[] a = {1, 2, 7, 4};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double trungbinhcong = (double) sum / a.length;
        System.out.println("Trung bình cộng= " + trungbinhcong);
    }

    //Bài 25: Viết một chương trình Java nhận vào một chuỗi ký tự và
    // đếm số lượng chữ cái
    // (cả chữ viết hoa và chữ viết thường) trong chuỗi đó
    public static void question_25() {
        System.out.println("nhập vào chuỗi kí tự: ");
        String s = sc.nextLine();
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                dem++;
            }
            //s.charAt(i) → lấy ký tự ở vị trí i trong chuỗi s
            //Character.isLetter(...) → trả về true nếu là chữ cái (a-z, A-Z, cả Unicode),
            // ngược lại false
        }
        System.out.println("Số lượng là: " + dem);
    }

    //Bài 26: Viết một chương trình Java nhận vào một mảng số nguyên và
    // tìm tất cả các số trong mảng đó chia hết cho 3. In ra các số đó.
    public static void question_26() {
        System.out.println("Mời nhập số vào mảng");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Số không hợp lệ!");
            return;
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Các số chia hết cho 3: ");
        for (int b : a) {
            if (b % 3 == 0) {
                System.out.println(b + "");
            }
        }
    }

    //Bài 27: Viết một chương trình Java nhận vào một chuỗi ký tự và một ký tự cụ thể.
    // Đếm và in ra số lần ký tự đó xuất hiện trong chuỗi.
    //Ví dụ:
    //Input: "banana", ký tự: 'a'
    //Output: 3 (Ký tự 'a' xuất hiện 3 lần trong chuỗi "banana")
    public static void question_27() {
        System.out.println("Mời nhập vào chuỗi kí tự: ");
        String s = sc.nextLine();
        System.out.println("nhập kí tự cần đếm");
        char c = sc.next().charAt(0);//lấy 1 kí tự
        int dem = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                dem++;
            }
        }
        System.out.println("Output: " + dem);
        System.out.println("Ký tự '" + c + "' xuất hiện " + dem + " lần trong chuỗi ''" + s + "''" + "");
    }
    //Bài 28: Viết một chương trình Java nhận vào một chuỗi ký tự và
    // tính tổng của tất cả các chữ số trong chuỗi đó.
    // Các ký tự không phải chữ số sẽ bị bỏ qua.
    public static void question_28(){
        System.out.println("Nhập chuỗi: ");
        String s=sc.nextLine();
        int sum=0;
        for (int i = 0; i <s.length() ; i++) {
            char c=s.charAt(i);
            if (Character.isDigit(c))//kiểm tra kí tự phải số hay không
                sum+= c - '0';
        }
        System.out.println("Tổng các chữ số là: "+sum);
    }
    //Bài 29: Viết một chương trình Java nhận vào một mảng số nguyên
    // và tính tổng của tất cả các số chẵn trong mảng.
    public static void question_29(){
        int a[]={3,8,2,7,10};
        int sum=0;
        for (int b:a) {
            if(b%2 ==0){
                sum+=b;
            }
        }
        System.out.println("Tổng Số chẵn: "+sum);
    }
}
