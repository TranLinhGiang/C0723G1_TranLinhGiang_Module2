package bai_tap_hoc_lai.case_study.view;

import bai_tap_hoc_lai.case_study.model.persion.Employee;
import bai_tap_hoc_lai.case_study.utils.Regex;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private final Scanner scanner = new Scanner(System.in);

    public void showMenuEmployee() {
        System.out.println("-- QUẢN LÝ NHÂN VIÊN --");
        System.out.println("1. Hiển thị danh sách nhân viên");
        System.out.println("2. Thêm nhân viên mới");
        System.out.println("3. Chỉnh sửa nhân viên theo id");
        System.out.println("4. Xóa nhân viên theo id");
        System.out.println("5. Tìm kiếm nhân viên theo tên");
        System.out.println("6. Trở về menu chính");
        System.out.println("Mời chọn chức năng: ");
    }

    public void display(List<Employee> employees) {
        if (employees.size() == 0) {
            System.out.println("Danh sách rỗng !!!!");
        } else {
            for (Employee employee : employees) {
                System.out.println("Danh sách: " + employee);
            }
        }
    }

    public Employee inputEmployee() {
        String id;
        do {
            System.out.println("Nhập mã nhân viên ( NV-YYYY ): ");
            id = scanner.nextLine();
            if (!Regex.idEmployee(id)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }

        } while (!Regex.idEmployee(id));

        String name;
        do {
            System.out.println("Nhập họ tên nhân viên ( viết hoa các ký tự đầu mỗi từ ):");
            name = scanner.nextLine();
            if (!Regex.nameAll(name)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.nameAll(name));


        System.out.println("Nhập ngày tháng năm sinh nhân viên: ");
        String dateOfBirth = scanner.nextLine();

        String idCardNumber;
        do {
            System.out.println("Nhập số chứng minh nhân dân của nhân viên ( CMND phải đủ 9 hoặc 12 số ): ");
            idCardNumber = scanner.nextLine();
            if (!Regex.idCardAll(idCardNumber)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.idCardAll(idCardNumber));

        String gender;
        do {
            System.out.println("Nhập giới tính của nhân viên ( male|female|lgpt ): ");
            gender = scanner.nextLine();
            if (!Regex.genderAll(gender)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.genderAll(gender));

        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại của nhân viên ( số điện thoại phải bắt đầu bằng 0 và dủ 10 số ): ");
            phoneNumber = scanner.nextLine();
            if (!Regex.phoneNumber(phoneNumber)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.phoneNumber(phoneNumber));

        String email;
        do {
            System.out.println("Nhập email của nhân viên ( vd: abc123@gmail.com ): ");
            email = scanner.nextLine();
            if (!Regex.emailAll(email)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.emailAll(email));

        String lever;
        do {
            System.out.println("Nhập trình độ của nhân viên (trung cap|cao dang|dai hoc|sau dai hoc): ");
            lever = scanner.nextLine();
            if (!Regex.leverEmployee(lever)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.leverEmployee(lever));

        String location;
        do {
            System.out.println("Nhập vị trí của nhân viên ( le tan|phuc vu|chuyen vien|giam sat|quan ly|giam doc ): ");
            location = scanner.nextLine();
            if (!Regex.locationEmployee(location)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.locationEmployee(location));

        double salary = 0;
        do {
            if (salary >= 0) {
                System.out.println("Nhập lương của nhân viên: ");
                salary = Double.parseDouble(scanner.nextLine());
            } else {
                System.out.println("Lương phải lớn hơn 0, vui lòng nhâpj lại: ");
                break;
            }
        } while (salary <= 0);

        Employee newEmployee = new Employee(id, name, dateOfBirth, gender, idCardNumber, phoneNumber, email, lever, location, salary);
        return newEmployee;

    }

    public String idEditEmployee() {
        System.out.println("Nhập id nhân viên bạn muốn chỉnh sửa: ");
        String id = scanner.nextLine();
        return id;
    }

    public Employee inputEditEmployee() {
        String id;
        do {
            System.out.println("Nhập mã nhân viên mới ( NV-YYYY ): ");
            id = scanner.nextLine();
            if (!Regex.idEmployee(id)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }

        } while (!Regex.idEmployee(id));

        String name;
        do {
            System.out.println("Nhập họ tên nhân viên ( viết hoa các ký tự đầu mỗi từ ):");
            name = scanner.nextLine();
            if (!Regex.nameAll(name)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.nameAll(name));


        System.out.println("Nhập ngày tháng năm sinh nhân viên mới: ");
        String dateOfBirth = scanner.nextLine();

        String idCardNumber;
        do {
            System.out.println("Nhập số chứng minh nhân dân của nhân viên mới ( CMND phải đủ 9 hoặc 12 số ): ");
            idCardNumber = scanner.nextLine();
            if (!Regex.idCardAll(idCardNumber)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.idCardAll(idCardNumber));

        String gender;
        do {
            System.out.println("Nhập giới tính của nhân viên mới ( male|female|lgpt ): ");
            gender = scanner.nextLine();
            if (!Regex.genderAll(gender)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.genderAll(gender));

        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại của nhân viên mới ( số điện thoại phải bắt đầu bằng 0 và dủ 10 số ): ");
            phoneNumber = scanner.nextLine();
            if (!Regex.phoneNumber(phoneNumber)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.phoneNumber(phoneNumber));

        String email;
        do {
            System.out.println("Nhập email của nhân viên mới ( vd: abc123@gmail.com ): ");
            email = scanner.nextLine();
            if (!Regex.emailAll(email)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.emailAll(email));

        String lever;
        do {
            System.out.println("Nhập trình độ của nhân viên mới (trung cap|cao dang|dai hoc|sau dai hoc): ");
            lever = scanner.nextLine();
            if (!Regex.leverEmployee(lever)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.leverEmployee(lever));

        String location;
        do {
            System.out.println("Nhập vị trí của nhân viên mới( le tan|phuc vu|chuyen vien|giam sat|quan ly|giam doc ): ");
            location = scanner.nextLine();
            if (!Regex.locationEmployee(location)) {
                System.out.println("Nhập sai định dạng, vui long nhập lại: ");
            }
        } while (!Regex.locationEmployee(location));


        System.out.println("Nhập lương của nhân viên mới: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee newEmployee = new Employee(id, name, dateOfBirth, gender, idCardNumber, phoneNumber, email, lever, location, salary);
        return newEmployee;
    }

    public String idRemoveEmployee() {
        System.out.println("Nhập id nhân viên bạn muốn chỉnh : ");
        String id = scanner.nextLine();
        return id;
    }

    public void displaySearch(Employee employee) {
        String result = "Employee { Mã nhân viên = " + employee.getId() + ", Họ và tên = " + employee.getName() + ", Ngày tháng năm sinh = " + employee.getDateOfBirth() + ", Giới tính = " + employee.getGender() + ", Số chứng minnh nhân dân = " + employee.getIdCardNumber() + ", Số điện thoại = " + employee.getPhoneNumber() + ", email='" + employee.getEmail() + ", Trình độ = " + employee.getLever() + ", Vị trí = " + employee.getLocation() + ", Lương = " + employee.getSalary();
        System.out.println("Tìm thấy: " + result);
    }

    public String idSearchEmployee() {
        System.out.println("Nhập id nhân viên bạn muốn  : ");
        String id = scanner.nextLine();
        return id;
    }
}
