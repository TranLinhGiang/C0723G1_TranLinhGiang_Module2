package bai_tap_hoc_lai.case_study.view;

import bai_tap_hoc_lai.case_study.model.facility.Room;
import bai_tap_hoc_lai.case_study.utils.Regex;

import java.util.Scanner;

public class RoomView {
    private final Scanner scanner = new Scanner(System.in);

    public Room inputAddRoom() {
        String serviceCode;
        do {
            System.out.println("Nhập mã dịch vụ ( SVRO-XXXX ): ");
            serviceCode = scanner.nextLine();
            if (!Regex.serviceCode(serviceCode)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.serviceCode(serviceCode));

        String serviceName;
        do {
            System.out.println("Nhập tên dịch vụ ( Chữ cái đầu phải viết hoa ): ");
            serviceName = scanner.nextLine();
            if (!Regex.nameRoom(serviceName)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.nameRoom(serviceName));

        int usableArea = 0;
        do {
            try {
                System.out.println("Nhập diện tích sử dụng ( lớn hơn 30m2 ): ");
                usableArea = Integer.parseInt(scanner.nextLine());
                if (usableArea < 0) {
                    System.out.println("Diện tích phải lớn hơn , vui lòng nhập lại: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Không được nhập chữ, vui lòng nhập lại: ");
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
                System.out.println("Vui lòng nhập số....");
            }
        } while (rentalCosts <= 0);

        int maxNumberPeople = 0;
        do {
            try {
                System.out.println("Nhập số lượng người tối đa ( lớn hơn 0 và nhỏ hơn 20 ): ");
                maxNumberPeople = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Số lượng người phải nhập số,vui lòng nhập lại: ");
            }
        } while (maxNumberPeople < 0 || maxNumberPeople > 20);

        String rentalType;
        do {
            System.out.println("Nhập kiểu thuê ( Year|Month|Day|Hourly ): ");
            rentalType = scanner.nextLine();
            if (!Regex.rentalTypeRoom(rentalType)) {
                System.out.println("Sai định dạng kiểu thuê, vui lòng nhập lại: ");
            }
        } while (!Regex.rentalTypeRoom(rentalType));

        String free;
        do {
            System.out.println("Nhập dịch vụ miễn phí đi kèm ( water|wifi ): ");
            free = scanner.nextLine();
            if (!Regex.freeRoom(free)) {
                System.out.println("Sai định dạng dịch vụ miễn phí, vui lòng nhập lại: ");
            }
        } while (!Regex.freeRoom(free));

        Room newRoom = new Room(serviceCode, serviceName, usableArea, rentalCosts, maxNumberPeople, rentalType, free);
        return newRoom;
    }
}
