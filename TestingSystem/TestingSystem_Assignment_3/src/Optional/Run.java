package Optional;
import entity.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Run {
    public static void main(String[] args) {
        //Department
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";

        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "IT";
        //Position
        Position position1 = new Position();
        position1.positionId = 1;
        position1.positionName = PositionName.Dev;

        Position position2 = new Position();
        position2.positionId = 2;
        position2.positionName = PositionName.Test;

        Position position3 = new Position();
        position3.positionId = 3;
        position3.positionName = PositionName.PM;
        //Account
        Account account1 = new Account();
        account1.accountId = 1;
        account1.userName = "userA";
        account1.fullName = "Nguyễn Văn A";
        account1.email = "nguyenvanA@gmail.com";
        account1.department = department1;
        account1.position = position1;
        account1.createDate = LocalDate.now();


        Account account2 = new Account();
        account2.accountId = 2;
        account2.userName = "userB";
        account2.fullName = "Nguyễn Văn B";
        account2.email = "NguyenVanB@gmail.com";
        account2.department = department2;
        account2.position = position2;
        account2.createDate = LocalDate.now();


        Account account3 = new Account();
        account3.accountId = 3;
        account3.userName = "userC";
        account3.fullName = "Nguyễn Văn C";
        account3.email = "NguyenVanC@gmail.com";
        account3.department = department3;
        account3.position = position3;
        account3.createDate = LocalDate.now();

        //Group
        Group group1 = new Group();
        group1.groupId = 1;
        group1.groupName = "Java Fresher";
        group1.creator = account1;
        group1.accounts = new Account[]{account1};
        group1.createDate=LocalDate.now();

        Group group2 = new Group();
        group2.groupId = 2;
        group2.groupName = "C# Fresher";
        group2.creator = account2;
        group2.accounts = new Account[]{account2, account1};
        group1.createDate=LocalDate.now();

        Group group3 = new Group();
        group3.groupId = 3;
        group3.groupName = "Python Fresher";
        group3.creator = account3;
        group3.accounts = new Account[]{account1, account2, account3};
        group1.createDate=LocalDate.now();

        //CategororyQuestion
        CategoryQuestion categoryQuestion1=new CategoryQuestion();
        categoryQuestion1.categoryId=1;
        categoryQuestion1.categoryName="Java";

        CategoryQuestion categoryQuestion2=new CategoryQuestion();
        categoryQuestion2.categoryId=2;
        categoryQuestion2.categoryName="SQl";

        CategoryQuestion categoryQuestion3=new CategoryQuestion();
        categoryQuestion3.categoryId=3;
        categoryQuestion3.categoryName="HTLM";

        //TypeQuestion
        TypeQuestion typeQuestion1=new TypeQuestion();
        typeQuestion1.typeId=1;
        typeQuestion1.typeName =TypeName.Essay;

        TypeQuestion typeQuestion2=new TypeQuestion();
        typeQuestion2.typeId=2;
        typeQuestion2.typeName=TypeName.Multiple_Choice;

        TypeQuestion typeQuestion3=new TypeQuestion();
        typeQuestion3.typeId=3;
        typeQuestion3.typeName=TypeName.Multiple_Choice;

        //Exam
        Exam exam1=new Exam();
        exam1.examId=1;
        exam1.code="EX01";
        exam1.title="Java core";
        exam1.category=categoryQuestion1;
        exam1.duration=60;
        exam1.creator=account1;
        exam1.createDate= LocalDateTime.now();

        Exam exam2=new Exam();
        exam2.examId=2;
        exam2.code="EX02";
        exam2.title="SQl Basic";
        exam2.category=categoryQuestion1;
        exam2.duration=90;
        exam2.creator=account2;
        exam2.createDate=LocalDateTime.now();

        Exam exam3=new Exam();
        exam3.examId=3;
        exam3.code="EX03";
        exam3.title="Postman Test";
        exam3.category=categoryQuestion1;
        exam3.duration=60;
        exam3.creator=account1;
        exam3.createDate=LocalDateTime.now();



        //Gán Group cho account
        Data.account1 = account1;
        account1.groups = new Group[]{group1};
        Data.account2 = account2;
        account2.groups = new Group[]{group1, group2};
        Data.account3 = account3;
        account3.groups = new Group[]{group1, group2, group3};

        Account[] accounts = {account1, account2, account3};
        Department[] departments = {department1, department2, department3};
        Exam[] exams={exam1,exam2,exam3};
        Group[] groups={group1,group2,group3};



        Exercise5.question_6();
    }
}
