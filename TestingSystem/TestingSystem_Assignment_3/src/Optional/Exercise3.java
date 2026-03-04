package Optional;

public class Exercise3 {
    //uestion 1: Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
    // Sau đó convert lương ra float và hiển thị lương lên màn hình
    // (với số float có 2 số sau dấu thập phân)
    public static void question_1(){
        Integer luong=5000;
        float luong_f=luong.floatValue();
        System.out.printf("%.2f",luong_f);
    }
//    Question 2:
//    Khai báo 1 String có value = "1234567"
//    Hãy convert String đó ra số int
    public static void question_2(){
        String value="1234567";
        int number=Integer.parseInt(value);
        System.out.println(number);
    }
    //Question 3:
    //Khởi tạo 1 số Integer có value là chữ "1234567"
    //Sau đó convert số trên thành datatype int
    public static void question_3() {

        // Cách đúng
        Integer numberObject = Integer.valueOf("1234567");

        // Convert sang int (unboxing)
        int number = numberObject;

        System.out.println("Integer: " + numberObject);
        System.out.println("int: " + number);
    }
}
