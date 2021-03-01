package _04_class_object.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;
     QuadraticEquation(double a,double b,double c){
        this.a= a;
        this.b= b;
        this.c= c;
    }
     double GetA() {
        return this.a;
    }
     double GetB() {
        return this.b;
    }
     double GetC() {
        return this.c;
    }
     double getDiscriminant() {
        return Math.pow(this.b,2) - 4*this.a*this.c;
    }
     double getRoot1(){
        return (-this.b+ Math.sqrt(Math.pow(this.b,2)-(4*this.a*this.c)))/2*this.a;
    }
     double getRoot2(){
        return (-this.b- Math.sqrt(Math.pow(this.b,2)-(4*this.a*this.c)))/2*this.a;
    }
}
class Equation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the a:");
        double a = scanner.nextDouble();
        System.out.print("Enter the b:");
        double b = scanner.nextDouble();
        System.out.print("Enter the c:");
        double c = scanner.nextDouble();
        QuadraticEquation bac2 = new QuadraticEquation(a,b,c);
        if (bac2.getDiscriminant() >0){
            System.out.println("root 1: "+bac2.getRoot1()+". root 2:"+bac2.getRoot2());
        } else if (bac2.getDiscriminant()==0){
            System.out.println("1 root: "+bac2.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}