package bai_tap_hoc_lai.case_study.view;

import bai_tap_hoc_lai.case_study.model.facility.Facility;

import java.util.Scanner;

public class FacilityView {
    private final Scanner scanner = new Scanner(System.in);

    public void menuFacility() {
        System.out.println("1. Thêm mới Villa");
        System.out.println("2. Thêm mới House");
        System.out.println("3. Thêm mới Room");
        System.out.println("4. Trở về menu chính");
        System.out.println("Nếu bạn muốn xem danh sách, vui lòng bạn" +
                " vô file facility để xem giúp mình với ạ!!!!!!!! \n " +
                "Vì đề bài chỉ yêu cầu thêm thôi nên mình không làm phần hiển thị hehe :)))");
        System.out.println("Mời chọn chức năng: ");
    }
}
