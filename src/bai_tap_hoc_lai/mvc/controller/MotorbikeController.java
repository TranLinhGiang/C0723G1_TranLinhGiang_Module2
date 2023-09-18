package bai_tap_hoc_lai.mvc.controller;

import bai_tap_hoc_lai.mvc.model.Motorbike;
import bai_tap_hoc_lai.mvc.service.impl.MotorbikeServiceImpl;
import bai_tap_hoc_lai.mvc.view.MotorbikeView;

import java.util.Scanner;

public class MotorbikeController {
    private final MotorbikeView motorbikeView = new MotorbikeView();
    private final Scanner scanner = new Scanner(System.in);
    private final MotorbikeServiceImpl motorbikeService = new MotorbikeServiceImpl();
    int choiceMoto;

    public void runMoto() {
        do {
            motorbikeView.menuMotorbike();
            choiceMoto = Integer.parseInt(scanner.nextLine());
            switch (choiceMoto) {
                case 1:
                    motorbikeService.add(motorbikeView.inputInfoMotorbike());
                    break;
                case 2:
                    motorbikeView.displayMoto(motorbikeService.getList());
                    break;
                case 3:
                    motorbikeService.removeMotorbike(motorbikeView.licensePlatesRemove());
                    break;
                case 4:
                    Motorbike motorbike = motorbikeService.searchMotorbike(motorbikeView.inputSearch());
                    if (motorbike == null) {
                        System.out.println("Không tìm thấy");
                    } else {
                        motorbikeView.displaySearch(motorbike);
                    }
                    break;
                case 5:
            }
        } while (choiceMoto != 5);

    }
}
