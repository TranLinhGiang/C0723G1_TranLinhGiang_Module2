package bai_tap_hoc_lai.ss10_list.view;

import bai_tap_hoc_lai.ss10_list.model.Fruit;

import java.util.List;
import java.util.Scanner;

public class FruitView {
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("=== Menu Fruit ===");
        System.out.println("1.Them");
        System.out.println("2.Xoa ");
        System.out.println("3.Chinh sua theo ten");
        System.out.println("4.Tim kiem theo ten");
        System.out.println("5.Hien thi danh sach");
        System.out.println("6.Tro ve menu chinh");
        System.out.println("Moi chon chuc nang: ");
    }

    public Fruit inputInfoAdd() {
        System.out.println("Nhap ten cua trai cay: ");
        String name = scanner.nextLine();

        System.out.println("Nhap loai trai cay: ");
        String type = scanner.nextLine();

        System.out.println("Nhap ngay san xuat: ");
        String dateOfManufacture = scanner.nextLine();

        System.out.println("Nhap ngay het han su dung: ");
        String expiry = scanner.nextLine();

        System.out.println("Nhap noi xuat xu: ");
        String origin = scanner.nextLine();

        System.out.println("Nhap gia cua trai cay: ");
        double price = Double.parseDouble(scanner.nextLine());

        Fruit newFruit = new Fruit(name, type, dateOfManufacture, expiry, origin, price);
        return newFruit;
    }

    public String idRemove() {
        System.out.println("Nhap ten cua loai trai cay ban muon xoa: ");
        String name = scanner.nextLine();
        return name;
    }

    public String ifEdit() {
        System.out.println("Nhap ten cua loai trai cay ban muon chinh sua: ");
        String name = scanner.nextLine();
        return name;
    }

    public Fruit inputInfoEdit() {
        System.out.println("Nhap ten moi cua trai cay: ");
        String name = scanner.nextLine();

        System.out.println("Nhap loai trai cay moi: ");
        String type = scanner.nextLine();

        System.out.println("Nhap ngay san xuat moi: ");
        String dateOfManufacture = scanner.nextLine();

        System.out.println("Nhap ngay het han su dung moi: ");
        String expiry = scanner.nextLine();

        System.out.println("Nhap noi xuat xu moi: ");
        String origin = scanner.nextLine();

        System.out.println("Nhap gia moi cua trai cay: ");
        double price = Double.parseDouble(scanner.nextLine());

        Fruit newFruit = new Fruit(name, type, dateOfManufacture, expiry, origin, price);
        return newFruit;
    }

    public String nameSearh() {
        System.out.println("Nhap ten cua trai cay ban muon tim kiem: ");
        String name = scanner.nextLine();
        return name;
    }

    public void displaySearchFruit(Fruit fruit) {
        String result = "{ Fruit: name= " + fruit.getName() + ", loai= " + fruit.getTypeFruit() + ", ngay san xuat= " + fruit.getDateOfManufacture() + ", han su dung= " + fruit.getExpiry() + ", noi xuat xu= " + fruit.getOrigin() + ", gia= " + fruit.getPrice();
        System.out.println("Tim thay: " + result);
    }

    public void displayFruit(List<Fruit> fruits) {
        if (fruits.size() == 0) {
            System.out.println("danh sach rong!!!!");
        } else {
            for (Fruit fruitList : fruits) {
                System.out.println("Danh sach: " + fruitList);
            }
        }
    }
}
