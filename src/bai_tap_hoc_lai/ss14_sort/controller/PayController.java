package bai_tap_hoc_lai.ss14_sort.controller;

import bai_tap_hoc_lai.ss14_sort.model.Pay;
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
            switch (choice) {
                case 1:
                    view.displayPay(payService.getList());
                    break;
                case 2:
                    payService.add(view.inputPay());
                    break;
                case 3:
                    payService.removePay(view.idRemove());
                    break;
                case 4:
                    payService.edit(view.idEdit(), view.inputEditPay());
                    break;
                case 5:
                    Pay pay= payService.searchId(view.idSearch());
                    if (pay== null){
                        System.out.println("Không tìm thấy");
                    }
                    view.displaySearch(pay);
                    break;
                case 6:
                    Pay pay1= payService.searchName(view.nameSearch());
                    if (pay1==null){
                        System.out.println("Không tìm thấy");
                    }
                    view.displaySearch(pay1);
                    break;
                case 7:
                    view.showMenu();
                    break;
                default:
                    System.out.println("Không hợp lệ");
            }
        } while (choice != 0);

    }
}
