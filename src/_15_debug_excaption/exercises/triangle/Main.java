package _15_debug_excaption.exercises.triangle;

import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) throws CheckException {

        System.out.println("nhập cạnh a :");
        double inputA = Double.parseDouble(scanner.nextLine());
        check(inputA);
        System.out.println("nhập cạnh b :");
        double inputB = Double.parseDouble(scanner.nextLine());
        check(inputB);
        System.out.println("nhập cạnh c :");
        double inputC = Double.parseDouble(scanner.nextLine());
        check(inputC);
        check(inputA,inputB,inputC);

    }
    public static void check(double edge) throws CheckException {
        if(edge<=0) {
            throw new CheckException(" Nhập số nhỏ hơn hoặc bằng 0");
        }
    }
    public static void check(double a, double b, double c)throws CheckException {
        if(a>b+c || b>a+c || c>a+b) {
            throw new CheckException(" 2 cạnh cộng lại nhỏ hơn cạnh còn lại");
        }
    }
}

