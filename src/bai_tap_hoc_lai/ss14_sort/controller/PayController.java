package bai_tap_hoc_lai.ss14_sort.controller;

import bai_tap_hoc_lai.ss14_sort.service.impl.PayServiceImpl;
import bai_tap_hoc_lai.ss14_sort.view.PayView;

import java.util.Scanner;

public class PayController {
    private final PayServiceImpl payService = new PayServiceImpl();
    private final Scanner scanner = new Scanner(System.in);
    private final PayView view = new PayView();

    int choice;

    public void run() {
        do {
            view.showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    view.displayPay(payService.getList());
                    break;
                case 2:
                    payService.add(view.inputPay());
                    break;
            }
        }while (choice != 0);

    }
}
