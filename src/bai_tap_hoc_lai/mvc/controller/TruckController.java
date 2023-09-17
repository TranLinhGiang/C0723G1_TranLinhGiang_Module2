package bai_tap_hoc_lai.mvc.controller;

import bai_tap_hoc_lai.mvc.model.Truck;
import bai_tap_hoc_lai.mvc.service.impl.TruckServiceImpl;
import bai_tap_hoc_lai.mvc.view.TruckView;

import java.util.Scanner;

public class TruckController {
    private final Scanner scanner = new Scanner(System.in);
    private final TruckView truckView = new TruckView();
    private final TruckServiceImpl truckService = new TruckServiceImpl();

    int choiceTruck;

    public void runTruck() {
        do {
            truckView.menuTruck();
            choiceTruck = Integer.parseInt(scanner.nextLine());
            switch (choiceTruck) {
                case 1:
                    truckService.add(truckView.inputInfoTruck());
                    break;
                case 2:
                    truckView.displayTruck(truckService.getList());
                    break;
                case 3:
                    truckService.removeTruck(truckView.licensePlatesRemove());
                    break;
                case 4:
                    Truck truck = truckService.searchTruck(truckView.inputSearch());
                    if (truck == null) {
                        System.out.println("Khong tim thay");
                    } else {
                        truckView.displaySearch(truck);
                    }
                    break;
                case 5:
                    break;
            }
        } while (choiceTruck != 5);

    }
}
