package bai_tap_hoc_lai.mvc.model;

public class Truck extends TranSport {
    private int payload;

    public Truck() {
    }

    public Truck(String licensePlates, String manufacturerName, int yearOfManufacture, String owner, int payload) {
        super(licensePlates, manufacturerName, yearOfManufacture, owner);
        this.payload = payload;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "Biển số xe='" + getLicensePlates() + '\'' +
                ", Tên hãng sản xuất='" + getManufacturerName() + '\'' +
                ", Năm sản xuất=" + getYearOfManufacture() +
                ", Chủ sở hữu='" + getOwner() + '\'' +
                ", Trọng tải=" + payload + "T" +
                '}';
    }
}
