import java.time.format.DateTimeFormatter;

public class Exercise1 {
    //Question 1:
    //Kiểm tra account thứ 2
    //Nếu không có phòng ban (tức là department == null) thì sẽ in ra text
    //"Nhân viên này chưa có phòng ban"
    //Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
    public static void question_1(Account account2) {
        if (account2==null||account2.department==null){
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
        if (account2 == null || account2.groups == null || account2.groups.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        }
        else if(account2.groups.length==1){
            System.out.println("Group của nhân viên này là: "+account2.groups[0].groupName);
        }
        else if (account2.groups.length==2){
            System.out.println("Group của nhân viên này là: "+account2.groups[0].groupName+", "+account2.groups[1].groupName);
        } else if (account2.groups.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    //    Question 3:
//    Sử dụng toán tử ternary để làm Question 1
    public static void question_3(Account account2) {
        String Check = (account2.department == null || account2 == null)
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
        String s = (account1.position != null && account1.position.positionName == PositionName.Dev)
                ? "Đây là Developer" : "Người này không phải là Developer";
        System.out.println(s);
    }

    //SWITCH CASE
    //Question 5:
    //Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
    // Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
    //Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
    //Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
    //Còn lại in ra "Nhóm có nhiều thành viên
    public static void question_5(Group group1) {
        if (group1 == null) {
            System.out.println("Group không tồn tại!");
            return;
        }
        int count = (group1.accounts == null) ? 0 : group1.accounts.length;
        switch (count) {
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
        if (account2 == null) {
            System.out.println("Account không tồn tại!");
            return;
        }
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
        if (account1 == null || account1.position == null) {
            System.out.println("Account không tồn tại hoặc chưa có Position");
            return;
        }
        switch (account1.position.positionName) {
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
            if (account == null) {
                continue;
            }
            System.out.println("Email: " + account.email);
            System.out.println("FullName: " + account.fullName);
            if (account.department != null) {
                System.out.println("Phòng ban: " + account.department.departmentName);
            } else
                System.out.println("Phòng Ban: null");
        }
    }

    //Question 9:
    //In ra thông tin các phòng ban bao gồm: id và name
    public static void question_9(Department[] departments) {
        if (departments == null || departments.length == 0) return;
        int i = 1;
        for (Department department : departments) {
            if (department == null) continue;
            System.out.println("Thông tin phòng ban thứ  " + i + " là: ");
            System.out.println("DepartmentID: " + department.departmentId);
            System.out.println("DeparmentName: " + department.departmentName);
            i++;
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
        if (accounts == null || accounts.length == 0) return;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) continue;
            System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
            System.out.println("Email:" + accounts[i].email);
            System.out.println("Full name:" + accounts[i].fullName);
            String check = (accounts[i].department == null) ? "Chưa có phòng ban" : accounts[i].department.departmentName;
            System.out.println("Phòng ban:" + check);
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
        if (departments == null || departments.length == 0) return;
        for (int i = 0; i < departments.length; i++) {
            if (departments[i] == null) continue;
            if (i==2) break;
            System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
            System.out.println("DepartmentId: " + departments[i].departmentId);
            System.out.println("DepartmentName: " + departments[i].departmentName);
        }
    }

    //Question 12:
    //Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
    public static void question_12(Account[] accounts) {
        if (accounts==null||accounts.length==0) return;
        for (int i = 0; i <accounts.length ; i++) {
            if(accounts[i]==null) continue;
            if (i==2) return;
            System.out.println("Thông tin account thứ "+(i+1)+" là: ");
            System.out.println("Email: "+accounts[i].email);
            System.out.println(("Full name: "+accounts[i].fullName));
            String check=(accounts[i].department==null)?"Phòng Ban Không Tồn Tại":String.valueOf(accounts[i].department.departmentId);
            System.out.println("DepartmentId: "+check);
            String check1=(accounts[i].department==null)?"Chưa Có Phòng Ban":accounts[i].department.departmentName;
            System.out.println("Phòng Ban: "+check1);
        }
    }

    //Question 13:
    //In ra thông tin tất cả các account ngoại trừ account thứ 2
    public static void question_13(Account[] accounts) {
        if (accounts == null || accounts.length == 0) return;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) continue;
            if (i == 1) {
                continue;
            }
            System.out.println("thông tin caccount thứ " + (i + 1) + " là: ");
            System.out.println("Id: " + accounts[i].accountId);
            System.out.println("UserName: " + accounts[i].userName);
            System.out.println("FullName: " + accounts[i].fullName);
            String check1 = (accounts[i].department == null) ? "Chưa có phòng ban" : accounts[i].department.departmentName;
            System.out.println("Phòng ban: " + check1);
            String check2 = (accounts[i].position == null) ? "Chưa có chức vụ" : accounts[i].position.positionName.toString();
            System.out.println("Chức Vụ: " + check2);
            String check3 = (accounts[i].groups == null) ? "Chưa có nhóm" : String.valueOf(accounts[i].groups.length);
            System.out.println("Số Group: " + check3);
            System.out.println("Ngày tạo: " + accounts[i].createDate);
        }
    }

    //Question 14:
    //In ra thông tin tất cả các account có id < 4
    public static void question_14(Account[] accounts) {
        if (accounts == null || accounts.length == 0) return;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) continue;
            if (accounts[i].accountId < 4) {
                System.out.println("thông tin account thứ " + (i + 1) + "là: ");
                System.out.println("Id: " + accounts[i].accountId);
                System.out.println("UserName: " + accounts[i].userName);
                System.out.println("FullName: " + accounts[i].fullName);
                String check1 = (accounts[i].department == null) ? "Chưa có phòng ban" : accounts[i].department.departmentName;
                System.out.println("Phòng ban: " + check1);
                String check2 = (accounts[i].position == null) ? "Chưa có chức vụ" : accounts[i].position.positionName.toString();
                System.out.println("Chức Vụ: " + check2);
                String check3 = (accounts[i].groups == null) ? "Chưa có nhóm" : String.valueOf(accounts[i].groups.length);
                System.out.println("Số Group: " + check3);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                System.out.println("Ngày tạo: " + accounts[i].createDate.format(formatter));
            }
        }
    }

