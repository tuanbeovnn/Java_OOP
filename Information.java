package Excercise_Dat4;

import java.util.ArrayList;
import java.util.Scanner;

/*Khi người dùng nhập “add”:
        • Nhập thông tin nhân viên.
        • Các thông tin như tên, giới tính, ngày tháng năm sinh và số điện thoại bắt buộc phải
        nhập. Các thông tin khác có thể bỏ qua.
        • Mã nhân viên được phát sinh tự động.
        • Giới tính chỉ được phép nhập nam hoặc nữ.
        • Ngày tháng năm sinh phải đủ 10 ký tự (dd/mm/yyyy).
        • Trình độ chuyên môn chỉ được phép nhập “Trung cấp” hoặc “Cao đẳng” hoặc “Đại
        học”
        -Khi người dùng nhập “display”: Hiển thị thông tin nhân viên. Lưu ý nếu người dùng chưa thực hiện thao tác “add”, ứng dụng sẽ hiển thị thông báo “Not found information”
        Khi người dùng nhập “update”: Cho phép người dùng cập nhật tất cả các thông tin,
        ngoại trừ mã nhân viên.
        -Khi người dùng nhập “find”:
        • Ứng dụng cho phép người dùng tìm kiếm nhân viên theo mã số hoặc theo tên. Nếu
        tìm thấy sẽ hiển thị thông tin nhân viên tương ứng. Ngược lại hiển thị thông báo
        “Not found information”.
        Sau khi thực hành xong bài này, học viên có khả năng :
        • Khai báo được lớp
        • Khai báo được thuộc tính
        • Khai báo được phương thức, phương thức khởi tạo
        • Tạo đối tượng, truy cập thuộc tính, phương thức
        • Trước khi thực hiện tìm kiếm, ứng dụng phải yêu cầu người dùng nhập mã số hoặc
        tên. Hiển thị thông báo “Please enter your information” nếu người dùng chưa nhập*/
public class Information {
    private String name;
    private String gender;
    private String phoneNumber;
    private Date date;
    private int staffId;
    private String level;
    private static int counter = 0;

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Information.counter = counter;
    }

    public Information() {
        staffId = ++counter;
    }

    public void askData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        this.name = new Scanner(System.in).nextLine();
        System.out.println("Enter Gender");
        this.gender = new Scanner(System.in).nextLine();
        System.out.println("Enter Phone Number");
        this.phoneNumber = new Scanner(System.in).nextLine();
        System.out.println("Input date below (dd.mm.yyyy):");
        String birthday = new Scanner(System.in).nextLine();
        date = new Date(Integer.parseInt(birthday.substring(0,2)), Integer.parseInt(birthday.substring(3,5)),
                Integer.parseInt(birthday.substring(6,101)));
        while (true){
            System.out.println("Enter Level");
            this.level = new Scanner(System.in).nextLine();
            if (!this.level.equals("TC")){
                System.out.println("Please enter again");
            }
            System.out.print("Enter to input... (q to quit): ");
            String inputLevel = scanner.nextLine();
            if (inputLevel.equals("q"))
                break;
        }
    }

    public Information(String name, String gender, String phoneNumber, Date date, int staffId, String level) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.staffId = staffId;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("Information: Name= %s, Gender= %s, PhoneNumber= %s, Date= %s, StaffId= %s, Level= %s",
                name,gender,phoneNumber,date,staffId,level);
    }
}
