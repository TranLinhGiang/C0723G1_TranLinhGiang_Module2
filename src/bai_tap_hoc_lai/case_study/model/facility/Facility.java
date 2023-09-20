package bai_tap_hoc_lai.case_study.model.facility;

public class Facility {
    private String name;
    private String address;

    public Facility() {
    }

    public Facility(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "Tên cơ sở='" + name + '\'' +
                ", địa chỉ cơ sở='" + address + '\'' +
                '}';
    }
}
