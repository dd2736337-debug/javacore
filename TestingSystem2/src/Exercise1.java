public class Exercise1 {
    //Question 1:
    //Kiểm tra account thứ 2
    //Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
    //"Nhân viên này chưa có phòng ban"
    //Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
    public static void question_1(Account account2) {
        if (account2 == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + account2.department.departmentName);
        }
    }

    //Question 2:
    //Kiểm tra account thứ 2
    //Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
    //Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này
    // là Java Fresher, C# Fresher"
    //Nếu có mặt trong 3 Group thì sẽ in ra text
    // "Nhân viên này là người quan trọng, tham gia nhiều group"
    //Nếu có mặt trong 4 group trở lên thì sẽ in ra text
    // "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
    public static void question_2(Account account2) {
        if (account2.groups == null || account2.groups.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (account2.groups.length <= 2) {
            System.out.println("Group của nhân viên này là: ");
            for (Group group : account2.groups) {
                System.out.println(group.groupName + " ");
            }
        } else if (account2.groups.length <= 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    //    Question 3:
//    Sử dụng toán tử ternary để làm Question 1
    public static void question_3(Account account2) {
        String Check = (account2.department == null)
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: " + account2.department.departmentName;
        System.out.println(Check);
    }

    //Question 4:
    //Sử dụng toán tử ternary để làm yêu cầu sau:
    //Kiểm tra Position của account thứ 1
    //Nếu Position = Dev thì in ra text "Đây là Developer"
    //Nếu không phải thì in ra text "Người này không phải là Developer"
    public static void question_4(Account account1) {
        String s = (account1.position == PositionName.Dev)
                ? "Đây là Developer" : "Người này không phải là Developer";
    }

    //SWITCH CASE
    //Question 5:
    //Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
    // Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
    //Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
    //Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
    //Còn lại in ra "Nhóm có nhiều thành viên
    public static void question_5(Group group1) {
        int dem = (group1.accounts == null) ? 0 : group1.accounts.length;
        switch (dem) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
        }
    }

    //Question 6:
    //Sử dụng switch case để làm lại Question 2
    public static void question_6(Account account2) {
        int count = (account2.groups == null) ? 0 : account2.groups.length;
        switch (count) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
                System.out.println("Nhân viên này có 1 group");
                break;
            case 2:
                System.out.println("nhân viên này có 2 group");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    //Question 7:
    //Sử dụng switch case để làm lại Question 4
    public static void question_7(Account account1) {
        switch (account1.position) {
            case Dev:
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Develope");
        }
    }

    //    Question 8:
//    In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
    public static void question_8(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println(account.email);
            System.out.println(account.fullName);
            if (account.department != null) {
                System.out.println("Phòng ban: " + account.department.departmentName);
            } else
                System.out.println("Phòng Ban: null");
        }
    }

    //Question 9:
    //In ra thông tin các phòng ban bao gồm: id và name
    public static void question_9(Department[] departments) {
        if (departments == null) return;
        for (Department department : departments) {
            if (department == null) continue;
            System.out.println(department.departmentId);
            System.out.println(department.departmentName);
        }
    }
    //For
    //Question 10:
    //In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ theo định dạng như sau:
    //Thông tin account thứ 1 là:
    //Email: NguyenVanA@gmail.com
    //Full name: Nguyễn Văn A
    //Phòng ban: Sale

    //Thông tin account thứ 2 là:
    //Email: NguyenVanB@gmail.com
    //Full name: Nguyễn Văn B
    //Phòng ban: Marketting
    public static void question_10(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ 1 là:" + (i + 1));
            System.out.println("Email:" + accounts[i].email);
            System.out.println("Full name:" + accounts[i].fullName);
            System.out.println("Phòng ban:" + accounts[i].department.departmentName);
            System.out.println("Thông tin account thứ 2 là:" + (i + 2));
            System.out.println("Email:" + accounts[i].email);
            System.out.println("Full name:" + accounts[i].fullName);
            System.out.println("Phòng ban:" + accounts[i].department.departmentName);
        }
    }

    //Question 11:
    //In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
    //Thông tin department thứ 1 là:
    //	 	 	Id: 1
    //	 	 	Name: Sale
    //Thông tin department thứ 2 là:
    //	 	 	Id: 2
    //	 	 	Name: Marketing
    public static void question_11(Department[] departments) {
        for (int i = 0; i < departments.length; i++) {
            if (departments==null) return;
            System.out.println("Thông tin department thứ 1 là: "+(i+1));
            System.out.println("Id: "+departments[i].departmentId);
            System.out.println("Name: "+departments[i].departmentId);
            System.out.println("Thông tin department thứ 2 là: "+(i+2));
            System.out.println("Id: "+departments[i].departmentId);
            System.out.println("Name: "+departments[i].departmentId);
        }
    }



}
