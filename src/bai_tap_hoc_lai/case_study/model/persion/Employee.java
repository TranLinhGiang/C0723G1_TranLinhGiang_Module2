package bai_tap_hoc_lai.case_study.model.persion;

public class Employee extends Person {
    private String lever;
    private String location;  // vi tri
    private double salary;

    public Employee() {
    }

    public Employee(String id, String name, String dateOfBirth, String gender, String idCardNumber, String phoneNumber, String email, String lever, String location, double salary) {
        super(id, name, dateOfBirth, gender, idCardNumber, phoneNumber, email);
        this.lever = lever;
        this.location = location;
        this.salary = salary;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Mã ='" + getId() + '\'' +
                ", Họ và tên='" + getName() + '\'' +
                ", Ngày tháng năm sinh='" + getDateOfBirth() + '\'' +
                ", Giới tính='" + getGender() + '\'' +
                ", Số chứng minnh nhân dân='" + getIdCardNumber() + '\'' +
                ", Số điện thoại='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", Trình độ='" + lever + '\'' +
                ", Vị trí='" + location + '\'' +
                ", Lương=" + salary +
                '}';
    }
}
