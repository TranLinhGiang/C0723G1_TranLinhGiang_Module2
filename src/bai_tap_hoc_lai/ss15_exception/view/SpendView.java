package bai_tap_hoc_lai.ss15_exception.view;

import bai_tap_hoc_lai.ss15_exception.model.Spend;
import bai_tap_hoc_lai.ss15_exception.repository.impl.SpendRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class SpendView {
    private final Scanner scanner = new Scanner(System.in);
    private final SpendRepositoryImpl spendRepository = new SpendRepositoryImpl();

    public void menuSpend() {
        System.out.println("========================");
        System.out.println("=== QUẢN LÝ CHI TIÊU ===");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm");
        System.out.println("3. Xóa theo id");
        System.out.println("4. Chỉnh sửa theo id");
        System.out.println("5. Tìm kiếm theo mã chi tiêu");
        System.out.println("6. Tìm kiếm gần đúng theo tên chi tiêu");
        System.out.println("7. Trở về menu chính");
        System.out.println("8. Thoát chương trình");
        System.out.println("=========================");
        System.out.println(" Mời chọn chức năng: ");
    }

    public void displaySpend(List<Spend> spendList) {

        if (spendList.size() == 0) {
            System.out.println("Danh sách rỗng !!!!");
        } else {
            for (Spend spend : spendList) {
                System.out.println("Danh sách: " + spend);
            }
        }
    }

    public Spend inputInfoSpend() {
        boolean isValid = false;
        int id = 0;
        do {
            do {
                try {
                    System.out.println("Nhập mã chi tiêu: ");
                    id = Integer.parseInt(scanner.nextLine());
                    if (spendRepository.checkId(id)) {
                        throw new Exception();
                    } else {
                        isValid = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("id không được nhập chữ: ");
                    isValid = false;
                } catch (Exception e) {
                    System.out.println("id đã tồn tại, vui lòng nhập id khác trong danh sách: ");
                    isValid = false;
                }
            } while (!isValid);
        } while (id < 0);


        System.out.println("Nhập tên chi tiêu: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày chi: ");
        String date = scanner.nextLine();
        double money = 0;
        do {
            try {
                System.out.println("Nhập số tiền chi: ");
                money = Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Không được nhập chữ, vui lòng nhập lại: ");
            }

        } while (money < 0);


        System.out.println("Mô tả thêm: ");
        String describe = scanner.nextLine();

        Spend newSpend = new Spend(id, name, date, money, describe);
        return newSpend;
    }

    public int inputRemove() {
        System.out.println("Nhập id bạn muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public int inputEdit() {
        System.out.println("Nhập id bạn muốn chỉnh sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public Spend inputEditSpend() {
        System.out.println("Nhập mã chi tiêu mới: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên chi tiêu mới: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày chi mới: ");
        String date = scanner.nextLine();

        System.out.println("Nhập số tiền chi mới: ");
        double money = Double.parseDouble(scanner.nextLine());

        System.out.println("Mô tả thêm: ");
        String describe = scanner.nextLine();

        Spend newSpend = new Spend(id, name, date, money, describe);
        return newSpend;
    }

    public void displaySearch(Spend spend) {
        String result = "Spend{ Mã chi= " + spend.getId() + ", tên chi tiêu= " + spend.getName() + ", ngày chi= " + spend.getDate() + ", số tiền chi= " + spend.getMoney() + ", Mô tả= " + spend.getDescribe();
        System.out.println("Tìm thấy: " + result);
    }

    public int inputIdSearch() {
        System.out.println("Nhập id bạn muốn tìm: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public String inputNameSearch() {
        System.out.println("Nhập tên bạn muốn tìm: ");
        String name = scanner.nextLine();
        return name;
    }
}
