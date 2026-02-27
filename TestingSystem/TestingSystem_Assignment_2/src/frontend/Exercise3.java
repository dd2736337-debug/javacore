package frontend;

import entity.Exam;

import java.time.format.DateTimeFormatter;

public class Exercise3 {
    //Question 1:
    //In ra thông tin Exam thứ 1 và property create date sẽ được format theo định dạng vietnamese
    public static void question_1(Exam[] exams) {
        if (exams == null || exams.length == 0) return;
        Exam exam1 = exams[0];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Thông tin Exam thứ 1:");
        System.out.println("ID: " + exam1.examId);
        System.out.println("Code: " + exam1.code);
        System.out.println("Title: " + exam1.title);
        System.out.println("category: " + exam1.category.categoryName);
        System.out.println("duration: " + exam1.duration);
        System.out.println("creator: " + exam1.creator.fullName);
        System.out.println("createDate: " + exam1.createDate.format(formatter));
    }

    //    Question 2:
//    In ra thông tin: Exam đã tạo ngày nào theo định dạng
//    Năm – tháng – ngày – giờ – phút – giây
    public static void question_2(Exam[] exams) {
        if (exams == null || exams.length == 0) {
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        for (Exam exam : exams) {
            System.out.println("ID: " + exam.examId);
            System.out.println("Code: " + exam.code);
            System.out.println("Title: " + exam.title);
            System.out.println("Category: " + exam.category.categoryName);
            System.out.println("Duration: " + exam.duration);
            System.out.println("Creator: " + exam.creator.fullName);
            System.out.println("Crreate Date: " + exam.createDate.format(formatter));
            System.out.println("-----------");
        }
    }

    //
    //Question 3:
    //Chỉ in ra năm của create date property trong Question 2
    public static void question_3(Exam[] exams) {
        if (exams == null || exams.length == 0) {
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        for (Exam exam : exams) {
            System.out.println("ID: " + exam.examId);
            System.out.println("Code: " + exam.code);
            System.out.println("Title: " + exam.title);
            System.out.println("Category: " + exam.category.categoryName);
            System.out.println("Duration: " + exam.duration);
            System.out.println("Creator: " + exam.creator.fullName);
            System.out.println("Năm: " + exam.createDate.format(formatter));
            System.out.println("-----------");
        }
    }

    //Question 4:
    //Chỉ in ra tháng và năm của create date property trong Question 2
    public static void question_4(Exam[] exams) {
        if (exams == null || exams.length == 0) {
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yyyy");
        for (Exam exam : exams) {
            System.out.println("ID: " + exam.examId);
            System.out.println("Code: " + exam.code);
            System.out.println("Title: " + exam.title);
            System.out.println("Category: " + exam.category.categoryName);
            System.out.println("Duration: " + exam.duration);
            System.out.println("Creator: " + exam.creator.fullName);
            System.out.println("Năm: " + exam.createDate.format(formatter));
            System.out.println("-----------");
        }
    }

    //    Question 5:
//    Chỉ in ra "MM-DD" của create date trong Question 2
    public static void question_5(Exam[] exams) {
        if (exams == null || exams.length == 0) {
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
        for (Exam exam : exams) {
            System.out.println("ID: " + exam.examId);
            System.out.println("Code: " + exam.code);
            System.out.println("Title: " + exam.title);
            System.out.println("Category: " + exam.category.categoryName);
            System.out.println("Duration: " + exam.duration);
            System.out.println("Creator: " + exam.creator.fullName);
            System.out.println("Năm: " + exam.createDate.format(formatter));
            System.out.println("-----------");
        }
    }


}
