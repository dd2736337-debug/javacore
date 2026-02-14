import java.time.LocalDate;

public class Account {
    int accountId;
    String userName;
    String fullName;
    String email;
    Department department;                                                                                                                // lay ten doi tuong
    PositionName position;
    LocalDate createDate;
    Group[] groups;
}
