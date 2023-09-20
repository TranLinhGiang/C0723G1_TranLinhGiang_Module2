package bai_tap_hoc_lai.case_study.controller;

import bai_tap_hoc_lai.case_study.view.PromotionView;

import java.util.Scanner;

public class PromotionController {
    private final PromotionView promotionView = new PromotionView();
    private final Scanner scanner = new Scanner(System.in);

    int choice;

    public void runPromotion() {
        do {
            promotionView.menuPromotion();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                case 2:
                case 3:
                    break;
            }
        } while (choice != 3);

    }
}
