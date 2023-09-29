package bai_tap_hoc_lai.case_study.view;

import bai_tap_hoc_lai.case_study.controller.CustomerController;
import bai_tap_hoc_lai.case_study.model.persion.Customer;
import bai_tap_hoc_lai.case_study.repository.impl.CustomerRepositoryImpl;
import bai_tap_hoc_lai.case_study.utils.Regex;

import javax.security.sasl.SaslClient;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    Scanner scanner = new Scanner(System.in);
    private final CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();

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

    public Customer inputInfoCustomer() throws Exception {
        String id = null;
        boolean check = false;
        do {
            do {
                try {
                    System.out.println("Nhập mã khách hàng ( KH-YYYY ): ");
                    id = scanner.nextLine();
                    if (customerRepository.checkId(id)) {
                        throw new Exception();
                    } else {
                        check = true;
                    }
                    if (!Regex.idCustomer(id)) {
                        System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
                    }
                } catch (Exception e) {
                    System.out.println("id da ton tai");
                    check = false;
                    break;
                }
            } while (!Regex.idCustomer(id));
        } while (!check);


        String name;
        do {
            System.out.println("Nhập họ và tên khách hàng ( Tên khách hàng phải viết hoa ký tự đầu mỗi từ ): ");
            name = scanner.nextLine();
            if (!Regex.nameAll(name)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.nameAll(name));


        System.out.println("Nhập ngày sinh của khách hàng: ");
        String dateOfBirth = scanner.nextLine();

        String gender;
        do {
            System.out.println("Nhập giới tính của khách hàng ( male|female|lgpt ): ");
            gender = scanner.nextLine();
            if (!Regex.genderAll(gender)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.genderAll(gender));


        String idCardNumber;
        do {
            System.out.println("Nhập số chứng minh nhân dân khách hàng ( CMND phải đủ 9 hoặc 12 số ): ");
            idCardNumber = scanner.nextLine();
            if (!Regex.idCardAll(idCardNumber)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.idCardAll(idCardNumber));

        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại khách hàng ( số điện thoại bắt đầu số 0 mà đủ 10 số ): ");
            phoneNumber = scanner.nextLine();
            if (!Regex.phoneNumber(phoneNumber)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.phoneNumber(phoneNumber));

        String email;
        do {
            System.out.println("Nhập email khách hàng ( vd: abc123@gmail.com ): ");
            email = scanner.nextLine();
            if (!Regex.emailAll(email)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.emailAll(email));

        String typeOfGuest;
        do {
            System.out.println("Nhập loại khách hàng ( diamond|platinum|gold|silver ): ");
            typeOfGuest = scanner.nextLine();
            if (!Regex.typeCustomer(typeOfGuest)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.typeCustomer(typeOfGuest));


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
        String id;
        do {
            System.out.println("Nhập mã khách hàng mới ( KH-YYYY ): ");
            id = scanner.nextLine();
            if (!Regex.idCustomer(id)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.idCustomer(id));

        String name;
        do {
            System.out.println("Nhập họ và tên khách hàng mới ( Tên khách hàng phải viết hoa ký tự đầu mỗi từ ): ");
            name = scanner.nextLine();
            if (!Regex.nameAll(name)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.nameAll(name));

        System.out.println("Nhập ngày sinh của khách hàng mới: ");
        String dateOfBirth = scanner.nextLine();

        String gender;
        do {
            System.out.println("Nhập giới tính của khách hàng mới( male|female|lgpt ): ");
            gender = scanner.nextLine();
            if (!Regex.genderAll(gender)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.genderAll(gender));

        String idCardNumber;
        do {
            System.out.println("Nhập số chứng minh nhân dân khách hàng mới ( CMND phải đủ 9 hoặc 12 số ): ");
            idCardNumber = scanner.nextLine();
            if (!Regex.idCardAll(idCardNumber)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.idCardAll(idCardNumber));

        String phoneNumber;
        do {
            System.out.println("Nhập số điện thoại khách hàng mới( số điện thoại bắt đầu số 0 mà đủ 10 số ): ");
            phoneNumber = scanner.nextLine();
            if (!Regex.phoneNumber(phoneNumber)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.phoneNumber(phoneNumber));

        String email;
        do {
            System.out.println("Nhập email khách hàng mới( vd: abc123@gmail.com ): ");
            email = scanner.nextLine();
            if (!Regex.emailAll(email)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.emailAll(email));

        String typeOfGuest;
        do {
            System.out.println("Nhập loại khách hàng mới( diamond|platinum|gold|silver ): ");
            typeOfGuest = scanner.nextLine();
            if (!Regex.typeCustomer(typeOfGuest)) {
                System.out.println("Nhập sai định dạng, vui lòng nhập lại: ");
            }
        } while (!Regex.typeCustomer(typeOfGuest));

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
