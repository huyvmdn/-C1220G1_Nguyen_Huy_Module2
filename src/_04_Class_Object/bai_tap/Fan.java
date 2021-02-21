package _04_Class_Object.bai_tap;

import java.util.Scanner;

public class Fan {
    static final byte SLOW = 1;
    static final byte MEDIUM = 2;
    static final byte FAST = 3;
    int speed = SLOW;
    boolean on = false;
    double radius = 5.0;
    static String color = "Blue";
    Fan() {
    }

    int getSpeed() {
        return this.speed;
    }

    boolean getOn() {
        return this.on;
    }

    double getRadius() {
        return this.radius;
    }

    String getColor() {
        return this.color;
    }
    void setSpeed(int speed){
        this.speed=speed;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    void setOn() {
        if (this.on == true) {
            this.on = false;
        } else {
            this.on = true;
        }
    }
    public String toString() {
        if (this.on==true){
            return  "speed: "+this.speed+"\n"
                    +"Color: "+this.color+"\n"
                    +"radius: "+this.radius+"\n"
                    +"Fan is on";
        } else {
           return "Color: "+this.color+"\n"
                    +"radius: "+this.radius+"\n"
                    +"Fan is off";
        }
    }

}
class Start{
    public static void main(String[] args) {
        Fan fan1= new Fan();
        Fan fan2=new Fan();
        fan1.setColor("Yellow");
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setOn();
        System.out.println("Fan1: \n"+fan1.toString());
        System.out.println("Fan2: \n"+fan2.toString());
    }
}
