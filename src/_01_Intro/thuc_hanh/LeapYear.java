package _01_Intro.thuc_hanh;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner namNhuan = new Scanner(System.in);
        int year;

        System.out.println("Nhập năm bạn muốn kiểm tra: ");
        year = namNhuan.nextInt();
        if ((year % 4==0 && year%100 !=0 && year % 400 !=0) || (year%100==0 && year % 400==0)) {
            System.out.println(" Là năm nhuận");
        }else {
            System.out.println("Không phải năm nhuận");
        }
    }
}
