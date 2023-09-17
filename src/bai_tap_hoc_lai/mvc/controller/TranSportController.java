package bai_tap_hoc_lai.mvc.controller;

import bai_tap_hoc_lai.mvc.service.impl.CarServiceImpl;
import bai_tap_hoc_lai.mvc.service.impl.TranSportServiceImpl;
import bai_tap_hoc_lai.mvc.view.CarView;
import bai_tap_hoc_lai.mvc.view.TranSportView;

import java.util.Scanner;

public class TranSportController {
    private final Scanner scanner = new Scanner(System.in);

    CarView carView = new CarView();
    CarController controller = new CarController();
    TruckController truckController = new TruckController();
    MotorbikeController motorbikeController = new MotorbikeController();
    private final TranSportView tranSportView = new TranSportView();
    private final TranSportServiceImpl tranSportService = new TranSportServiceImpl();

    int choice;

    public void run() {
        do {
            tranSportView.menu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    controller.runCar();
                    break;
                case 2:
                    truckController.runTruck();
                    break;
                case 3:
                    motorbikeController.runMoto();
                    break;
            }
        } while (choice != 0);

    }
}
