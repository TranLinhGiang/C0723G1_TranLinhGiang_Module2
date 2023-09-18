package bai_tap_hoc_lai.mvc.model;

public class Car extends TranSport {
    private int numberOfSeats;
    private String typeCar;

    public Car(String licensePlates, String manufacturerName, int yearOfManufacture, String owner, int numberOfSeats, String typeCar) {
        super(licensePlates, manufacturerName, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.typeCar = typeCar;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Biển số xe='" + getLicensePlates() + '\'' +
                ", Tên hãng='" + getManufacturerName() + '\'' +
                ", Năm sản xuất=" + getYearOfManufacture() +
                ", Chủ sở hữu='" + getOwner() + '\'' +
                ", Số chỗ ngồi=" + numberOfSeats +
                ", Kiểu xe='" + typeCar + '\'' +
                '}';
    }
}
