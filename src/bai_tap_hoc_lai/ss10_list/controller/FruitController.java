package bai_tap_hoc_lai.ss10_list.controller;

import bai_tap_hoc_lai.ss10_list.model.Fruit;
import bai_tap_hoc_lai.ss10_list.service.impl.FruitServiceImpl;
import bai_tap_hoc_lai.ss10_list.view.FruitView;

import java.util.Scanner;

public class FruitController {
    private final FruitView view = new FruitView();
    private final Scanner scanner = new Scanner(System.in);
    private final FruitServiceImpl fruitService = new FruitServiceImpl();
    int choice;

    public void run() {
        do {
            view.showMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    fruitService.addFruit(view.inputInfoAdd());
                    break;
                case 2:
                    fruitService.removeFruit(view.idRemove());
                    break;
                case 3:
                    fruitService.editFruit(view.ifEdit(), view.inputInfoEdit());
                    break;
                case 4:
                    Fruit fruit = fruitService.searchFruit(view.nameSearh());
                    if (fruit == null) {
                        System.out.println("Ko tim thay");
                    } else {
                        view.displaySearchFruit(fruit);
                    }
                    break;
                case 5:
                    view.displayFruit(fruitService.getFruit());
                    break;
                case 6:
                    view.showMenu();
                    break;
                default:
                    System.out.println("Khong hop le");
            }
        } while (choice != 0);

    }
}
