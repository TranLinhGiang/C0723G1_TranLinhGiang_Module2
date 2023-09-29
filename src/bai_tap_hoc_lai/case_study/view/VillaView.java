package bai_tap_hoc_lai.case_study.view;

import bai_tap_hoc_lai.case_study.model.facility.Villa;
import bai_tap_hoc_lai.case_study.utils.Regex;

import java.util.Scanner;

public class VillaView {
    Scanner scanner = new Scanner(System.in);

    public Villa inputInfoAddVilla() {
        String serviceCode;
        do {
            System.out.println("Nhập mã dịch vụ của villa ( SVVL-XXXX): ");
            serviceCode = scanner.nextLine();
            if (!Regex.idVilla(serviceCode)) {
                System.out.println("sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.idVilla(serviceCode));

        String serviceName;
        do {
            System.out.println("Nhập tên dịch vụ của villa (tên phải viết hoa ký tự đầu) : ");
            serviceName = scanner.nextLine();
            if (!Regex.nameVilla(serviceName)) {
                System.out.println("sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.nameVilla(serviceName));

        int usableArea = 0;
        do {
            try {
                System.out.println("Nhập diện tích sử dụng ( > 30m2 ): ");
                usableArea = Integer.parseInt(scanner.nextLine());
                if (usableArea < 0) {
                    System.out.println("Diện tích phải lớn hơn 0, vui lòng nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Diện tích phải nhập số,vui lòng nhập lại: ");
            }
        } while (usableArea <= 30);

        int rentalCosts = 0;
        do {
            try {
                System.out.println("Nhập chi phí thuê: ");
                rentalCosts = Integer.parseInt(scanner.nextLine());
                if (rentalCosts < 0) {
                    System.out.println("Chi phí thuê phải lớn hơn 0, vui lòng nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Chi phí thuê phải nhập số,vui lòng nhập lại: ");
            }
        } while (rentalCosts <= 0);

        int maxNumberPeople = 0;
        do {
            try {
                System.out.println("Nhập số lượng người tối đa ( 0 > maxNumberPeople < 20 ): ");
                maxNumberPeople = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Số lượng người phải nhập số,vui lòng nhập lại: ");
            }
        } while (maxNumberPeople < 0 || maxNumberPeople > 20);

        String rentalType;
        do {
            System.out.println("Nhập kiểu thuê ( Year|Month|Day|Hourly ): ");
            rentalType = scanner.nextLine();
            if (!Regex.rentalType(rentalType)) {
                System.out.println("Sai định dạng kiểu thuê, vui lòng nhập lại: ");
            }
        } while (!Regex.rentalType(rentalType));

        String roomStandard;
        do {
            System.out.println("Nhập tiêu chuẩn phòng ( suite|deluxe ): ");
            roomStandard = scanner.nextLine();
            if (!Regex.typeRoomVilla(roomStandard)) {
                System.out.println("Nhập sai tiêu chuẩn phòng, vui lòng nhập lại, đã có kiểu phòng ở phần nhập rồi mà: ");
            }
        } while (!Regex.typeRoomVilla(roomStandard));


        int poolArea = 0;
        do {
            try {
                System.out.println("Nhập diện tích hồ bơi ( > 30m2 ): ");
                poolArea = Integer.parseInt(scanner.nextLine());
                if (poolArea < 0) {
                    System.out.println("Diện tích hồ bơi phải lớn hơn 0, vui lòng nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Diện tích hồ bơi phải nhập số,vui lòng nhập lại: ");
            }
        } while (poolArea <= 30);

        int numberOfFloors = 0;
        do {
            try {
                System.out.println("Nhập số tầng: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors < 0) {
                    System.out.println("Số tầng phải lớn hơn 0,vui lòng nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Số tầng phải nhập số, vui lòng nhập lại: ");
            }
        } while (numberOfFloors < 0);


        Villa newVilla = new Villa(serviceCode, serviceName, usableArea, rentalCosts, maxNumberPeople, rentalType, roomStandard, poolArea, numberOfFloors);
        return newVilla;
    }
}
