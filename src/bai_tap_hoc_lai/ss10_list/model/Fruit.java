package bai_tap_hoc_lai.ss10_list.model;

public class Fruit {
    private String name;
    private String typeFruit;           // loai trai cay
    private String dateOfManufacture;  // ngay san xuat
    private String expiry;              // han su dung
    private String origin;               // xuat xu.
    private double price;

    public Fruit() {
    }

    public Fruit(String name, String typeFruit, String dateOfManufacture, String expiry, String origin, double price) {
        this.name = name;
        this.typeFruit = typeFruit;
        this.dateOfManufacture = dateOfManufacture;
        this.expiry = expiry;
        this.origin = origin;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeFruit() {
        return typeFruit;
    }

    public void setTypeFruit(String typeFruit) {
        this.typeFruit = typeFruit;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", typeFruit='" + typeFruit + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                ", expiry='" + expiry + '\'' +
                ", origin='" + origin + '\'' +
                ", price=" + price +
                '}';
    }
}
