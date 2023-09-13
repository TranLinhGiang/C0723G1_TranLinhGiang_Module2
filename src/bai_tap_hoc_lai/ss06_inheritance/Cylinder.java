package bai_tap_hoc_lai.ss06_inheritance;

public class Cylinder extends Circle {   // sử dụng extends để lớp Cylinder kế thừa lại lớp circle.
    private double height;

    public Cylinder() {
    }


    public Cylinder(double radius, String color, double height) {   // đây là overload
        super(radius, color);     // Thành phần radius, color được kế thừa lại của lớp Circle,sử dụng super để lấy lại giá trị từ circle.
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height is " +
                "height=" + height +
                " , which is a subclass of " +
                super.toString();
    }
}
