package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {
    public int accountId;
    public String userName;
    public String fullName;
    public String email;
    public Department department;                                                                                                                // lay ten doi tuong
    public Position position;
    public LocalDate createDate;
    public Group[] groups;

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", userName='" + userName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", department=" + department +
                ", position=" + position +
                ", createDate=" + createDate +
                ", groups=" + Arrays.toString(groups) +
                '}';
    }
}
