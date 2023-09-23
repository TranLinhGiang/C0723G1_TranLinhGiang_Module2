package bai_tap_hoc_lai.ss16_io_text_file.view;

import bai_tap_hoc_lai.ss16_io_text_file.model.Job;
import bai_tap_hoc_lai.ss16_io_text_file.repository.impl.JobRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class JobView {
    private final Scanner scanner = new Scanner(System.in);
    private final JobRepositoryImpl jobRepository = new JobRepositoryImpl();

    public void showMenu() {
        System.out.println("======================================");
        System.out.println("=== CHƯƠNG TRÌNH QUẢN LÝ CÔNG VIỆC ===");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Xóa theo id");
        System.out.println("4. Chỉnh sửa theo id");
        System.out.println("5. Tìm kiếm theo mã chi tiêu");
        System.out.println("6. Tìm kiếm gần đúng theo tên chi tiêu");
        System.out.println("7. Trở về menu chính");
        System.out.println("8. Thoát chương trình");
        System.out.println("======================================");
        System.out.println(" Mời chọn chức năng: ");
    }

    public void displayJob(List<Job> jobList) {
        if (jobList.size() == 0) {
            System.out.println("Danh sách rỗng !!!!!!");
        } else {
            for (Job job : jobList) {
                System.out.println("Danh sách: " + job);
            }
        }
    }

    public Job inputInfoJob() {
        boolean isValid = false;
        int id = 0;
        do {
            try {

                System.out.println("Nhập mã chi tiêu: ");
                id = Integer.parseInt(scanner.nextLine());
                if (jobRepository.checkId(id)) {
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
        } while (!isValid);


            System.out.println("Nhập tên chi tiêu: ");
           String name = scanner.nextLine();



        System.out.println("Nhập ngày chi tiêu: ");
        int date = Integer.parseInt(scanner.nextLine());


        double money = 0;
        do {
            try {
                if (money > 0) {
                    System.out.println("Nhập số tiền chi tiêu:");
                    money = Double.parseDouble(scanner.nextLine());
                    isValid = true;
                } else {
                    isValid = false;
                }

            } catch (Exception e) {
                System.out.println("Tiền chi tiêu phải nhập số, vui lòng nhập lại: ");
                isValid = false;
            }
        } while (!isValid);

        String describe = null;
        try {
            System.out.println("Mô tả thêm chi tiêu: ");
            describe = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
        }

        Job newJob = new Job(id, name,date, money, describe);
        return newJob;
    }

    public int inputIdRemove() {
        System.out.println("Nhập id bạn muốn xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public int inputIdEdit() {
        System.out.println("Nhập id bạn muốn chỉnh sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public Job inputEditJob() {
        boolean isValid = false;
        int id = 0;
        do {
            try {

                System.out.println("Nhập mã chi tiêu mới: ");
                id = Integer.parseInt(scanner.nextLine());
                if (jobRepository.checkId(id)) {
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
        } while (!isValid);


        System.out.println("Nhập tên chi tiêu mới: ");
        String name = scanner.nextLine();

        int date = 0;
        do {
            try {
                System.out.println("Nhập ngày chi tiêu mới: ");
                date = Integer.parseInt(scanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Ngày chi tiêu phải nhập số, vui lòng nhập lại: ");
                isValid = false;
            }
        } while (!isValid);

        double money = 0;
        do {
            try {
                System.out.println("Nhập số tiền chi tiêu mới:");
                money = Double.parseDouble(scanner.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Tiền chi tiêu không được nhập chữ, vui lòng nhập lại: ");
                isValid = false;
            }

        } while (!isValid);

        String describe = null;
        try {
            System.out.println("Mô tả thêm chi tiêu mới: ");
            describe = scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Job newJob = new Job(id, name, date, money, describe);
        return newJob;
    }

    public int idSearch() {
        System.out.println("Nhập mã chi tiêu bạn muốn tìm: ");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public void displaySearch(Job job) {
        String result = "Job { Mã chi tiêu: " + job.getId() + ", tên chi tiêu: " + job.getName() + ", Ngày chi tiêu: " + job.getDate() + ", số tiền chi tiêu: " + job.getMoney() + ", mô tả thêm: " + job.getDescribe();
        System.out.println("Tìm thấy: " + result);
    }

    public String nameSearch() {
        System.out.println("Nhập tên bạn muốn tim: ");
        String name = scanner.nextLine();
        return name;
    }

}
