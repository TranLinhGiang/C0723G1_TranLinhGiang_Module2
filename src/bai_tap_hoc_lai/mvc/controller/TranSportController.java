package bai_tap_hoc_lai.mvc.controller;

import bai_tap_hoc_lai.mvc.view.TranSportView;

import java.util.Scanner;

public class TranSportController {
    private final Scanner scanner = new Scanner(System.in);

    CarController controller = new CarController();
    TruckController truckController = new TruckController();
    MotorbikeController motorbikeController = new MotorbikeController();
    private final TranSportView tranSportView = new TranSportView();

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
