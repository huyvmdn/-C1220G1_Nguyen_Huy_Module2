package _03_Array_Method.bai_tap;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuổi");
            String s = scanner.nextLine();
        System.out.println("nhập ký tự");
            char c = scanner.next().charAt(0);
            int answer = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == c) {
                    answer ++;
                }
            }
            System.out.print("ký tự "+c+" có "+answer);
        }
}
