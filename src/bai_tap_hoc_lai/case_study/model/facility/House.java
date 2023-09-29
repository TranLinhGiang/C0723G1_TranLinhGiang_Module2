package bai_tap_hoc_lai.case_study.model.facility;

public class House extends Facility {
    private String roomStandard;   // tieu chuan phong
    private int numberOfFloors;    // so tang

    public House() {
    }

    public House(String serviceCode, String serviceName, int usableArea, int rentalCosts, int maxNumberPeople, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCosts, maxNumberPeople, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "Mã dịch vụ='" + getServiceCode() + '\'' +
                ", Tên dịch vụ='" + getServiceName() + '\'' +
                ", Diện tích sử dụng=" + getUsableArea() +
                ", Chi phí thuê=" + getRentalCosts() +
                ", Số lượng người tối đa=" + getMaxNumberPeople() +
                ", Kiểu thuê='" + getRentalType() + '\'' +
                ", Tiêu chuẩn phòng='" + roomStandard + '\'' +
                ", Số tầng=" + numberOfFloors +
                '}';
    }
}
