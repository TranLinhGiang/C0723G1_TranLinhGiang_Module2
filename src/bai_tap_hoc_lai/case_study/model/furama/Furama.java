package bai_tap_hoc_lai.case_study.model.furama;

public abstract class Furama {
    private String serviceCode; // ma dich vu
    private String srviceName;  // ten dich vu
    private int usableArea;    // dien tich su dung
    private int rentalCosts;   // chi phi thue
    private int maxNumberPeople;     // so luong nguoi toi da
    private String rentalType;     // kieu thue

    public Furama() {
    }

    public Furama(String serviceCode, String srviceName, int usableArea, int rentalCosts, int maxNumberPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.srviceName = srviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxNumberPeople = maxNumberPeople;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getSrviceName() {
        return srviceName;
    }

    public void setSrviceName(String srviceName) {
        this.srviceName = srviceName;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberPeople() {
        return maxNumberPeople;
    }

    public void setMaxNumberPeople(int maxNumberPeople) {
        this.maxNumberPeople = maxNumberPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Furama{" +
                "Mã dịch vụ='" + serviceCode + '\'' +
                ", Tên dịch vụ='" + srviceName + '\'' +
                ", Diện tích sử dụng=" + usableArea +
                ", Chi phí thuê=" + rentalCosts +
                ", Số lượng người tối đa=" + maxNumberPeople +
                ", Kiểu thuê='" + rentalType + '\'' +
                '}';
    }
}
