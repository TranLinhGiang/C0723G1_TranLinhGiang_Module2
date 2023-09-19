package bai_tap_hoc_lai.ss13_search.controller;

import bai_tap_hoc_lai.ss13_search.model.Spending;
import bai_tap_hoc_lai.ss13_search.service.impl.SpendingServiceImpl;
import bai_tap_hoc_lai.ss13_search.view.SpendingView;

import java.util.Scanner;

public class SpendingController {
    private final SpendingView view = new SpendingView();
    private final Scanner scanner = new Scanner(System.in);
    private final SpendingServiceImpl spendingService = new SpendingServiceImpl();
    int choice;

    public void run() {
        do {
            view.showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    view.displaySpending(spendingService.getSpending());
                    break;
                case 2:
                    spendingService.addSpending(view.inputInfoSpending());
                    break;
                case 3:
                    spendingService.removeSpending(view.inputIdRemove());
                    break;
                case 4:
                    spendingService.editSpending(view.inputIdEdit(), view.inputEdit());
                    break;
                case 5:
                    String id = view.idSearch();
                    Spending spending = spendingService.searchId(id);
                    if (spendingService.searchId(id) != null) {
                        System.out.println(spending);
                    } else {
                        System.out.println("Không tìm thấy");
                    }
                    break;
                case 6:
                    String name = view.nameSearch();
                    Spending spending1 = spendingService.searchName(name);
                    if (spendingService.searchName(name) != null) {
                        System.out.println(spending1);
                    } else {
                        System.out.println("Không tìm thấy");
                    }
                    break;
                case 7:
                    view.showMenu();
                    break;
            }
        } while (choice != 0);

    }
}
