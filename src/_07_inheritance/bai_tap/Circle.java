package _07_inheritance.bai_tap;

public class Circle {
    private double radius ;
    private String color="green";

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
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
class Cylinder extends Circle{
    private double high;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double high) {
        super(radius, color);
        this.high = high;
    }
    public double getVolume() {
        return high*getArea();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "high=" + high +", "+
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {

        Circle circle= new  Circle(3.5,"indigo");
        System.out.println(circle);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        Cylinder cylinder=new Cylinder(3.5,"indigo",5);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getPerimeter());
        System.out.println(cylinder.getVolume());
    }
}