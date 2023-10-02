package bai_tap_hoc_lai.ss20_mvc.controller;

import bai_tap_hoc_lai.ss20_mvc.model.Employee;
import bai_tap_hoc_lai.ss20_mvc.service.impl.EmployeeServiceImpl;
import bai_tap_hoc_lai.ss20_mvc.view.EmployeeView;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    private final EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    private final EmployeeView employeeView = new EmployeeView();
    private final Scanner scanner = new Scanner(System.in);
    int choice;

    public void runEmployee() {
        do {
            try {
                employeeView.menuEmployee();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        employeeView.displayEmployeeList(employeeService.getList());
                        break;
                    case 2:
                        employeeService.addEmployee(employeeView.inputInfoEmployee());
                        break;
                    case 3:
                        Employee employee = employeeService.removeEmployee(employeeView.inputId());
                        if (employee == null) {
                            System.out.println("Không tìm thấy!!!!!!!!!!!!!!!");
                            break;
                        } else {
                            employeeService.removeEmployee(String.valueOf(employee));
                            System.out.println("Đã xóa xong");
                        }
                        break;
                    case 4:
                        Employee employee1 = employeeService.searchIdEmployee(employeeView.inputId());
                        if (employee1 == null) {
                            System.out.println("Khong tim thay !!!!!!");
                        } else {
                            employeeView.displaySearch(employee1);
                            break;
                        }
                    case 5:
                        List<Employee> employee2 = employeeService.searchNameEmployee(employeeView.inputName());
                        if (employee2.size() > 0) {
                            System.out.println(employee2);
                        } else {
                            System.out.println("khong tim thay");
                        }
                        break;
                    case 6:
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("<<<<<<  Nhập sai chức năng, vui lòng nhập lại: >>>>>>");
            }
        } while (choice != 6);

    }
}
