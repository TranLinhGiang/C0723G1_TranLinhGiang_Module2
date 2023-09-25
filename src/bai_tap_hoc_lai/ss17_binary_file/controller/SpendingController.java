package bai_tap_hoc_lai.ss17_binary_file.controller;

import bai_tap_hoc_lai.ss17_binary_file.model.Spending;
import bai_tap_hoc_lai.ss17_binary_file.service.impl.SpendingServiceImpl;
import bai_tap_hoc_lai.ss17_binary_file.view.SpendingView;

import java.util.List;
import java.util.Scanner;

public class SpendingController {
    private final SpendingServiceImpl spendingService = new SpendingServiceImpl();
    private final Scanner scanner = new Scanner(System.in);
    private final SpendingView view = new SpendingView();
    int choice;

    public void run() {
        do {
            view.showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    view.displaySpendList(spendingService.getList());
                    break;
                case 2:
                    spendingService.addSpending(view.inputInfoSpend());
                    break;
                case 3:
                    spendingService.removeSpending(view.inputRemoveId());
                    break;
                case 4:
                    spendingService.editSpending(view.inputEditId(), view.inputInfoEdit());
                    break;
                case 5:
                    view.displaySearch(spendingService.searchIdSpend(view.inputSearchId()));
                    break;
                case 6:
                    List<Spending> spendings = spendingService.searchNameSpend(view.inputSearchName());
                    if (spendings.size() > 0) {
                        System.out.println(spendings);
                    } else {
                        System.out.println("Khong tim thay !!!!");
                    }
                    break;
                case 7:
                    break;
            }
        } while (choice != 7);

    }
}
