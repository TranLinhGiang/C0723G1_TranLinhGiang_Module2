package bai_tap_hoc_lai.case_study.controller;

import bai_tap_hoc_lai.case_study.model.persion.Customer;
import bai_tap_hoc_lai.case_study.service.impl.CustomerServiceImpl;
import bai_tap_hoc_lai.case_study.view.CustomerView;

import java.util.Scanner;

public class CustomerController {
    private final Scanner scanner = new Scanner(System.in);
    private final CustomerView customerView = new CustomerView();
    private final CustomerServiceImpl customerService = new CustomerServiceImpl();

    int choice;

    public void runCustomer() {
        do {
            customerView.menuCustomer();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerView.displayCustomer(customerService.getList());
                    break;
                case 2:
                    customerService.add(customerView.inputInfoCustomer());
                    break;
                case 3:
                    customerService.editCustomer(customerView.inputIdEdit(), customerView.inputEditCustomer());
                    break;
                case 4:
                    customerService.removeCustomer(customerView.inputIdRemove());
                    break;
                case 5:
                    Customer customer = customerService.searchCustomer(customerView.inputNameSearch());
                    if (customer == null) {
                        System.out.println("Không tìm thấy !!!!");
                    } else {
                        customerView.displaySearchCustomer(customer);
                    }
                    break;
                case 6:
                    break;
            }
        } while (choice != 6);

    }
}
