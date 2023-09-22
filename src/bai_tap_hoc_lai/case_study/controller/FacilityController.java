package bai_tap_hoc_lai.case_study.controller;

import bai_tap_hoc_lai.case_study.view.FacilityView;

import java.util.Scanner;

public class FacilityController {
    private final FacilityView facilityView = new FacilityView();
//    private final Facility
    private final Scanner scanner = new Scanner(System.in);
    int choice;
    public void runFacility(){
        facilityView.menuFacility();
        choice= Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
        }
    }
}
