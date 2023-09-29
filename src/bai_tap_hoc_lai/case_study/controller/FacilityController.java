package bai_tap_hoc_lai.case_study.controller;

import bai_tap_hoc_lai.case_study.service.impl.HouseServiceImpl;
import bai_tap_hoc_lai.case_study.service.impl.RoomServiceImpl;
import bai_tap_hoc_lai.case_study.service.impl.VillaServiceImpl;
import bai_tap_hoc_lai.case_study.view.*;

import java.util.Scanner;

public class FacilityController {
    private final FacilityView facilityView = new FacilityView();
    private final VillaView villaView = new VillaView();
    private final HouseView houseView = new HouseView();
    private final VillaServiceImpl villaService = new VillaServiceImpl();
    private final HouseServiceImpl houseService = new HouseServiceImpl();
    private final RoomServiceImpl roomService = new RoomServiceImpl();
    private final RoomView roomView = new RoomView();
    private final FuramaView furamaView = new FuramaView();

    private final Scanner scanner = new Scanner(System.in);
    int choice;

    public void runFacility() {
        do {
            try {
                do {
                    facilityView.menuFacility();
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            villaService.addVilla(villaView.inputInfoAddVilla());
                            break;
                        case 2:
                            houseService.addHouse(houseView.inputHouse());
                            break;
                        case 3:
                            roomService.addRoom(roomView.inputAddRoom());
                            break;
                        case 4:
                            furamaView.displayMainMenu();
                            break;
                    }
                } while (choice != 6);

            } catch (Exception e) {
                System.out.println("Vui lòng chọn đúng chức năng như ở menu: ");
            }
        } while (choice != 6);
    }
}
