package bai_tap_hoc_lai.ss12_java_collection.model;

public class Fruit {
    private int id;
    private String name;
    private String typeFruit;           // loai trai cay
    private String dateOfManufacture;  // ngay san xuat
    private String expiry;              // han su dung
    private String origin;               // xuat xu.

    public Fruit() {
    }

    public Fruit(int id, String name, String typeFruit, String dateOfManufacture, String expiry, String origin) {
        this.id = id;
        this.name = name;
        this.typeFruit = typeFruit;
        this.dateOfManufacture = dateOfManufacture;
        this.expiry = expiry;
        this.origin = origin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Fruit{" +
                "id= " + id +
                ", Tên='" + name + '\'' +
                ", Loại trái cây='" + typeFruit + '\'' +
                ", Ngày sản xuất='" + dateOfManufacture + '\'' +
                ", Hạn sử dụng='" + expiry + '\'' +
                ", xuất xứ='" + origin + '\'' +
                '}';
    }
}