    //Question 15:
    //In ra các số chẵn nhỏ hơn hoặc bằng 20
    public static void question_15() {
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }

    //Question 16:
    //Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với lệnh break, continu
    public static void question16_10(Account[] accounts) {
        if (accounts == null || accounts.length == 0) return;
        int i = 0;
        while (i < accounts.length) {
            if (accounts[i] == null) {
                i++;
                continue;
            }
            System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full Name: " + accounts[i].fullName);
            String check = (accounts[i].department == null) ? "Chưa có phòng ban" : accounts[i].department.departmentName;
            System.out.println("Phòng Ban: " + check);
            if (i == 1) break;
            i++;
        }
    }

    //In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
    //Thông tin department thứ 1 là:
    //	 	 	Id: 1
    //	 	 	Name: Sale
    //Thông tin department thứ 2 là:
    //	 	 	Id: 2
    //	 	 	Name: Marketing
    public static void question16_11(Department[] departments) {
        if (departments == null || departments.length == 0) return;
        int i = 0;
        while (i < departments.length) {
            if (departments[i] == null) {
                i++;
                continue;
            }
            if(i==2)break;
            System.out.println("Thông tin phòng ban thứ " + (i + 1) + " là: ");
            System.out.println("DepartmentID: " + departments[i].departmentId);
            System.out.println("DepartmentName: " + departments[i].departmentName);
            i++;
        }
    }

    //Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
    public static void question16_12(Department[] departments) {
        if (departments == null || departments.length == 0) return;
        int i = 0;
        while (i < departments.length) {
            if (departments[i] == null) {
                i++;
                continue;
            }
            if (i == 2) break;
            System.out.println("Thông tin phòng ban thứ " + (i + 1) + " là: ");
            System.out.println("DepartmentID: " + departments[i].departmentId);
            System.out.println("DepartmentName: " + departments[i].departmentName);
            i++;
        }
    }

