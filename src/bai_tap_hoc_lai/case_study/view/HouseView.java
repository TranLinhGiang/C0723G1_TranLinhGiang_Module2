package bai_tap_hoc_lai.case_study.view;

import bai_tap_hoc_lai.case_study.model.facility.House;
import bai_tap_hoc_lai.case_study.utils.Regex;

import java.util.Scanner;

public class HouseView {
    private final Scanner scanner = new Scanner(System.in);

    public House inputHouse() {
        String serviceCode;
        do {
            System.out.println("Nhập mã dịch vụ ( SVHO-XXXX ): ");
            serviceCode = scanner.nextLine();
            if (!Regex.idHouse(serviceCode)) {
                System.out.println("Nhâpj sai định dạng, vui lònd nhập lại: ");
            }
        } while (!Regex.idHouse(serviceCode));

        String serviceName;
        do {
            System.out.println("Nhập tên dịch vụ ( Chữ đầu tiên phải viết hoa ): ");
            serviceName = scanner.nextLine();
            if (!Regex.nameHouse(serviceName)) {
                System.out.println("Nhâpj sai định dạng, vui lònd nhập lại: ");
            }
        } while (!Regex.nameHouse(serviceName));


        int usableArea = 0;
        do {
            try {
                System.out.println("Nhập diện tích sử dụng ( là số thực, phải lớn hơn 30m2 ): ");
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
                System.out.println("Nhập chi phí thuê ( phải là số dương ): ");
                rentalCosts = Integer.parseInt(scanner.nextLine());
                if (rentalCosts < 0) {
                    System.out.println("Chi phí thuê phải là số nguyên dương: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Chi phí thuê phải nhập số, không được nhập số, vui lòng nhập lại: ");
            }
        } while (rentalCosts < 0);

        int maxNumberPeople = 0;
        do {
            try {
                System.out.println("Nhập số lượng người tối đa ( lớn hơn 0 và bé hơn 20 ): ");
                maxNumberPeople = Integer.parseInt(scanner.nextLine());
                if (maxNumberPeople < 0) {
                    System.out.println("Vui lòng nhập số dương, vui lòng nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Số lượng người không được nhập chữ, vui lòng nhập lại: ");
            }
        } while (maxNumberPeople < 0 || maxNumberPeople > 20);

        String rentalType;
        do {
            System.out.println("Nhập kiểu thuê ( Year|Month|Day|Hourly ): ");
            rentalType = scanner.nextLine();
            if (!Regex.rentalTypeHouse(rentalType)) {
                System.out.println("Nhập sai định dang kiểu thuê, vui lòng nhập lại: ");
            }
        } while (!Regex.rentalTypeHouse(rentalType));

        String roomStandard;
        do {
            System.out.println("Nhập tiêu chuẩn phòng ( suite|deluxe ): ");
            roomStandard = scanner.nextLine();
            if (!Regex.typeRoomVilla(roomStandard)) {
                System.out.println("Nhập sai tiêu chuẩn phòng như định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.typeRoomVilla(roomStandard));

        int numberOfFloors = 0;
        do {
            try {
                System.out.println("Nhập số tầng: ");
                numberOfFloors = Integer.parseInt(scanner.nextLine());
                if (numberOfFloors < 0) {
                    System.out.println("Số tầng phải lớn hơn 0, vui lòng nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số, không được nhập chữ");
            }
        } while (numberOfFloors < 0);


        House newHouse = new House(serviceCode, serviceName, usableArea, rentalCosts, maxNumberPeople, rentalType, roomStandard, numberOfFloors);
        return newHouse;
    }
}
