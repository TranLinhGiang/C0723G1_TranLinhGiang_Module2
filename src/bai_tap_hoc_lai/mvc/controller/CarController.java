package bai_tap_hoc_lai.mvc.controller;

import bai_tap_hoc_lai.mvc.model.Car;
import bai_tap_hoc_lai.mvc.service.impl.CarServiceImpl;
import bai_tap_hoc_lai.mvc.view.CarView;
import bai_tap_hoc_lai.mvc.view.TranSportView;

import java.util.Scanner;

public class CarController {
    private final Scanner scanner = new Scanner(System.in);
    private final CarServiceImpl carService = new CarServiceImpl();
    private final CarView carView = new CarView();
    int choiceCar;

    public void runCar() {
        do {
            carView.menuCar();
            choiceCar = Integer.parseInt(scanner.nextLine());
            switch (choiceCar) {
                case 1:
                    carService.add(carView.inputInfoCar());
                    break;
                case 2:
                    carView.displayCar(carService.getList());
                    break;
                case 3:
                    carService.removeCar(carView.licensePlatesRemove());
                    break;
                case 4:
                    Car car = carService.searchCar(carView.inputSearch());
                    if (car == null) {
                        System.out.println("Khong tim thay");
                    } else {
                        carView.displaySearch(car);
                    }
                    break;
                case 5:
                    break;
            }
        } while (choiceCar != 5);

    }
}
