package bai_tap_hoc_lai.ss13_search.model;

public class Spending {
    private String id;
    private String name;
    private String day;
    private double money;
    private String describe;   // mô tả

    public Spending() {
    }

    public Spending(String id, String name, String day, double money, String describe) {
        this.id = id;
        this.name = name;
        this.day = day;
        this.money = money;
        this.describe = describe;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
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
        return "Spending{" +
                "Mã chi tiêu ='" + id + '\'' +
                ", Tên chi tiêu ='" + name + '\'' +
                ", Ngày chi='" + day + '\'' +
                ", Số tiền chi =" + money +
                ", Mô tả ='" + describe + '\'' +
                '}';
    }
}
