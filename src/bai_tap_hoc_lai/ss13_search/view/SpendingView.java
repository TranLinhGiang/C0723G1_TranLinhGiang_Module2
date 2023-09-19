package bai_tap_hoc_lai.ss13_search.view;

import bai_tap_hoc_lai.ss13_search.controller.SpendingController;
import bai_tap_hoc_lai.ss13_search.model.Spending;

import java.util.List;
import java.util.Scanner;

public class SpendingView {
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("===  QUẢN LÝ CÔNG VIỆC ===");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm");
        System.out.println("3. Xóa theo id");
        System.out.println("4. Chỉnh sửa theo id");
        System.out.println("5. Tìm kiếm theo mã chi tiêu");
        System.out.println("6. Tìm kiếm gần đúng theo tên chi tiêu");
        System.out.println("7. Trở về menu chính");
        System.out.println("-- Mời chọn chức năng --");
    }

    public Spending inputInfoSpending() {
        System.out.println("Nhập mã chi tiêu: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên chi tiêu: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày chi tiêu: ");
        String day = scanner.nextLine();
        System.out.println("Nhập số tiền chi tiêu: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.println("Mô tả thêm chi tiêu: ");
        String describe = scanner.nextLine();

        Spending newSpending = new Spending(id, name, day, money, describe);
        return newSpending;
    }

    public void displaySpending(List<Spending> spendings) {

        if (spendings.size() == 0) {
            System.out.println("Chưa có danh sách !!!");
        } else {
            for (Spending spending : spendings) {
                System.out.println("Danh sách: " + spending);
            }
        }
    }

    public String inputIdRemove() {
        System.out.println("Nhập id bạn muốn xóa: ");
        String id = scanner.nextLine();
        return id;
    }

    public String inputIdEdit() {
        System.out.println("Nhập id để chỉnh sửa: ");
        String id = scanner.nextLine();
        return id;
    }

    public Spending inputEdit() {
        System.out.println("Nhập id mới: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên mới: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày mới: ");
        String day = scanner.nextLine();
        System.out.println("Nhập số tiền mới: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập mô tả mới: ");
        String describe = scanner.nextLine();

        Spending newSpending = new Spending(id, name, day, money, describe);
        return newSpending;
    }

    public String idSearch() {
        System.out.println("Nhập id bạn muốn tìm: ");
        String id = scanner.nextLine();
        return id;
    }

    public void displaySearch(Spending spending) {
        String result = "Spending : Mã chi tiêu= " + spending.getId() + ", Tên chi tiêu= " + spending.getName() + ", Ngày chi tiêu= " + spending.getDay() + ", Số tền chi tiêu= " + spending.getMoney() + ", mô tả= " + spending.getDescribe();
        System.out.println("Tìm thấy: " + result);
    }

    public String nameSearch() {
        System.out.println("Nhập tên chi tiêu bạn muôn tìm: ");
        String name = scanner.nextLine();
        return name;
    }
}

