package bai_tap_hoc_lai.ss16_io_text_file.model;

public class Job {
    private int id;
    private String name;
    private int date;
    private double money;
    private String describe;

    public Job(int id, String name, double money, String describe) {
    }

    public Job(int id, String name, int date, double money, String describe) {
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

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
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
        return "Job{" +
                "Mã chi tiêu=" + id +
                ", Tên chi tiêu='" + name + '\'' +
                ", Ngày chi tiêu='" + date + '\'' +
                ", Số tiền chi tiêu=" + money +
                ", Mô tả thêm='" + describe + '\'' +
                '}';
    }
}
