package _07_inheritance.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

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
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[] array=new float[2];
        array[0]=x;
        array[1]=y;
        return array;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}
class Point3D extends Point2D{
    private float z;

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
    public void setXYZ(float x,float y,float z){
        this.setX(x);
        this.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] array=new float[3];
        array[0]=getX();
        array[1]=getY();
        array[2]=getZ();
        return array;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " +getZ()+ ')';
    }
}
class TestPoint{
    public static void main(String[] args) {
        Point2D point2D=new Point2D(5,7);
        Point3D point3D=new Point3D(5,7,12);
        System.out.println(point2D);
        System.out.println(point3D);
        System.out.println(point3D.getX());
        System.out.println(point3D.getZ());
        point3D.setXYZ(4,5,6);
        System.out.println(point3D);
    }
}
