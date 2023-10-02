package bai_tap_hoc_lai.ss20_mvc.model;

public class Employee extends Human {
    private String lever;

    public Employee() {
    }

    public Employee(String id, String name, int age, String dateOfBirthday, String address, String lever) {
        super(id, name, age, dateOfBirthday, address);
        this.lever = lever;
    }

    public String getLever() {
        return lever;
    }

    public void setLever(String lever) {
        this.lever = lever;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + getId() + '\'' +
                ", tên='" + getName() + '\'' +
                ", tuổi=" + getAge() +
                ", ngày sinh='" + getDateOfBirthday() + '\'' +
                ", địa chỉ='" + getAddress() + '\'' +
                ", chức vụ='" + lever + '\'' +
                '}';
    }
}
