package _01_Intro.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số cần đọc là: ");
        double number = scanner.nextDouble();
        String hangChucChu = "", hangTramChu = "", hangDVChu = "";

        int hangTram = (int) Math.floor(number / 100);
        int hangChuc = (int) Math.floor((number % 100) / 10);
        int hangDonVi = (int) (number % 10);

        switch (hangDonVi) {
            case 0:
                hangDVChu = "zero";
                break;
            case 1:
                hangDVChu = " one ";
                break;
            case 2:
                hangDVChu = " two ";
                break;
            case 3:
                hangDVChu = " three";
                break;
            case 4:
                hangDVChu = " four ";
                break;
            case 5:
                hangDVChu = "five ";
                break;
            case 6:
                hangDVChu = " six ";
                break;
            case 7:
                hangDVChu = " seven ";
                break;
            case 8:
                hangDVChu = " eigh ";
                break;
            case 9:
                hangDVChu = " nine ";
                break;
        }
        switch (hangChuc) {
            case 0:
                hangChucChu = "";
                break;
            case 1:
                hangChucChu = " tenty";
                break;
            case 2:
                hangChucChu = " twenty";
                break;
            case 3:
                hangChucChu = " thirty";
                break;
            case 4:
                hangChucChu = " forty";
                break;
            case 5:
                hangChucChu = " fifty";
                break;
            case 6:
                hangChucChu = " sixty";
                break;
            case 7:
                hangChucChu = " seventy";
                break;
            case 8:
                hangChucChu = " eighty";
                break;
            case 9:
                hangChucChu = " ninety";
                break;
        }
        switch (hangTram) {
            case 1:
                hangTramChu = " one hundred";
                break;
            case 2:
                hangTramChu = " two hundred";
                break;
            case 3:
                hangTramChu = " three hundred";
                break;
            case 4:
                hangTramChu = " four hundred";
                break;
            case 5:
                hangTramChu = "five hundred";
                break;
            case 6:
                hangTramChu = " six hundred";
                break;
            case 7:
                hangTramChu = " seven hundred";
                break;
            case 8:
                hangTramChu = " eigh hundred";
                break;
            case 9:
                hangTramChu = " nine hundred";
                break;

        }
        String text = "";
        if (number < 10 && number >= 0) {
            switch ((int) number) {
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
            int ones = (int) (number % 10);
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
            System.out.println(hangChucChu + hangDVChu);
        } else if (number >= 100 && number < 1000) {
            System.out.println(hangTramChu + hangChucChu + "and " + hangDVChu);
        }
    }
}
