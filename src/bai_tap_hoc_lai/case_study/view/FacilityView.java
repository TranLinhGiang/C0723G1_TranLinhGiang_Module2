package bai_tap_hoc_lai.case_study.view;

import bai_tap_hoc_lai.case_study.model.facility.Facility;

import java.util.List;
import java.util.Scanner;

public class FacilityView {
    private final Scanner scanner = new Scanner(System.in);

    public void menuFacility() {
        System.out.println("-- QUẢN LÝ CƠ SỞ --");
        System.out.println("1. Hiển thị danh sách sơ sở");
        System.out.println("2. Thêm cơ sở mới");
        System.out.println("3. Hiển thị danh sách cơ sở bảo trì");
        System.out.println("4. Xóa cơ sở");
        System.out.println("5. Trở về menu chính");
        System.out.println("Mời chọn chức năng: ");
    }

    public Facility inputInfoFacility() {
        System.out.println("Nhập tên cơ sở: ");
        String name = scanner.nextLine();
        System.out.println("Nhập địa chỉ cơ ");
        String address = scanner.nextLine();

        Facility newFacility = new Facility(name, address);
        return newFacility;
    }

    public void displayFacility(List<Facility> facilities) {
        if (facilities.size() == 0) {
            System.out.println("Không có danh sách !!!!");
        } else {
            for (Facility facility : facilities) {
                System.out.println(" Danh sách: " + facility);
            }
        }
    }

    public void displayMaintenanceFacility(List<Facility> facilities) {
        if (facilities.size() == 0) {
            System.out.println("Không có danh sách bảo trì !!!!!!");
        }else {
            System.out.println("Không có danh sách bảo trì !!!!!!");
        }
    }

    public String inputRemoveFacility() {
        System.out.println("Nhập tên của cơ sở bạn muốn xóa: ");
        String name = scanner.nextLine();
        return name;
    }
}
