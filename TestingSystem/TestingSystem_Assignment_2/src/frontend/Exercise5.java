package frontend;

import entity.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    //Question 1:
    //Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình

    public static void question_1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số thứ 1: ");
        int so1 = sc.nextInt();
        System.out.println("Mời nhập vào số thứ 2: ");
        int so2 = sc.nextInt();
        System.out.println("Mời nhập vào số thứ 3: ");
        int so3 = sc.nextInt();
        System.out.println("Ba số vừa nhập là: " + so1 + "," + so2 + " ," + so3);
    }

    //Question 2:
    //Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
    public static void question_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số thực thứ 1: ");
        float soThuc1 = sc.nextFloat();
        System.out.println("Mời nhập vào số thực thứ 2: ");
        float soThuc2 = sc.nextFloat();
        System.out.println("Hai số thực vừa nhập là: " + soThuc1 + "," + soThuc2);

    }

    //Question 3:
    //Viết lệnh cho phép người dùng nhập họ và tên
    public static void question_3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập họ và tên");
        String hovaTen = sc.nextLine();
        System.out.println("Họ Và Tên: " + hovaTen);
    }

    //Question 4:
    //Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
    public static void question_4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào ngày sinh: ");
        String s = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ngaySinh = LocalDate.parse(s, formatter);
        System.out.println("Ngày sinh của bạn là :" + ngaySinh);

    }

    //Question 5:
    //Viết lệnh cho phép người dùng tạo account (viết thành method)
    // Đối với property Position, Người dùng nhập vào 1 2 3 4 5
    // và vào chương trình sẽ chuyển thành Position.Dev, Position.Test, Position.ScrumMaster, Position.PM
    public static Account question_5() {
        Scanner sc = new Scanner(System.in);
        Account account4 = new Account();
        System.out.println("Nhập email: ");
        account4.email = sc.nextLine();
        System.out.println("nhập fullName: ");
        account4.fullName = sc.nextLine();
        System.out.println("Chọn Position: ");
        System.out.println("1.Dev");
        System.out.println("2.Test");
        System.out.println("3.ScrumMaster");
        System.out.println("4. PM");
        int so = sc.nextInt();
        switch (so) {
            case 1:
                account4.position = new Position();
                account4.position.positionName = PositionName.Dev;
                System.out.println("Nhân Viên Dev");
                break;
            case 2:
                account4.position = new Position();
                account4.position.positionName = PositionName.Test;
                System.out.println("Nhân Viên Test");
                break;
            case 3:
                account4.position = new Position();
                account4.position.positionName = PositionName.ScrumMaster;
                System.out.println("Nhân Viên ScrumMaster");
            case 4:
                account4.position = new Position();
                account4.position.positionName = PositionName.PM;
                System.out.println("Nhân Viên Pm");
            default:
                System.out.println("Lựa chon không hợp lệ");
                break;
        }
        return account4;
    }

    //Question 6:
    //Viết lệnh cho phép người dùng tạo department (viết thành method)
    public static Department question_6() {
        Scanner sc = new Scanner(System.in);
        Department department4 = new Department();
        System.out.println("Nhập departmentId: ");
        department4.departmentId = new Scanner(System.in).nextInt();
        System.out.println("Nhập departmentName: ");
        department4.departmentName = new Scanner(System.in).nextLine();
        return department4;
    }

    //Question 7:
    //Nhập số chẵn từ console
    public static void question_7() {
        int number;
        while (true) {
            System.out.println("Nhập số chẵn: ");
            number = new Scanner(System.in).nextInt();
            if (number % 2 == 0) {
                System.out.println("Bạn đã nhập số chẵn: " + number);
                break;
            } else {
                System.out.println("Sai!Phải nhập số chẵn");
            }
        }

    }

    //Question 8:
    //Viết chương trình thực hiện theo flow sau:
    //Bước 1:  Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
    //Bước 2:  Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
    //Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo department
    //Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập lại" và quay trở lại bước 1
    public static void question_8() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng");
            System.out.println("1.Tạo account");
            System.out.println("2.Tạo depaetment");
            int so = sc.nextInt();
            switch (so) {
                case 1:
                    question_5();
                    return;
                case 2:
                    question_6();
                    return;
                default:
                    System.out.println("Không có chức năng này!mời nhập lại");
            }
        }
    }

    //Question 9:
    //Viết method cho phép người dùng thêm group vào account theo flow sau:
    //Bước 1: In ra tên các usernames của user cho người dùng xem
    //Bước 2: Yêu cầu người dùng nhập vào username của account
    //Bước 3:  In ra tên các group cho người dùng xem
    //Bước 4: Yêu cầu người dùng nhập vào tên của group
    //Bước 5:  Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account vào group đó .
    public static void question_9(Account[] accounts, Group[] groups) {
        Scanner sc = new Scanner(System.in);

        //Bước 1: In ra tên các usernames của user cho người dùng xem
        System.out.println("Danh sách usernames: ");
        for (Account account : accounts) {
            if (account != null) {
                System.out.println(" " + account.userName);
            }
        }

        //Bước 2: Yêu cầu người dùng nhập vào username của account
        System.out.println("Nhập Username: ");
        String usernameInput = sc.nextLine();
        Account saveAccount = null;
        for (Account account : accounts) {
            if (account != null && account.userName.equals(usernameInput)) {
                saveAccount = account;
                System.out.println("username của account: " + account.accountId);
                break;
            }
        }
        if (saveAccount == null) {
            System.out.println("Không tìm thấy account!");
            return;
        }

        ////Bước 3:  In ra tên các group cho người dùng xem
        System.out.println("Danh sách group: ");
        for (Group group : groups) {
            if (group != null) {
                System.out.println(" " + group.groupName);
            }
        }
        //Bước 4: Yêu cầu người dùng nhập và o tên của group
        System.out.println("Nhập tên group: ");
        String groupnameInput = sc.nextLine();
        Group saveGroup = null;
        for (Group group : groups) {
            if (group != null && group.groupName.equals(groupnameInput)) {
                saveGroup = group;
                break;
            }
        }
        if (saveGroup == null) {
            System.out.println("Không có group! ");
            return;
        }
        ////Bước 5:  Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account vào group đó .
        // Bước 5
        for (int i = 0; i < saveGroup.accounts.length; i++) {
            if (saveGroup.accounts[i] == null) {
                saveGroup.accounts[i] = saveAccount;
                System.out.println("Thêm account vào group thành công!");
                return;
            }
        }

        System.out.println("Group đã đầy!");
    }

    //Question 10: Tiếp tục Question 8 và Question 9
    //Bổ sung thêm vào bước 2 của Question 8 như sau:
    //Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào account
    //Bổ sung thêm Bước 3 của Question 8 như sau:
    //Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng text để hỏi người dùng
    // "Bạn có muốn thực hiện chức năng khác không?". Nếu người dùng chọn "Có" thì quay lại bước 1,
    // nếu người dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để kết thúc chương trình)
    public static void question_10(Account[] accounts, Group[] groups, Department[] departments) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng");
            System.out.println("1.Tạo account");
            System.out.println("2.Tạo depaetment");
            System.out.println("3. Thêm group vào account");
            System.out.println("4. Thêm account vào group ngẫu nhiên");
            int so = sc.nextInt();
            switch (so) {
                case 1:
                    question_5();
                    break;
                case 2:
                    question_6();
                    break;
                case 3:
                    question_9(accounts, groups);
                    break;
                case 4:
                    question_11(accounts, groups);
                    break;
                default:
                    System.out.println("Không có chức năng này!mời nhập lại");
                    continue;
            }
            System.out.println("ban có muốn thực hiện chức năng khác không?(Y/N)");
            String nhap = new Scanner(System.in).nextLine();
            if (nhap.equalsIgnoreCase("N")) {
                System.out.println("kết thúc chương trình");
                return;
            }
        }


    }

    //Question 11: Tiếp tục Question 10 Bổ sung thêm vào bước 2 của Question 8 như sau:
    //Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account vào 1 nhóm ngẫu nhiên,
    // chức năng sẽ được cài đặt như sau:
    //Bước 1:  In ra tên các usernames của user cho người dùng xem
    //Bước 2:  Yêu cầu người dùng nhập vào username của account
    //Bước 3: Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
    //Bước 4:  Thêm account vào group chương trình vừa chọn ngẫu nhiên
    public static void question_11(Account[] accounts, Group[] groups) {
        Scanner sc = new Scanner(System.in);
        ////Bước 1:  In ra tên các usernames của user cho người dùng xem
        System.out.println("Danh sách usernames:");
        for (Account account : accounts) {
            if (account != null) {
                System.out.println(account.userName);
            }
        }
        //  Bước 2: Yêu cầu người dùng nhập vào username của account
        System.out.print("Nhập username: ");
        String usernameInput = sc.nextLine();

        Account saveAccount = null;
        for (Account account : accounts) {
            if (account != null && account.userName.equals(usernameInput)) {
                saveAccount = account;
                break;
            }
        }
        if (saveAccount == null) {
            System.out.println("Không tìm thấy account!");
            return;
        }
        // Bước 3: Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
        Random rd = new Random();
        Group randomGroup = groups[rd.nextInt(groups.length)];

        System.out.println("Group được chọn ngẫu nhiên: " + randomGroup.groupName);

        // Bước 4:  Thêm account vào group chương trình vừa chọn ngẫu nhiên
        for (int i = 0; i < randomGroup.accounts.length; i++) {
            if (randomGroup.accounts[i] == null) {
                randomGroup.accounts[i] = saveAccount;
                System.out.println("Thêm account vào group thành công!");
                return;
            }
        }
        System.out.println("Gruop đã đầy");
    }

}
