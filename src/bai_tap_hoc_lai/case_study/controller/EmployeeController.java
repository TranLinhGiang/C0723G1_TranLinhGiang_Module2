package bai_tap_hoc_lai.case_study.controller;

import bai_tap_hoc_lai.case_study.model.persion.Employee;
import bai_tap_hoc_lai.case_study.service.impl.EmployeeServiceImpl;
import bai_tap_hoc_lai.case_study.view.EmployeeView;
import bai_tap_hoc_lai.case_study.view.FuramaView;

import java.util.Scanner;

public class EmployeeController {
    private final EmployeeView employeeView = new EmployeeView();
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    int choice;

    public void runEmployee() {
        do {
            try {
                employeeView.showMenuEmployee();
                choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        employeeView.display(employeeService.getList());
                        break;
                    case 2:
                        employeeService.add(employeeView.inputEmployee());
                        break;
                    case 3:
                        employeeService.editEmployee(employeeView.inputId(), employeeView.inputEditEmployee());
                        break;
                    case 4:
                        Employee employee1 = employeeService.removeEmployee(employeeView.inputId());
                        if (employee1 == null) {
                            System.out.println("Không tìm thấy id bạn muốn xóa");
                            break;
                        } else {
                            employeeService.removeEmployee(String.valueOf(employee1));
                            System.out.println("Đã xóa xong.");
                        }
                        break;
                    case 5:
                        Employee employee = employeeService.searchEmployee(employeeView.inputId());
                        if (employee == null) {
                            System.out.println("Không tim thấy !!!!");
                        }
                        employeeView.displaySearch(employee);
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Không hợp lệ ");
                }
            } catch (Exception e) {
                System.out.println("Vui lòng chọn đúng chức năng như ở phần menu: ");
            }
        } while (choice != 6);
    }
}
