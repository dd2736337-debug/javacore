import java.time.LocalDate;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        //Department
        Department department1=new Department();
        department1.departmentId=1;
        department1.departmentName="Sale";

        Department department2=new Department();
        department2.departmentId=2;
        department2.departmentName="Marketing";

        Department department3=new Department();
        department3.departmentId=3;
        department3.departmentName="IT";
        //Position
        Position position1=new Position();
        position1.positionId=1;
        position1.positionName=PositionName.Dev;

        Position position2=new Position();
        position2.positionId=2;
        position2.positionName=PositionName.Test;

        Position position3=new Position();
        position3.positionId=3;
        position3.positionName=PositionName.PM;
        //Account
        Account account1=new Account();
        account1.accountId=1;
        account1.userName="userA";
        account1.fullName="Nguyễn Văn A";
        account1.email="NguyenVanA@gmail.com";
        account1.department=department1;
        account1.position=position1;
        account1.createDate= LocalDate.now();

        Account account2=new Account();
        account2.accountId=2;
        account2.userName="userB";
        account2.fullName="Nguyễn Văn B";
        account2.email="NguyenVanB@gmail.com";
        account2.department=department2;
        account2.position=position2;
        account2.createDate=LocalDate.now();

        Account account3=new Account();
        account3.accountId=3;
        account3.userName="userC";
        account3.fullName="Nguyễn Văn C";
        account3.email="NguyenVanC@gmail.com";
        account3.department=department3;
        account3.position=position3;
        account3.createDate=LocalDate.now();

        Exercise1.question_2(account2);

    }
}
