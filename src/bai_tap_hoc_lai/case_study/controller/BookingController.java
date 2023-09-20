package bai_tap_hoc_lai.case_study.controller;

import bai_tap_hoc_lai.case_study.view.BookingView;

import java.util.Scanner;

public class BookingController {
    private final Scanner scanner = new Scanner(System.in);
    private final BookingView bookingView = new BookingView();

    int choice;

    public void runBooking() {
        do {
            bookingView.menuBooking();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;

            }
        } while (choice != 6);

    }
}
