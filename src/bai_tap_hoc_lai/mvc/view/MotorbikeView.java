package bai_tap_hoc_lai.mvc.view;

import bai_tap_hoc_lai.mvc.model.Car;
import bai_tap_hoc_lai.mvc.model.Motorbike;

import java.util.List;
import java.util.Scanner;

public class MotorbikeView {
    private final Scanner scanner = new Scanner(System.in);

    public void menuMotorbike() {
        System.out.println("1. Them moi xe may");
        System.out.println("2. Hien thi xe may");
        System.out.println("3. Xoa xe may");
        System.out.println("4. Tim kiem xe may theo bien kiem soat");
        System.out.println("5. Tro ve menu chinh");
        System.out.println(" Moi chon chuc nang: ");
    }

    public Motorbike inputInfoMotorbike() {
        System.out.println("Nhap bien kiem soat cua xe may : ");
        String licensePlates = scanner.nextLine();

        System.out.println("Nhap ten hang xe xe may: ");
        String manufacturerName = scanner.nextLine();

        System.out.println("Nhap nam san xuat xe xe may: ");
        int yearOfManufacture = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap chu so huu xe xe may: ");
        String owner = scanner.nextLine();


        System.out.println("Nhap cong suat cua xe may: ");
        String wattage = scanner.nextLine();

        Motorbike newMotorbike = new Motorbike(licensePlates, manufacturerName, yearOfManufacture, owner, wattage);
        return newMotorbike;
    }

    public void displayMoto(List<Motorbike> motorbikes) {
        if (motorbikes.size() == 0) {
            System.out.println("Danh sach rong");
            System.out.println("");
        } else {
            for (Motorbike motorbikeList : motorbikes) {
                System.out.println("Danh sach: " + motorbikeList);
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
    public void displaySearch( Motorbike motorbike){
        String result="Car { bien so xe: "+motorbike.getLicensePlates()+", ten hang san xuat: "+motorbike.getManufacturerName()+", nam san xuat: "+motorbike.getYearOfManufacture()+", chu so huu: "+motorbike.getOwner()+", cong suat: "+motorbike.getWattage();
        System.out.println("Tim thay: "+ result);
    }
}
