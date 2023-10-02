package bai_tap_hoc_lai.ss20_mvc.view;

import bai_tap_hoc_lai.ss20_mvc.model.Employee;
import bai_tap_hoc_lai.ss20_mvc.repository.impl.EmployeeRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeRepositoryImpl employeeRepository = new EmployeeRepositoryImpl();

    public void menuEmployee() {
        System.out.println("=== QUẢN LÝ NHÂN VIÊN ===");
        System.out.println("1. Hiển thị danh sách ");
        System.out.println("2. Thêm mới ");
        System.out.println("3. Xóa ");
        System.out.println("4. Tìm kiếm theo id ");
        System.out.println("5. Tìm kiếm danh sách có tên gần giống nhau ");
        System.out.println("6. Trở về menu chính");
        System.out.println("Mời chọn chức năng: ");
    }

    public void displayEmployeeList(List<Employee> employees) {
        if (employees.size() == 0) {
            System.out.println("Danh sách rỗng !!!!!!!!");
        } else {
            for (Employee employee : employees) {
                System.out.println("Danh sách: " + employee);
            }
        }
    }

    public Employee inputInfoEmployee() {
        String id = null;
        do {
            try {
                System.out.println("Nhập id: ");
                id = scanner.nextLine();
                if (employeeRepository.checkId(id)) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("id da ton tai");
                break;
            }
        } while (employeeRepository.checkId(id));

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập ngày sinh: ");
        String date = scanner.nextLine();

        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        System.out.println("Nhập chức vụ: ");
        String lever = scanner.nextLine();
        Employee newEmployee = new Employee(id, name, age, date, address, lever);
        return newEmployee;
    }

    public String inputId() {
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();
        return id;
    }

    public void displaySearch(Employee employee) {
        String result = "Employee{ id= " + employee.getId() + ", ten= " + employee.getName() + ", tuoi= " + employee.getAge()
                + ", ngay sinh= " + employee.getDateOfBirthday() + ", dia chi= " + employee.getAddress() + ", chuc vu= " + employee.getLever();
        System.out.println("Tim thay: " + result);
    }

    public String inputName() {
        System.out.println("Nhap name: ");
        String name = scanner.nextLine();
        return name;
    }
}
