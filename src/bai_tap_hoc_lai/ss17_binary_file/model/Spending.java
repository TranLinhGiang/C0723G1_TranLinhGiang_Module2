package bai_tap_hoc_lai.ss17_binary_file.model;

import java.io.Serializable;

public class Spending implements Serializable {
    private int id;
    private String name;
    private int date;
    private double price;
    private String describe;

    public Spending() {
    }

    public Spending(int id, String name, int date, double price, String describe) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.price = price;
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
                "Mã chi tiêu=" + id +
                ", Tên chi tiêu='" + name + '\'' +
                ", Ngày chi tiêu=" + date +
                ", Số tiền chi tiêu=" + price +
                ", Mô tả chi tiêu='" + describe + '\'' +
                '}';
    }
}
