package bai_tap_hoc_lai.case_study.controller;

import bai_tap_hoc_lai.case_study.service.impl.FacilityServiceImpl;
import bai_tap_hoc_lai.case_study.view.FacilityView;
import bai_tap_hoc_lai.case_study.view.FuramaView;
import bai_tap_hoc_lai.mvc.service.ICarService;

import java.util.Scanner;

public class FacilityController {
    private final FacilityView facilityView = new FacilityView();
    private final FuramaView furamaView= new FuramaView();
    private final Scanner scanner = new Scanner(System.in);
    private final FacilityServiceImpl facilityService = new FacilityServiceImpl();
    int choice;

    public void runFacility() {
        do {
            facilityView.menuFacility();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    facilityView.displayFacility(facilityService.getList());
                    break;
                case 2:
                    facilityService.add(facilityView.inputInfoFacility());
                    break;
                case 3:
                    facilityView.displayMaintenanceFacility(facilityService.getList());
                    break;
                case 4:
                    facilityService.removeFacility(facilityView.inputRemoveFacility());
                    break;
                case 5:
                    furamaView.displayMainMenu();
                    break;
            }
        } while (choice != 5);

    }
}
