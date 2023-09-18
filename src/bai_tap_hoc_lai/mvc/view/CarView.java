package bai_tap_hoc_lai.mvc.view;

import bai_tap_hoc_lai.mvc.model.Car;
import bai_tap_hoc_lai.mvc.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class CarView {
    private final Scanner scanner = new Scanner(System.in);

    public void menuCar() {
        System.out.println("1. Thêm mới ô tô");
        System.out.println("2. Hiển thị danh sách ô tô");
        System.out.println("3. Xóa ô tô");
        System.out.println("4. Tìm kiếm ô tô theo biển kiểm soát");
        System.out.println("5. Trở về menu chính");
        System.out.println(" Mời chọn chức năng: ");
    }

    public Car inputInfoCar() {
        String licensePlates;
        do {
            System.out.println("Nhập biển kiểm soát của ô tô ( xxCAR-yyyy ): ");
            licensePlates = scanner.nextLine();
            if (!Regex.licensePlatesCar(licensePlates)) {
                System.out.println("Nhập sai định dạng của biển số xe ( vd: 73CAR-0000 ) : ");
            }
        } while (!Regex.licensePlatesCar(licensePlates));


        System.out.println("Nhập tên hãng xe: ");
        String manufacturerName = scanner.nextLine();
        int yearOfManufacture;
        do {
            System.out.println("Nhập năm sản xuất xe ô tô ( vd: 2019 ) : ");
            yearOfManufacture = Integer.parseInt(scanner.nextLine());
            if (!Regex.yearAll(String.valueOf(yearOfManufacture))) {
                System.out.println("Nhập sai định dạng, năm phải là 4 chữ số: ");
            }
        } while (!Regex.yearAll(String.valueOf(yearOfManufacture)));


        System.out.println("Nhập chủ sở hữu xe ô tô: ");
        String owner = scanner.nextLine();
        int numberOfSeats;
        do {
            System.out.println("Nhập số chỗ ngồi (số chỗ ngồi > 0 || <= 45) : ");
            numberOfSeats = Integer.parseInt(scanner.nextLine());
        } while (numberOfSeats <= 0 || numberOfSeats >= 45);

        String typeCar;
        do {
            System.out.println("Nhập kiểu xe (ca nhan, du lich, xe khach): ");
            typeCar = scanner.nextLine();
            if (!Regex.typeCar(typeCar)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.typeCar(typeCar));


        Car newCar = new Car(licensePlates, manufacturerName, yearOfManufacture, owner, numberOfSeats, typeCar);
        return newCar;
    }

    public String licensePlatesRemove() {
        System.out.println("Nhập biển số xe bạn muốn xóa: ");
        String licensePlates = scanner.nextLine();
        return licensePlates;
    }

    public void displayCar(List<Car> cars) {
        if (cars.size() == 0) {
            System.out.println("Chưa có danh sách xe");
        } else {
            for (Car car : cars) {
                System.out.println("Danh sách: " + car);
            }
        }
    }

    public String inputSearch() {
        System.out.println("Nhập biển số bạn muốn tìm: ");
        String licensePlates = scanner.nextLine();
        return licensePlates;
    }

    public void displaySearch(Car car) {
        String result = "Car { Biển số xe: " + car.getLicensePlates() + ", Tên hãng sản xuất: " + car.getManufacturerName() + ", Năm sản xuất: " + car.getYearOfManufacture() + ", Chủ sở hữu: " + car.getOwner() + ", Số chỗ ngồi: " + car.getNumberOfSeats() + ", Kiểu xe: " + car.getTypeCar();
        System.out.println("Tìm thấy: " + result);
    }
}
