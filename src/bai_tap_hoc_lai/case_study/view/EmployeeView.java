package bai_tap_hoc_lai.case_study.view;

import bai_tap_hoc_lai.case_study.model.persion.Employee;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private final Scanner scanner = new Scanner(System.in);

    public void showMenuEmployee() {
        System.out.println("-- QUẢN LÝ NHÂN VIÊN --");
        System.out.println("1. Hiển thị danh sách nhân viên");
        System.out.println("2. Thêm nhân viên mới");
        System.out.println("3. Chỉnh sửa nhân viên theo id");
        System.out.println("4. Xóa nhân viên theo id");
        System.out.println("5. Tìm kiếm nhân viên theo tên");
        System.out.println("6. Trở về menu chính");
        System.out.println("Mời chọn chức năng: ");
    }

    public void display(List<Employee> employees) {
        if (employees.size() == 0) {
            System.out.println("Danh sách rỗng !!!!");
        } else {
            for (Employee employee : employees) {
                System.out.println("Danh sách: " + employee);
            }
        }
    }

    public Employee inputEmployee() {
        System.out.println("Nhập mã nhân viên: ");
        String id = scanner.nextLine();

        System.out.println("Nhập họ tên nhân viên:");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày tháng năm sinh nhân viên: ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập số chứng minh nhân dân của nhân viên: ");
        String idCardNumber = scanner.nextLine();

        System.out.println("Nhập giới tính của nhân viên: ");
        String gender = scanner.nextLine();

        System.out.println("Nhập số điện thoại của nhân viên: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Nhập email của nhân viên: ");
        String email = scanner.nextLine();

        System.out.println("Nhập trình độ của nhân viên: ");
        String lever = scanner.nextLine();

        System.out.println("Nhập vị trí của nhân viên: ");
        String location = scanner.nextLine();

        System.out.println("Nhập lương của nhân viên: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee newEmployee = new Employee(id, name, dateOfBirth, gender, idCardNumber, phoneNumber, email, lever, location, salary);
        return newEmployee;

    }

    public String idEditEmployee() {
        System.out.println("Nhập id nhân viên bạn muốn chỉnh sửa: ");
        String id = scanner.nextLine();
        return id;
    }

    public Employee inputEditEmployee() {
        System.out.println("Nhập mã nhân viên mới: ");
        String id = scanner.nextLine();

        System.out.println("Nhập họ tên nhân viên mới:");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày tháng năm sinh nhân viên mới: ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập số chứng minh nhân dân của nhân viên mới: ");
        String idCardNumber = scanner.nextLine();

        System.out.println("Nhập giới tính của nhân viên mới: ");
        String gender = scanner.nextLine();

        System.out.println("Nhập số điện thoại của nhân viên mới: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Nhập email của nhân viên mới: ");
        String email = scanner.nextLine();

        System.out.println("Nhập trình độ của nhân viên mới: ");
        String lever = scanner.nextLine();

        System.out.println("Nhập vị trí của nhân viên mới: ");
        String location = scanner.nextLine();

        System.out.println("Nhập lương của nhân viên mới: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee newEmployee = new Employee(id, name, dateOfBirth, gender, idCardNumber, phoneNumber, email, lever, location, salary);
        return newEmployee;
    }

    public String idRemoveEmployee() {
        System.out.println("Nhập id nhân viên bạn muốn chỉnh : ");
        String id = scanner.nextLine();
        return id;
    }

    public void displaySearch(Employee employee) {
        String result = "Employee { Mã nhân viên = " + employee.getId() + ", Họ và tên = " + employee.getName() + ", Ngày tháng năm sinh = " + employee.getDateOfBirth() + ", Giới tính = " + employee.getGender() + ", Số chứng minnh nhân dân = " + employee.getIdCardNumber() + ", Số điện thoại = " + employee.getPhoneNumber() + ", email='" + employee.getEmail() + ", Trình độ = " + employee.getLever() + ", Vị trí = " + employee.getLocation() + ", Lương = " + employee.getSalary();
        System.out.println("Tìm thấy: " + result);
    }
    public String idSearchEmployee() {
        System.out.println("Nhập id nhân viên bạn muốn  : ");
        String id = scanner.nextLine();
        return id;
    }
}
