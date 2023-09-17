package bai_tap_hoc_lai.mvc.model;

public class Motorbike extends TranSport {
    private String wattage; // cong suat

    public Motorbike() {
    }

    public Motorbike(String licensePlates, String manufacturerName, int yearOfManufacture, String owner, String wattage) {
        super(licensePlates, manufacturerName, yearOfManufacture, owner);
        this.wattage = wattage;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "motorbike{" +
                "licensePlates='" + getLicensePlates() + '\'' +
                ", manufacturerName='" + getManufacturerName() + '\'' +
                ", yearOfManufacture=" + getYearOfManufacture() +
                ", owner='" + getOwner() + '\'' +
                ", wattage='" + wattage + '\'' +
                '}';
    }
}
