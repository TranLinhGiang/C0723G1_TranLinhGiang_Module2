package bai_tap_hoc_lai.ss05_access_modifier;

public class Staff {
    private String name;              // Sử dụng private để thể hiện sự bao đóng
    private String phoneNumber;       // Sử dụng private để thể hiện sự bao đóng
    private String workingParts;      // Sử dụng private để thể hiện sự bao đóng
    private String companyName;       // Sử dụng private để thể hiện sự bao đóng

    public Staff() {
    }

    public Staff(String name, String phoneNumber, String workingParts, String companyName) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.workingParts = workingParts;
        this.companyName = companyName;
    }


    // Cung cấp phương thức setter và getter là public để có thể sửa đổi và xem các giá trị biến.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkingParts() {
        return workingParts;
    }

    public void setWorkingParts(String workingParts) {
        this.workingParts = workingParts;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Staff{ " +
                "Ten nhan vien: " + name + '\'' +
                "| Sdt: " + phoneNumber +
                "| Bo phan lam viec: " + workingParts + '\'' +
                "| Ten cong ty: " + companyName + '\'' +
                '}';
    }

    public static class Test {       // class Test phải sử dụng từ khóa static truy cập trực tiếp thông qua lớp Staff mà không cần khởi tạo.
        public static void main(String[] args) {
            Staff staff = new Staff();
            staff.setName("Tran Linh Giang");           // chấm tới set để có thể thay đổi thông tin
            staff.setPhoneNumber("0705239885");
            staff.setWorkingParts("Hoc vien");
            staff.setCompanyName("Code Gym");
            System.out.println(staff);
        }
    }
}
