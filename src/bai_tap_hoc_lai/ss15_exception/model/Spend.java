package bai_tap_hoc_lai.ss15_exception.model;

public class Spend {
    private int id;
    private String name;
    private String date;
    private double money;
    private String describe;

    public Spend() {
    }

    public Spend(int id, String name, String date, double money, String describe) {
        this.id = id;
        this.name = name;
        this.date = date;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
        return "Spend{" +
                "Mã chi tiêu='" + id + '\'' +
                ", Tên chi tiêu='" + name + '\'' +
                ", Ngày chi tiêu='" + date + '\'' +
                ", Số tiền chi=" + money +
                ", Mô tả thêm='" + describe + '\'' +
                '}';
    }
}
