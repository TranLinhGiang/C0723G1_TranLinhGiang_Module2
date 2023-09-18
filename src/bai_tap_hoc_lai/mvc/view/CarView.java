package bai_tap_hoc_lai.mvc.view;

import bai_tap_hoc_lai.mvc.model.Car;
import bai_tap_hoc_lai.mvc.utils.Regex;

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
        String licensePlates;
        do {
            System.out.println("Nhap bien kiem soat cua oto ( xxCAR-yyyy ): ");
            licensePlates = scanner.nextLine();
            if (!Regex.licensePlatesCar(licensePlates)) {
                System.out.println("Nhap sai dinh dang cua bien so xe ( vd: 73CAR-0000 ) : ");
            }
        } while (!Regex.licensePlatesCar(licensePlates));


        System.out.println("Nhap ten hang xe oto: ");
        String manufacturerName = scanner.nextLine();
        int yearOfManufacture;
        do {
            System.out.println("Nhap nam san xuat xe oto ( vd: 2019 ) : ");
            yearOfManufacture = Integer.parseInt(scanner.nextLine());
            if (!Regex.yearAll(String.valueOf(yearOfManufacture))) {
                System.out.println("Nhap sai dinh dang, nam san xuat la 4 chu so: ");
            }
        } while (!Regex.yearAll(String.valueOf(yearOfManufacture)));


        System.out.println("Nhap chu so huu xe oto: ");
        String owner = scanner.nextLine();
        int numberOfSeats;
        do {
            System.out.println("Nhap so cho ngoi cua xe oto (so cho ngoi > 0 || <= 45) : ");
            numberOfSeats = Integer.parseInt(scanner.nextLine());
        } while (numberOfSeats <= 0 || numberOfSeats >= 45);

        String typeCar;
        do {
            System.out.println("Nhap kieu xe oto (ca nhan, du lich, xe khach): ");
            typeCar = scanner.nextLine();
            if (!Regex.typeCar(typeCar)) {
                System.out.println("Nhap sai dinh dang loai xe,vui long nhap lai: ");
            }
        } while (!Regex.typeCar(typeCar));


        Car newCar = new Car(licensePlates, manufacturerName, yearOfManufacture, owner, numberOfSeats, typeCar);
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

    public void displaySearch(Car car) {
        String result = "Car { bien so xe: " + car.getLicensePlates() + ", ten hang san xuat: " + car.getManufacturerName() + ", nam san xuat: " + car.getYearOfManufacture() + ", chu so huu: " + car.getOwner() + ", so cho ngoi: " + car.getNumberOfSeats() + ", kieu xe: " + car.getTypeCar();
        System.out.println("Tim thay: " + result);
    }
}
