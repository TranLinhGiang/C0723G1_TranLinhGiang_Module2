package bai_tap_hoc_lai.case_study.model.facility;

public class Room extends Facility {
    private String free;   // dich vu mien phi

    public Room() {
    }

    public Room(String serviceCode, String serviceName, int usableArea, int rentalCosts, int maxNumberPeople, String rentalType, String free) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maxNumberPeople, rentalType);
        this.free = free;
    }

    public String getFree() {
        return free;
    }

    public void setFree(String free) {
        this.free = free;
    }

    @Override
    public String toString() {
        return "Room{" +
                "Mã dịch vụ='" + getServiceCode() + '\'' +
                ", Tên dịch vụ='" + getServiceName() + '\'' +
                ", Diện tích sử dụng=" + getUsableArea() +
                ", Chi phí thuê=" + getRentalCosts() +
                ", Số lượng người tối đa=" + getMaxNumberPeople() +
                ", Kiểu thuê='" + getRentalType() + '\'' +
                ", Dịch vụ miễn phí='" + free + '\'' +
                '}';
    }
}
