package bai_tap_hoc_lai.ss16_io_text_file.controller;

import bai_tap_hoc_lai.ss16_io_text_file.model.Job;
import bai_tap_hoc_lai.ss16_io_text_file.service.impl.JobServiceImpl;
import bai_tap_hoc_lai.ss16_io_text_file.view.JobView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JobController {
    private final JobView view = new JobView();
    private final Scanner scanner = new Scanner(System.in);
    private final JobServiceImpl jobService = new JobServiceImpl();
    int choice;

    public void run() {
        do {
            try {
                do {
                    view.showMenu();
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            view.displayJob(jobService.getList());
                            break;
                        case 2:
                            jobService.add(view.inputInfoJob());
                            System.out.println("Vừa thêm mới");
                            break;
                        case 3:
                            jobService.removeJob(view.inputIdRemove());
                            break;
                        case 4:
                            jobService.editJob(view.inputIdEdit(), view.inputEditJob());
                            System.out.println("Bạn vừa chỉnh sửa thành công");
                            break;
                        case 5:
                            Job job = jobService.searchId(view.idSearch());
                            if (job == null) {
                                System.out.println("Không tìm thấy !!!!!!");
                                break;
                            } else {
                                view.displaySearch(job);
                            }
                            break;
                        case 6:
                            List<Job> jobList = jobService.searchName(view.nameSearch());
                            if (jobList.size() > 0) {
                                System.out.println(jobList);
                            } else {
                                System.out.println("Không tìm thấy !!!!!!");
                            }
                            break;
                        case 7:
                            view.showMenu();
                            break;
                        case 8:
                            break;
                    }
                } while (choice != 8);

            } catch (Exception e) {
                System.out.println("Bạn chọn không đúng chức năng như ở menu, vui lòng chọn lại chức năng: ");
            }
        } while (true);
    }
}
