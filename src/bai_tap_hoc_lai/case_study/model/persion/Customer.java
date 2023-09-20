package bai_tap_hoc_lai.case_study.model.persion;

public class Customer extends Person {
    private String typeOfGuest;   // loai khach
    private String address;

    public Customer() {
    }

    public Customer(String id, String name, String dateOfBirth, String gender, String idCardNumber, String phoneNumber, String email, String typeOfGuest, String address) {
        super(id, name, dateOfBirth, gender, idCardNumber, phoneNumber, email);
        this.typeOfGuest = typeOfGuest;
        this.address = address;
    }

    public String getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(String typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Mã khách hàng ='" + getId() + '\'' +
                ", Họ và tên='" + getName() + '\'' +
                ", Ngày tháng năm sinh='" + getDateOfBirth() + '\'' +
                ", Giới tính='" + getGender() + '\'' +
                ", Số chứng minnh nhân dân='" + getIdCardNumber() + '\'' +
                ", Số điện thoại='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", Loại khách='" + typeOfGuest + '\'' +
                ", Địa chỉ='" + address + '\'' +
                '}';
    }
}
