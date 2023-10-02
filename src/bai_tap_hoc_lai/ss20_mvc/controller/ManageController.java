package bai_tap_hoc_lai.ss20_mvc.controller;

import bai_tap_hoc_lai.ss20_mvc.view.ManageView;

import java.util.Scanner;

public class ManageController {
    private final ManageView manageView = new ManageView();
    private final Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController= new EmployeeController();
    int choiceManage;

    public void run() {
        do {
            try {
                manageView.menu();
                choiceManage= Integer.parseInt(scanner.nextLine());
                switch (choiceManage){
                    case 1:
                        employeeController.runEmployee();
                        break;
                }
            }catch (NumberFormatException e){
                System.out.println("<<<<<<  Nhập sai chức năng, vui lòng chọn lại: >>>>>>");
            }
        }while (choiceManage != 3);

    }
}
