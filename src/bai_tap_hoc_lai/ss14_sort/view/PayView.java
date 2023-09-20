package bai_tap_hoc_lai.ss14_sort.view;

import bai_tap_hoc_lai.ss14_sort.model.Pay;

import java.util.List;
import java.util.Scanner;

public class PayView {
    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("1. Hiển thị danh sách: ");
        System.out.println("2. Thêm");
        System.out.println("3. Xóa");
        System.out.println("4. Sửa");
        System.out.println("5. Tìm kiếm theo mã chi tiêu");
        System.out.println("6. Tìm kiếm gần đúng theo tên chi tiêu");
        System.out.println("Mời chọn chức năng: ");
    }

    public Pay inputPay() {
        System.out.println("1. Nhập mã chi tiêu: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("2. Nhập tên chi tiêu: ");
        String name = scanner.nextLine();
        System.out.println("3. Nhập ngày chi tiêu: ");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("4. Nhập số tiền chi tiêu: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.println("5. Mô tả chi tiêu: ");
        String describe = scanner.nextLine();

        Pay newPay = new Pay(id, name, day, money, describe);
        return newPay;
    }

    public void displayPay(List<Pay> payList) {
        if (payList.size() == 0) {
            System.out.println("Chưa có danh sách !!!!!!");
        } else {
            for (Pay pay : payList) {
                System.out.println("Danhh sách: " + pay);
            }
        }
    }

    public int idRemove() {
        System.out.println("Nhập id bạn muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public int idEdit() {
        System.out.println("Nhập id bạn muốn sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public Pay inputEditPay() {
        System.out.println("Nhập mã chi tiêu mới: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chi tiêu mới: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày chi tiêu mới");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số tiền chi tiêu mới: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập tả mới: ");
        String describe = scanner.nextLine();

        Pay newPay = new Pay(id, name, day, money, describe);
        return newPay;
    }

    public int idSearch() {
        System.out.println("Nhập id bạn muốn tìm: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public void displaySearch(Pay pay) {
        String result = "  Pay { Mã chi tiêu = " + pay.getId() + ", Tên chi tiêu = " + pay.getName() + ", Ngày chi tiêu = " + pay.getDay() + ", Số tiền chi tiêu = " + pay.getMoney() + ", Mô tả = " + pay.getDescribe();
        System.out.println("Tìm thấy" + result);
    }

    public String nameSearch() {
        System.out.println("Nhập tên bạn muốn tìm: ");
        String name = scanner.nextLine();
        return name;
    }

}
