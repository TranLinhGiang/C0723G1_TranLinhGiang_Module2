package bai_tap_hoc_lai.mvc.view;


import bai_tap_hoc_lai.mvc.model.Motorbike;
import bai_tap_hoc_lai.mvc.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class MotorbikeView {
    private final Scanner scanner = new Scanner(System.in);

    public void menuMotorbike() {
        System.out.println("1. Thêm mới xe máy");
        System.out.println("2. Hiển thị xe máy");
        System.out.println("3. Xóa xe máy");
        System.out.println("4. Tìm kiếm xe máy bằng biển kiểm soát");
        System.out.println("5. Trở về menu chính");
        System.out.println(" Mời chọn chức năng: ");
    }

    public Motorbike inputInfoMotorbike() {
        String licensePlates;
        do {
            System.out.println("Nhập biển kiểm soát của xe máy ( xxMOTO-yyyy ) : ");
            licensePlates = scanner.nextLine();
            if (!Regex.licensePlatesMoto(licensePlates)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại ( vd: 73MOTO-0001 ): ");
            }
        } while (!Regex.licensePlatesMoto(licensePlates));


        System.out.println("Nhập tên hãng xe: ");
        String manufacturerName = scanner.nextLine();
        int yearOfManufacture;
        do {
            System.out.println("Nhập năm sản xuất: ");
            yearOfManufacture = Integer.parseInt(scanner.nextLine());
            if (!Regex.yearAll(String.valueOf(yearOfManufacture))) {
                System.out.println("Nhập sai định dạng,vui lòng nhập lại ( vd: 2019 ): ");
            }
        } while (!Regex.yearAll(String.valueOf(yearOfManufacture)));


        System.out.println("Nhập chủ sở hữu xe máy: ");
        String owner = scanner.nextLine();

        String wattage;
        do {
            System.out.println("Nhập công suất xe máy ( manh | yeu | qua yeu ): ");
            wattage = scanner.nextLine();
            if (!Regex.wattageMoto(wattage)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.wattageMoto(wattage));


        Motorbike newMotorbike = new Motorbike(licensePlates, manufacturerName, yearOfManufacture, owner, wattage);
        return newMotorbike;
    }

    public void displayMoto(List<Motorbike> motorbikes) {
        if (motorbikes.size() == 0) {
            System.out.println("Chưa có danh sách");
            System.out.println("");
        } else {
            for (Motorbike motorbikeList : motorbikes) {
                System.out.println("Danh sách: " + motorbikeList);
            }
        }
    }

    public String licensePlatesRemove() {
        System.out.println("Nhập biển số xe banj muốn xóa: ");
        String licensePlates = scanner.nextLine();
        return licensePlates;
    }

    public String inputSearch() {
        System.out.println("Nhập biển số xe bạn muốn tìm: ");
        String licensePlates = scanner.nextLine();
        return licensePlates;
    }

    public void displaySearch(Motorbike motorbike) {
        String result = "Car { Biển số xe: " + motorbike.getLicensePlates() + ", Tên hãng sản xuất: " + motorbike.getManufacturerName() + ", Năm sản xuất: " + motorbike.getYearOfManufacture() + ", Chủ sở hữu: " + motorbike.getOwner() + ", Công suất: " + motorbike.getWattage();
        System.out.println("Tìm thấy: " + result);
    }
}
