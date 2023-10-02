package bai_tap_hoc_lai.ss20_mvc.view;

import java.util.Scanner;

public class ManageView {
    private final Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("1. Nhân viên");
        System.out.println("2. Khách hàng");
        System.out.println("3. Thoát chương trình");
        System.out.println(" Mời chọn chức năng: ");
    }

}
