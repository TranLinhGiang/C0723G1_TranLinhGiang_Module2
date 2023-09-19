package bai_tap_hoc_lai.ss12_java_collection.controller;

import bai_tap_hoc_lai.ss12_java_collection.service.impl.FruitServiceImpl;
import bai_tap_hoc_lai.ss12_java_collection.view.FruitView;

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
                    view.displayFruit(fruitService.getList());
                    break;

                case 2:
                    fruitService.add(view.inputInfoAdd());
                    break;
                case 3:
                    fruitService.removeFruit(view.idRemove());
                    break;
                case 4:
                    fruitService.editFruit(view.idEdit(), view.inputEditNew());
                    break;
                case 5:
                    view.showMenu();
                    break;
            }
        } while (choice != 0);

    }
}
