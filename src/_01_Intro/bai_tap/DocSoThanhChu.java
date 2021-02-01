package _01_Intro.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số cần đọc là: ");
        int number = scanner.nextInt();
//        String  hangChuc2=" twenty",
//                hangChuc3=   " thirty",
//                hangChuc4=  " forty",
//                hangChuc5=   " fifty",
//                hangChuc6=  " sixty",
//                hangChuc7= " seventy",
//                hangChuc8=   " eighty",
//                hangChuc9 = " ninety";
        double hangTram = Math.floor(number / 100);
        double hangChuc = Math.floor((number%100)/10);
        double hangDonVi = Math.floor(number % 10);
        switch (hangChuc) {
            case 2:
                String hangChucChu= " twenty";
                break;
            case 3:
                String hangChucChu= " twenty";
                break;
            case 4:
                String hangChucChu= " twenty";
                break;
        }
        String text="";
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("out of ability");
            }
        } else if (number >= 10 && number < 20) {
            int ones = number % 10;
            switch (ones) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;


            }
        } else if (number >= 20 && number < 100) {
            text+=
        }
    }
}
