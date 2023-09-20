package bai_tap_hoc_lai.ss14_sort.model;

public class Pay {
    private int id;
    private String name;
    private int day;
    private double money;
    private String describe;

    public Pay() {
    }

    public Pay(int id, String name, int day, double money, String describe) {
        this.id = id;
        this.name = name;
        this.day = day;
        this.money = money;
        this.describe = describe;
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Pay{" +
                "Mã chi tiêu=" + id +
                ", Tên chi tiêu='" + name + '\'' +
                ", Ngày chi tiêu=" + day +
                ", Số tiền chi tiêu=" + money +
                ", Mô ='" + describe + '\'' +
                '}';
    }
}
