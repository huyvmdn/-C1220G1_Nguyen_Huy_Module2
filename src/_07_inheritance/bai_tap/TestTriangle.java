package _07_inheritance.bai_tap;

import _07_inheritance.thuc_hanh.Shape;

public class TestTriangle {
    public static void main(String[] args) {
        Shape shape= new Shape();
        Triangle triangle= new Triangle(5,6,7);
        System.out.println(shape.toString());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.toString());

    }
}
class Triangle extends Shape{
    private double side1=1.0;
    private double side2=1.0;
    private double side3=1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double p= (side1+side2+side3)/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
