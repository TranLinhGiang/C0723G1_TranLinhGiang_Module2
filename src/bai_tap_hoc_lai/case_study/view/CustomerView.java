package bai_tap_hoc_lai.case_study.view;

import bai_tap_hoc_lai.case_study.controller.CustomerController;
import bai_tap_hoc_lai.case_study.model.persion.Customer;

import javax.security.sasl.SaslClient;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    Scanner scanner = new Scanner(System.in);

    public void menuCustomer() {
        System.out.println("-- QUẢN LÝ KHÁCH HÀNG --");
        System.out.println("1. Hiển thị danh sách khách hàng");
        System.out.println("2. Thêm khách hàng mới");
        System.out.println("3. Chỉnh sửa khách hàng theo id");
        System.out.println("4. Xóa khách hàng theo id");
        System.out.println("5. Tìm kiếm khách hàng theo tên");
        System.out.println("6. Trở về menu chính");
    }

    public void displayCustomer(List<Customer> customers) {
        if (customers.size() == 0) {
            System.out.println("Danh sách rỗng !!!!!");
        } else {
            for (Customer customer : customers) {
                System.out.println("Danh sách: " + customer);
            }
        }
    }

    public Customer inputInfoCustomer() {
        System.out.println("Nhập mã khách hàng: ");
        String id = scanner.nextLine();

        System.out.println("Nhập họ và tên khách hàng: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh của khách hàng: ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập giới tính của khách hàng: ");
        String gender = scanner.nextLine();

        System.out.println("Nhập số chứng minh nhân dân khách hàng: ");
        String idCardNumber = scanner.nextLine();

        System.out.println("Nhập số điện thoại khách hàng: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Nhập email khách hàng: ");
        String email = scanner.nextLine();

        System.out.println("Nhập loại khách hàng: ");
        String typeOfGuest = scanner.nextLine();

        System.out.println("Nhập địa chỉ của khách hàng: ");
        String address = scanner.nextLine();

        Customer newCustomer = new Customer(id, name, dateOfBirth, gender, idCardNumber, phoneNumber, email, typeOfGuest, address);
        return newCustomer;

    }

    public String inputIdEdit() {
        System.out.println("Nhập id của khách hàng bạn chỉnh sửa: ");
        String id = scanner.nextLine();
        return id;
    }

    public Customer inputEditCustomer() {
        System.out.println("Nhập mã khách hàng mới : ");
        String id = scanner.nextLine();

        System.out.println("Nhập họ và tên khách hàng mới: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh của khách hàng mới: ");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Nhập giới tính của khách hàng mới: ");
        String gender = scanner.nextLine();

        System.out.println("Nhập số chứng minh nhân dân khách hàng mới: ");
        String idCardNumber = scanner.nextLine();

        System.out.println("Nhập số điện thoại khách hàng mới: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Nhập email khách hàng mới: ");
        String email = scanner.nextLine();

        System.out.println("Nhập loại khách hàng mới: ");
        String typeOfGuest = scanner.nextLine();

        System.out.println("Nhập địa chỉ của khách hàng mới: ");
        String address = scanner.nextLine();

        Customer newCustomer = new Customer(id, name, dateOfBirth, gender, idCardNumber, phoneNumber, email, typeOfGuest, address);
        return newCustomer;

    }

    public String inputIdRemove() {
        System.out.println("Nhập id của khách hàng bạn muốn xóa: ");
        String id = scanner.nextLine();
        return id;
    }

    public void displaySearchCustomer(Customer customer) {
        String result = "Customer { Mã khách hàng= " + customer.getId() + ", Họ và tên= " + customer.getName() + ", Ngày tháng năm sinh= " + customer.getDateOfBirth() + ", Giới tính= " + customer.getGender() + ", Số chứng minnh nhân dân= " + customer.getIdCardNumber() + ", Số điện thoại= " + customer.getPhoneNumber() + ", email= " + customer.getEmail() + ", Loại khách= " + customer.getTypeOfGuest() + ", Địa chỉ= " + customer.getAddress();
        System.out.println("Tìm thấy: " + result);
    }
    public String inputNameSearch() {
        System.out.println("Nhập tên khách hàng bạn muốn tìm: ");
        String name = scanner.nextLine();
        return name;
    }
}