    //In ra thông tin tất cả các account ngoại trừ account thứ 2
    public static void question16_13(Account[] accounts) {
        if (accounts == null || accounts.length == 0) return;
        int i = 0;
        while (i < accounts.length) {
            if (accounts[i] == null) {
                i++;
                continue;
            }
            if (i == 1) {
                i++;
                continue;
            }
            System.out.println("Thông tin account thứ " + (i + 1) + "là: ");
            System.out.println("UserName: " + accounts[i].userName);
            System.out.println("FullName: " + accounts[i].fullName);
            System.out.println("Email: " + accounts[i].email);
            String check = (accounts[i].department == null) ? "chưa có phòng ban" : accounts[i].department.departmentName;
            System.out.println("Phòng ban: " + check);
            String check1 = (accounts[i].position == null) ? "Chưa có chức vụ" : accounts[i].position.positionName.toString();
            System.out.println("Position: " + check1);
            String check2 = (accounts[i].groups == null) ? "Chưa có Group" : String.valueOf(accounts[i].groups.length);
            System.out.println("Group: " + check2);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Ngày Tạo: " + accounts[i].createDate.format(formatter));
            i++;
        }
    }
//    Question 14:
//    In ra thông tin tất cả các account có id < 4

    public static void question16_14(Account[] accounts) {
        if (accounts == null || accounts.length == 0) return;
        int i = 0;
        while (i < accounts.length) {
            if (accounts[i] == null) {
                i++;
                continue;
            }
            if (accounts[i].accountId >= 4) {
                i++;
                continue;
            }
            System.out.println("Thông tin account thứ " + (i + 1) + "là: ");
            System.out.println("UserName: " + accounts[i].userName);
            System.out.println("FullName: " + accounts[i].fullName);
            System.out.println("Email: " + accounts[i].email);
            String check = (accounts[i].department == null) ? "chưa có phòng ban" : accounts[i].department.departmentName;
            System.out.println("Phòng ban: " + check);
            String check1 = (accounts[i].position == null) ? "Chưa có chức vụ" : accounts[i].position.positionName.toString();
            System.out.println("Position: " + check1);
            String check2 = (accounts[i].groups == null) ? "Chưa có Group" : String.valueOf(accounts[i].groups.length);
            System.out.println("Group: " + check2);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Ngày Tạo: " + accounts[i].createDate.format(formatter));
            i++;
        }
    }
//    Question 15:
//    In ra các số chẵn nhỏ hơn hoặc bằng 20

    public static void question16_15() {
        int i = 0;
        while (i <= 20) {
            System.out.print(i+" ");
            i += 2;
        }
    }

    //DO-WHILE
    //Question 17:
    //Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với lệnh break, continue
    //Question 10:
    //In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ theo định dạng như sau:
    //Thông tin account thứ 1 là:
    //Email: NguyenVanA@gmail.com
    //Full name: Nguyễn Văn A
    //Phòng ban: Sale
    //
    //Thông tin account thứ 2 là:
    //Email: NguyenVanB@gmail.com
    //Full name: Nguyễn Văn B
    //Phòng ban: Marketting
    public static void question17_10(Account[] accounts) {
        if (accounts == null || accounts.length == 0) return;
        int i = 0;
        do {
            if (accounts[i] == null) {
                i++;
                continue;
            }
            if (i==2) break;
            System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
            System.out.println("FullName: " + accounts[i].fullName);
            System.out.println("Email: " + accounts[i].email);
            String check = (accounts[i].department == null) ? "chưa có phòng ban" : accounts[i].department.departmentName;
            System.out.println("Phòng ban: " + check);
            i++;
        } while (i < accounts.length);

    }
    //In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
    //Thông tin department thứ 1 là:
    //	 	 	Id: 1
    //	 	 	Name: Sale
    //Thông tin department thứ 2 là:
    //	 	 	Id: 2
    //	 	 	Name: Marketing
    public static void question17_11(Department[] departments){
        if (departments==null||departments.length==0) return;
        int i=0;
        do {
            if(departments[i]==null){
                i++;
                continue;
            }
            if (i==2)break;
            System.out.println("Thông tin phòng ban thứ "+(i+1)+" là:");
            System.out.println("DepartmentID: "+departments[i].departmentId);
            System.out.println("DepartmentName: "+departments[i].departmentName);
            i++;
        }while (i<departments.length);
    }
    //Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
    public static void question17_12(Department[] departments){
        if (departments==null||departments.length==0) return;
        int i=0;
        do {
            if(departments[i]==null){
                i++;
                continue;
            }
            if (i==2)break;
            System.out.println("Thông tin phòng ban thứ "+(i+1)+" là:");
            System.out.println("DepartmentID: "+departments[i].departmentId);
            System.out.println("DepartmentName: "+departments[i].departmentName);
            i++;
        }while (i<departments.length);
    }

}
