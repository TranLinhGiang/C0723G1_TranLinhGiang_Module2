package bai_tap_hoc_lai.ss12_java_collection.view;

import bai_tap_hoc_lai.ss12_java_collection.model.Fruit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FruitView {
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("== Menu Fruit ==");
        System.out.println("1.Hiển thị danh sách");
        System.out.println("2.Thêm ");
        System.out.println("3.Xóa");
        System.out.println("4.Chỉnh sửa");
        System.out.println("6.Trở về menu chính");
        System.out.println("Mời chọn chức năng: ");
    }

    public Fruit inputInfoAdd() {
        System.out.println("Nhập id của trái cây: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên của trái cây: ");
        String name = scanner.nextLine();

        System.out.println("Nhập loại trái cây: ");
        String type = scanner.nextLine();

        System.out.println("Nhập ngày sản xuất: ");
        String dateOfManufacture = scanner.nextLine();

        System.out.println("Nhập ngày hết hạn sử dụng: ");
        String expiry = scanner.nextLine();

        System.out.println("Nhập nơi xuất xứ: ");
        String origin = scanner.nextLine();

        Fruit newFruit = new Fruit(id, name, type, dateOfManufacture, expiry, origin);
        return newFruit;
    }

    public void displayFruit(HashMap<Integer, Fruit> fruits) {
        if (fruits.size() == 0) {
            System.out.println("danh sach rong!!!!");
        } else {
            for (Map.Entry<Integer, Fruit> entry : fruits.entrySet()) {
                System.out.println("key = " + entry.getKey() +
                        "value = " + entry.getValue());
            }
        }
    }

    public Integer idRemove() {
        System.out.println("Nhập id bạn muốn xóa: ");
        Integer id = Integer.valueOf(scanner.nextLine());
        return id;
    }

    public Integer idEdit() {
        System.out.println("Nhap id của loại trái cây bạn muốn chỉnh sửa: ");
        Integer id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public Fruit inputEditNew() {
        System.out.println("Nhập id mới cho trái cây: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên mới cho trái cây: ");
        String name = scanner.nextLine();

        System.out.println("Nhập loại  trái cây mới: ");
        String type = scanner.nextLine();

        System.out.println("Nhập ngày sản xuất mới cho trái cây: ");
        String dateOfManufacture = scanner.nextLine();

        System.out.println("Nhập ngày hết hạn sử dụng mới: ");
        String expiry = scanner.nextLine();

        System.out.println("Nhập nơi xuất xứ mới: ");
        String origin = scanner.nextLine();

        Fruit newFruit = new Fruit(id, name, type, dateOfManufacture, expiry, origin);
        return newFruit;
    }
}

