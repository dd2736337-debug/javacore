import java.time.LocalDate;

public class Account {
    int accountId;
    String userName;
    String fullName;
    String email;
    Department department;
    Position positionId;
    LocalDate createDate;
    Group[] groups;// ds cac group ma account nay tham gia

}
