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
                "licensePlates='" + getLicensePlates() + '\'' +
                ", manufacturerName='" + getManufacturerName() + '\'' +
                ", yearOfManufacture=" + getYearOfManufacture() +
                ", owner='" + getOwner() + '\'' +
                ", payload=" + payload + "T" +
                '}';
    }
}
