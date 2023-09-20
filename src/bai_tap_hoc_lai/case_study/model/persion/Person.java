package bai_tap_hoc_lai.case_study.model.persion;

public abstract class Person {
    private String id;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String idCardNumber;    // so CMND
    private String phoneNumber;
    private String email;

    public Person() {
    }

    public Person(String id, String name, String dateOfBirth, String gender, String idCardNumber, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Mã ='" + id + '\'' +
                ", Họ và tên='" + name + '\'' +
                ", Ngày tháng năm sinh='" + dateOfBirth + '\'' +
                ", Giới tính='" + gender + '\'' +
                ", Số chứng minnh nhân dân='" + idCardNumber + '\'' +
                ", Số điện thoại='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
