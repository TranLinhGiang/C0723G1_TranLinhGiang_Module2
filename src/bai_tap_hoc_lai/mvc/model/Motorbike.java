package bai_tap_hoc_lai.mvc.model;

public class Motorbike extends TranSport {
    private String wattage;

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
                "Biển số xe='" + getLicensePlates() + '\'' +
                ", tên hãng sản xuất='" + getManufacturerName() + '\'' +
                ", Năm sản xuất=" + getYearOfManufacture() +
                ", Chủ sở hữu='" + getOwner() + '\'' +
                ", Công suất='" + wattage + '\'' +
                '}';
    }
}
