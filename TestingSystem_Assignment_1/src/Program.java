import entity.*;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";

        Department department3 = new Department();
        department2.departmentId = 3;
        department2.departmentName = "IT";

        Position position1 = new Position();
        position1.positionId = 1;
        position1.positionName = PositionName.Dev;

        Position position2 = new Position();
        position2.positionId = 2;
        position2.positionName = PositionName.PM;

        Position position3 = new Position();
        position3.positionId = 3;
        position3.positionName = PositionName.Test;

        Account account1 = new Account();
        account1.accountId = 1;
        account1.email = "hung@gmail.com";
        account1.userName = "user1";
        account1.fullName = "Mạnh Hùng";
        account1.department = department1;
        account1.position = position1;
        account1.createDate = LocalDate.now();

        Account account2 = new Account();
        account2.accountId = 2;
        account2.email = "son@gmail.com";
        account2.userName = "user2";
        account2.fullName = "Hồng Sơn";
        account2.department = department2;
        account2.position = position2;
        account2.createDate = LocalDate.now();

        Account account3 = new Account();
        account3.accountId = 3;
        account3.email = "dat@gmail.com";
        account3.userName = "user3";
        account3.fullName = "Nguyễn Đạt";
        account3.department = department3;
        account3.position = position3;
        account3.createDate = LocalDate.now();

        Group group1 = new Group();
        group1 .groupId = 1;
        group1 .groupName = "Java";
        group1 .creator = account1;
        group1 .createDate = LocalDate.now();

        Group group2 = new Group();
        group2.groupId = 2;
        group2.groupName = "SQL";
        group2.creator = account2;
        group2.createDate = LocalDate.now();

        Group group3 = new Group();
        group3.groupId = 3;
        group3.groupName = "Text";
        group3.creator = account3;
        group3.createDate = LocalDate.now();

        GroupAccount groupaccount1 = new GroupAccount();
        groupaccount1.group = group1;
        groupaccount1.account = account1;
        groupaccount1.joinDate = LocalDate.now();

        GroupAccount groupaccount2 = new GroupAccount();
        groupaccount1.group = group2;
        groupaccount1.account = account2;
        groupaccount1.joinDate = LocalDate.now();

        GroupAccount groupaccount3 = new GroupAccount();
        groupaccount3.group = group3;
        groupaccount3.account = account3;
        groupaccount3.joinDate = LocalDate.now();

        TypeQuestion typequestion1 = new TypeQuestion();
        typequestion1.typeId = 1;
        typequestion1.typeName = TypeName.Essay;

        TypeQuestion typequestion2 = new TypeQuestion();
        typequestion2.typeId = 2;
        typequestion2.typeName = TypeName.Multiple_Choice;

        TypeQuestion typequestion3 = new TypeQuestion();
        typequestion3 .typeId = 3;
        typequestion3 .typeName = TypeName.Essay;

        CategoryQuestion categoryquestion1 = new CategoryQuestion();
        categoryquestion1.categoryId = 1;
        categoryquestion1.categoryName = "Java";

        CategoryQuestion categoryquestion2 = new CategoryQuestion();
        categoryquestion2.categoryId = 2;
        categoryquestion2.categoryName = "SQL";

        CategoryQuestion categoryquestion3 = new CategoryQuestion();
        categoryquestion3.categoryId = 3;
        categoryquestion3.categoryName = "Text";

        Question question1 = new Question();
        question1.questionId = 1;
        question1.conTent = "Java Là Gì";
        question1.category = categoryquestion1;
        question1.typequestion = typequestion1;
        question1.creator = account1;
        question1.createDate = LocalDate.now();

        Question question2 = new Question();
        question1.questionId = 2;
        question1.conTent = "SQL Là Gì";
        question1.category = categoryquestion2;
        question1.typequestion = typequestion2;
        question1.creator = account2;
        question1.createDate = LocalDate.now();

        Question question3 = new Question();
        question3.questionId = 3;
        question3.conTent = "Text Care?";
        question3.category = categoryquestion3;
        question3.typequestion = typequestion3;
        question3.creator = account3;
        question3.createDate = LocalDate.now();

        Answer answer1 = new Answer();
        answer1.answerId = 1;
        answer1.conTent = "Java là ngôn ngữ";
        answer1.question = question1;
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.answerId = 2;
        answer2.conTent = "SQL là ngôn ngữ truy vấn";
        answer2.question = question2;
        answer2.isCorrect = true;

        Answer answer3 = new Answer();
        answer3.answerId = 3;
        answer3.conTent = "Sai";
        answer3.question = question3;
        answer3.isCorrect = false;
        Exam exam1 = new Exam();
        exam1.examId = 1;
        exam1.code = "E01";
        exam1.title = "Java Basic";
        exam1.category = categoryquestion1;
        exam1.duration = 90;
        exam1.creator = account1;
        exam1.createDate = LocalDate.now();

        Exam exam2 = new Exam();
        exam2.examId = 2;
        exam2.code = "E02";
        exam2.title = "SQL Basic";
        exam2.category = categoryquestion2;
        exam2.duration = 90;
        exam2.creator = account2;
        exam2.createDate = LocalDate.now();

        Exam exam3 = new Exam();
        exam2.examId = 3;
        exam2.code = "E03";
        exam2.title = "Text Basic";
        exam2.category = categoryquestion3;
        exam2.duration = 60;
        exam2.creator = account3;
        exam2.createDate = LocalDate.now();

        ExamQuestion examquestion1 = new ExamQuestion();
        examquestion1.exam = exam1;
        examquestion1.question = question1;

        ExamQuestion examquestion2 = new ExamQuestion();
        examquestion2.exam = exam2;
        examquestion2.question = question2;

        ExamQuestion examquestion3 = new ExamQuestion();
        examquestion3.exam=exam3 ;
        examquestion3.question = question3;

        BaiTap.question_22();




    }
}
