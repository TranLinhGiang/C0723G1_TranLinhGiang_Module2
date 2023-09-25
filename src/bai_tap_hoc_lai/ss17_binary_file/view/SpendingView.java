package bai_tap_hoc_lai.ss17_binary_file.view;

import bai_tap_hoc_lai.ss17_binary_file.model.Spending;
import bai_tap_hoc_lai.ss17_binary_file.repository.impl.SpendingRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class SpendingView {
    private final Scanner scanner = new Scanner(System.in);
    private final SpendingRepositoryImpl spendingRepository = new SpendingRepositoryImpl();

    public void showMenu() {
        System.out.println("============================");
        System.out.println("=== QUẢN LÝ CÔNG VIỆC ===");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Xóa theo id");
        System.out.println("4. CHỉnh sửa theo id");
        System.out.println("5. Tìm kiếm theo mã chi tiêu");
        System.out.println("6. Tìm kiếm theo tên gần đúng");
        System.out.println("7. Thoát chương trình...");
        System.out.println(" Mời chọn chức năng: ");
    }

    public void displaySpendList(List<Spending> spendingList) {
        if (spendingList.size() == 0) {
            System.out.println("Danh sách rỗng !!!!!");
        } else {
            for (Spending list : spendingList) {
                System.out.println("Danh sách :" + list);
            }
        }
    }

    public Spending inputInfoSpend() {
        boolean isValid = false;
        int id = 0;
        do {
            try {

                System.out.println("Nhập mã chi tiêu: ");
                id = Integer.parseInt(scanner.nextLine());
                if (spendingRepository.checkId(id)) {
                   throw new Exception();
                } else {
                    isValid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("id không được nhập chữ: ");
                isValid = false;
            } catch (Exception e) {
                System.out.println("id đã tồn tại !!!!!, vui lònd nhập lại: ");
                isValid = false;
            }
            break;
        } while (!isValid);


        System.out.println("Nhap ten chi tieu: ");
        String name = scanner.nextLine();

        System.out.println("Nhap ngay hi tieu: ");
        int date = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap gia tien chi tieu: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Mo ta them chi tieu: ");
        String describe = scanner.nextLine();

        Spending newSpend = new Spending(id, name, date, price, describe);
        return newSpend;
    }

    public int inputRemoveId() {

        System.out.println("Nhap id cua cong viec ban muon xoa: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public int inputEditId() {
        System.out.println("Nhap id cua cong viec ban chinh sua: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public Spending inputInfoEdit() {
        int id = 0;
        boolean isValid = false;
        do {
            try {
                System.out.println("Nhap id moi cua cong viec: ");
                id = Integer.parseInt(scanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("id phai nhap so, vui long nhap lai: ");
                isValid = false;
            }
        } while (!isValid);


        System.out.println("Nhap ten chi tieu moi: ");
        String name = scanner.nextLine();

        System.out.println("Nhap ngay chi tieu moi: ");
        int date = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap gia tien chi tieu moi: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Mo ta them chi tieu moi: ");
        String describe = scanner.nextLine();

        Spending newSpend = new Spending(id, name, date, price, describe);
        return newSpend;
    }

    public int inputSearchId() {
        System.out.println("Nhap id cua cong viec ban muon tim: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public void displaySearch(Spending spending) {
        String result = "Spend { ma chi tieu= " + spending.getId() + ", ten chi tieu= " + spending.getName() + ", ngay chi tieu= " + spending.getDate() + ", gia chi tieu= " + spending.getPrice() + ", mo ta chi tieu= " + spending.getDescribe();
        System.out.println("Danh sach: " + result);
    }

    public String inputSearchName() {
        System.out.println("Nhap ten cua cong viec ban muon tim: ");
        String name = scanner.nextLine();
        return name;
    }
}
