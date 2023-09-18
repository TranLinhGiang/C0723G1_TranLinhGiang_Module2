package bai_tap_hoc_lai.mvc.view;

import bai_tap_hoc_lai.mvc.model.Truck;
import bai_tap_hoc_lai.mvc.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class TruckView {
    Scanner scanner = new Scanner(System.in);

    public void menuTruck() {
        System.out.println("1. Thêm mới xe tải");
        System.out.println("2. Hiển thị xe tải");
        System.out.println("3. Xóa xe tải");
        System.out.println("4. Tìm kiếm xe tải theo biển số xe");
        System.out.println("5. Trở về menu chính");
        System.out.println(" Mời chọn chức nắng: ");
    }

    public Truck inputInfoTruck() {
        String licensePlates;
        do {
            System.out.println("Nhập biển số xe của xe tải ( xxTRUCK-yyyy ): ");
            licensePlates = scanner.nextLine();
            if (!Regex.licensePlatesTruck(licensePlates)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại ( vd: 73TRUCK-0001 ): ");
            }
        } while (!Regex.licensePlatesTruck(licensePlates));


        System.out.println("Nhập tên hãng xe: ");
        String manufacturerName = scanner.nextLine();

        int yearOfManufacture;
        do {
            System.out.println("Nhập năm sản xuất của xe tải: ");
            yearOfManufacture = Integer.parseInt(scanner.nextLine());
            if (!Regex.yearAll(String.valueOf(yearOfManufacture))) {
                System.out.println("Năm phải là 4 chữ số ( vd: 2019 ): ");
            }
        } while (!Regex.yearAll(String.valueOf(yearOfManufacture)));


        System.out.println("Nhập chủ sở hữu của xe tải: ");
        String owner = scanner.nextLine();

        int payload;
        do {
            System.out.println("Nhập trọng tải của xe tải ( Đơn vị là tấn ( >= 0T && <= 10T): ");
            payload = Integer.parseInt(scanner.nextLine());
        } while (payload <= 0 || payload >= 10);


        Truck newTruck = new Truck(licensePlates, manufacturerName, yearOfManufacture, owner, payload);
        return newTruck;
    }

    public void displayTruck(List<Truck> trucks) {
        if (trucks.size() == 0) {
            System.out.println("Chưa có danh sách");
        } else {
            for (Truck truck : trucks) {
                System.out.println("Danh sách: " + truck);
            }
        }
    }

    public String licensePlatesRemove() {
        System.out.println("Nhập biển số xe bạn muốn xóa: ");
        String licensePlates = scanner.nextLine();
        return licensePlates;
    }

    public String inputSearch() {
        System.out.println("Nhập biển số xe bạn muốn tìm: ");
        String licensePlates = scanner.nextLine();
        return licensePlates;
    }

    public void displaySearch(Truck truck) {
        String result = "Car { Biển số xe: " + truck.getLicensePlates() + ", Tên hãng sản xuất: " + truck.getManufacturerName() + ", Năm sản xuất: " + truck.getYearOfManufacture() + ", Chủ sở hữu: " + truck.getOwner() + ", Trọng tải: " + truck.getPayload();
        System.out.println("Tìm thấy: " + result);
    }
}
