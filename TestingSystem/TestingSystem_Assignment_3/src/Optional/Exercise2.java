package Optional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise2 {
    /* Question 1:
     Không sử dụng data đã insert từ bài trước, tạo 1 array Account và
      khởi tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
     Email: "Email 1"
     Username: "User name 1"
     FullName: "Full name 1"
     CreateDate: now*/
    public String email;
    public String userName;
    public String fullName;
    public LocalDateTime createDate;

    public static void question_1() {
        Exercise2[] accounts = new Exercise2[5];

        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Exercise2();
            accounts[i].email = "email" + (i + 1);
            accounts[i].userName = "user" + (i + 1);
            accounts[i].fullName = "name" + (i + 1);
            accounts[i].createDate = LocalDateTime.now();
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (Exercise2 account : accounts) {
            System.out.println(account.email + " " + account.userName + " " + account.fullName + " "
                    + account.createDate.format(dtf));
        }


    }


}
