package bai_tap_hoc_lai.ss15_exception.controller;

import bai_tap_hoc_lai.ss15_exception.model.Spend;
import bai_tap_hoc_lai.ss15_exception.service.impl.SpendServiceImpl;
import bai_tap_hoc_lai.ss15_exception.view.SpendView;

import java.util.List;
import java.util.Scanner;

public class SpendController {
    private final SpendView view = new SpendView();
    private Scanner scanner = new Scanner(System.in);
    private SpendServiceImpl spendService = new SpendServiceImpl();
    int choice;

    public void run() {
        do {
            view.menuSpend();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    view.displaySpend(spendService.getList());
                    break;
                case 2:
                    spendService.add(view.inputInfoSpend());
                    break;
                case 3:
                    spendService.removeSpend(view.inputRemove());
                    break;
                case 4:
                    spendService.editSpend(view.inputEdit(), view.inputEditSpend());
                    break;
                case 5:
                    Spend spend = spendService.searchIdSpend(view.inputIdSearch());
                    if (spend == null) {
                        System.out.println("Không tìm thấy !!!!");
                    } else {
                        view.displaySearch(spend);
                    }
                    break;
                case 6:
                    String name = String.valueOf(view.inputNameSearch());
                    List<Spend> spendingList = spendService.searchNameSpend(name);
                    if (spendingList.size() > 0) {
                        System.out.println(spendingList);
                    } else {
                        System.out.println("Không tìm thấy");
                        break;
                    }
                    break;
                case 7:
                    view.menuSpend();
                    break;
                case 8:
                    break;
            }
        } while (choice != 8);

    }
}
