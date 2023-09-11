package bai_tap_jame.ss06.bai1;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }


    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius= " + getRadius() +
                ", color= " + getColor() +
                ", height=" + height +
                ", Volume= " + getVolume() +
                '}';
    }

    public static class TestCylinder {
        public static void main(String[] args) {
            Cylinder cylinder = new Cylinder(3, "blue", 6.6);
            System.out.println(cylinder.toString());
        }
    }
}
