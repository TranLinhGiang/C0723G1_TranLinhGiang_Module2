package bai_tap_hoc_lai.mvc.view;

import bai_tap_hoc_lai.mvc.model.Car;

import java.util.List;
import java.util.Scanner;

public class CarView {
    private final Scanner scanner = new Scanner(System.in);

    public void menuCar() {
        System.out.println("1. Them moi o to");
        System.out.println("2. Hien thi o to");
        System.out.println("3. Xoa o to");
        System.out.println("4. Tim kiem o to theo bien kiem soat");
        System.out.println("5. Tro ve menu chinh");
        System.out.println(" Moi chon chuc nang: ");
    }

    public Car inputInfoCar() {
        System.out.println("Nhap bien kiem soat cua oto: ");
        String licensePlates = scanner.nextLine();

        System.out.println("Nhap ten hang xe oto: ");
        String manufacturerName = scanner.nextLine();

        System.out.println("Nhap nam san xuat xe oto: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap chu so huu xe oto: ");
        String owner = scanner.nextLine();

        System.out.println("Nhap so cho ngoi cua xe oto: ");
        int numberOfSeats= Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap kieu xe oto (du lich, xe khach): ");
        String typeCar= scanner.nextLine();

        Car newCar = new Car(licensePlates, manufacturerName, yearOfManufacture, owner,numberOfSeats,typeCar);
        return newCar;
    }

    public String licensePlatesRemove() {
        System.out.println("Nhap bien so xe ban muon xoa: ");
        String licensePlates = scanner.nextLine();
        return licensePlates;
    }

    public void displayCar(List<Car> cars) {
        if (cars.size() == 0) {
            System.out.println("Danh sach rong");
        } else {
            for (Car car : cars) {
                System.out.println("Danh sach: " + car);
            }
        }
    }

    public String inputSearch() {
        System.out.println("Nhap bien so xe ban muon tim: ");
        String licensePlates = scanner.nextLine();
        return licensePlates;
    }
    public void displaySearch( Car car){
        String result="Car { bien so xe: "+car.getLicensePlates()+", ten hang san xuat: "+car.getManufacturerName()+", nam san xuat: "+car.getYearOfManufacture()+", chu so huu: "+car.getOwner()+", so cho ngoi: "+car.getNumberOfSeats()+", kieu xe: "+car.getTypeCar();
        System.out.println("Tim thay: "+ result);
    }
}
