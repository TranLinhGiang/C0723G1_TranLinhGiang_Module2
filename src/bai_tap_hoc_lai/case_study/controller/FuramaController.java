package bai_tap_hoc_lai.case_study.controller;

import bai_tap_hoc_lai.case_study.view.FuramaView;

import java.util.Scanner;

public class FuramaController {
    private final FuramaView furamaView = new FuramaView();
    private final EmployeeController employeeController = new EmployeeController();
    private final CustomerController customerController = new CustomerController();
    private final FacilityController facilityController = new FacilityController();
    private final BookingController bookingController = new BookingController();
    private final PromotionController promotionController = new PromotionController();
    private final Scanner scanner = new Scanner(System.in);
    int choice;

    public void run() {
        do {
            furamaView.displayMainMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    employeeController.runEmployee();
                    break;
                case 2:
                    customerController.runCustomer();
                    break;
                case 3:
                    facilityController.runFacility();
                    break;
                case 4:
                    bookingController.runBooking();
                    break;
                case 5:
                    promotionController.runPromotion();
                    break;
            }
        } while (choice != 0);

    }
}