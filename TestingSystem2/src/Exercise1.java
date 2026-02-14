import java.time.LocalDate;

public class Exercise1 {

    public static void question1(Account acc) {
        if (acc.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là " + acc.department.departmentName);
        }
    }


}
