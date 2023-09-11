package bai_tap_jame.ss05_access_modifier.bai1;

public class Circle {
    private double radius = 1.0d;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
    public static class TestCircle {
        public static void main(String[] args) {
            Circle circle = new Circle();
            System.out.println(circle.toString());
            circle.setRadius(3.6);
            circle.setColor("blue");
            System.out.println(circle);
        }
    }
}
