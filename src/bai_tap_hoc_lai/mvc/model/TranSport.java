package bai_tap_hoc_lai.mvc.model;

public abstract class TranSport {
    private String licensePlates;
    private String manufacturerName;
    private int yearOfManufacture;
    private String owner;

    public TranSport() {
    }

    public TranSport(String licensePlates, String manufacturerName, int yearOfManufacture, String owner) {
        this.licensePlates = licensePlates;
        this.manufacturerName = manufacturerName;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "licensePlates='" + licensePlates + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", owner='" + owner + '\'' +
                '}';
    }
}
