package bai_tap_jame.ss06.bai2;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] result = new float[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }
    @Override
    public String toString() {
        return "Point2D (" +
                "x=" + x +
                ", y=" + y +
                ')' +
                ", Array of { " +
                getXY() + "}";
    }

    public static class TestPoint2D {
        public static void main(String[] args) {
            Point2D point2D = new Point2D(1, 4);
            System.out.println("( " + point2D.getX() + ", " + point2D.getY() + " )");
            point2D = new Point2D(5, 8);
            System.out.println("Array of " + Arrays.toString(point2D.getXY()));

        }
    }
}
