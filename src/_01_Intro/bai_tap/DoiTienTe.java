package _01_Intro.bai_tap;

import java.util.Scanner;

public class DoiTienTe {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Số USD bạn muốn dổi: ");
        double usd= scanner.nextDouble();
        double vnd = usd * 23000;
        System.out.println("Số VND chuyển từ"+usd+": "+vnd+" VNĐ");
    }
}
