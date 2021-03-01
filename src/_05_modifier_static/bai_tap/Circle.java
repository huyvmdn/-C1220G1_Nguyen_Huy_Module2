package _05_modifier_static.bai_tap;

public class Circle {

    private double radius = 1.0;
    private static String color = "red";

    Circle() {
    }

    Circle(double radius){
        this.radius=radius;
    }
    static String  getColor(){
        return color;
    }
     double getRadius() {
        return radius;
    }
     double getArea() {
        return radius*radius*Math.PI;
    }
}
class TestCircle {
    public static void main(String[] args) {
        Circle hinhTron=new Circle(6.0);
        System.out.println(hinhTron.getArea());
        System.out.println(hinhTron.getRadius());
        System.out.println(hinhTron.getColor());
    }
}
