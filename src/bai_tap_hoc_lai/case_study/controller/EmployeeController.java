package bai_tap_hoc_lai.case_study.controller;

import bai_tap_hoc_lai.case_study.model.persion.Employee;
import bai_tap_hoc_lai.case_study.service.impl.EmployeeServiceImpl;
import bai_tap_hoc_lai.case_study.view.EmployeeView;
import bai_tap_hoc_lai.case_study.view.FuramaView;

import java.util.Scanner;

public class EmployeeController {
    private final EmployeeView employeeView = new EmployeeView();
    private final FuramaView furamaView = new FuramaView();
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    int choice;

    public void runEmployee() {
        do {
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
                    employeeService.editEmployee(employeeView.idEditEmployee(), employeeView.inputEditEmployee());
                    break;
                case 4:
                    employeeService.removeEmployee(employeeView.idRemoveEmployee());
                    break;
                case 5:
                    Employee employee = employeeService.searchEmployee(employeeView.idSearchEmployee());
                    if (employee == null) {
                        System.out.println("Không timg thấy !!!!");
                    }
                    employeeView.displaySearch(employee);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Không hợp lệ ");
            }
        } while (choice != 6);

    }
}
