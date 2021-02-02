package _02_vongLapJava.bai_tap;

import java.util.Scanner;

public class CacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                for (byte i=0;i<3;i++){
                    for(byte j=0;j<6;j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                break;
            case 2:
                for(byte i=0;i<5;i++) {
                    for(byte j=0;j<i;j++) {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                System.out.println("");

                for(byte i=5;i>0;i--) {
                    for(byte j=0;j<i;j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");

                for(byte i=5;i>0;i--) {
                    for(byte j=0;j<i;j++) {
                        System.out.print(" ");
                    }
                    for (byte k = (byte) (i-1); k<4; k++){
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
                System.out.println("");

                for(byte i=0;i<5;i++) {
                    for(byte j=0;j<=i;j++) {
                        System.out.print(" ");
                    }
                    for (byte k = (byte) (i-1); k<4; k++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for(byte i=5;i>0;i--) {
                    for(byte j=0;j<i;j++) {
                        System.out.print(" ");
                    }
                    for (byte k = (byte) (i-1); k<4; k++){
                        System.out.print("*");
                    }
                    System.out.print("*");
                    for (byte e = (byte) (i-1); e<4; e++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 4:
                System.exit(4);
            default:
                System.out.println("No choice!");
        }
    }
}
