package bai_tap_jame.ss06.bai2;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = this.getX();
        result[1] = this.getY();
        result[2] = this.z;
        return result;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", Array of {x,y,z}" + getXYZ() +
                '}';
    }

    public static class TestPoint3D {
        public static void main(String[] args) {
            Point3D point3D = new Point3D(1, 2, 3);
            System.out.println("{" + point3D.getX() + "," + point3D.getY() + "," + point3D.getZ() + "}");
            point3D = new Point3D(7, 8, 9);
            System.out.println("Arrat of: "+Arrays.toString(point3D.getXYZ()));
        }
    }
}
