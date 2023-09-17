package bai_tap_hoc_lai.mvc.view;

import bai_tap_hoc_lai.mvc.model.Truck;

import java.util.List;
import java.util.Scanner;

public class TruckView {
    Scanner scanner = new Scanner(System.in);

    public void menuTruck() {
        System.out.println("1. Them moi xe tai");
        System.out.println("2. Hien thi xe tai");
        System.out.println("3. Xoa xe tai");
        System.out.println("4. Tim kiem xe tai theo bien kiem soat");
        System.out.println("5. Tro ve menu chinh");
        System.out.println(" Moi chon chuc nang: ");
    }

    public Truck inputInfoTruck() {
        System.out.println("Nhap bien kiem soat cua xe tai: ");
        String licensePlates = scanner.nextLine();

        System.out.println("Nhap ten hang xe xe tai: ");
        String manufacturerName = scanner.nextLine();

        System.out.println("Nhap nam san xuat xe xe tai: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap chu so huu xe xe tai: ");
        String owner = scanner.nextLine();

        System.out.println("Nhap trong tai cua xe tai: ");
        int payload = Integer.parseInt(scanner.nextLine());

        Truck newTruck = new Truck(licensePlates, manufacturerName, yearOfManufacture, owner, payload);
        return newTruck;
    }

    public void displayTruck(List<Truck> trucks) {
        if (trucks.size() == 0) {
            System.out.println("Danh sach rong");
        } else {
            for (Truck truck : trucks) {
                System.out.println("Danh sach: " + truck);
            }
        }
    }

    public String licensePlatesRemove() {
        System.out.println("Nhap bien so xe ban muon xoa: ");
        String licensePlates = scanner.nextLine();
        return licensePlates;
    }

    public String inputSearch() {
        System.out.println("Nhap bien so xe ban muon tim: ");
        String licensePlates = scanner.nextLine();
        return licensePlates;
    }

    public void displaySearch(Truck truck) {
        String result = "Car { bien so xe: " + truck.getLicensePlates() + ", ten hang san xuat: " + truck.getManufacturerName() + ", nam san xuat: " + truck.getYearOfManufacture() + ", chu so huu: " + truck.getOwner() + ", trong tai: " + truck.getPayload();
        System.out.println("Tim thay: " + result);
    }
}
