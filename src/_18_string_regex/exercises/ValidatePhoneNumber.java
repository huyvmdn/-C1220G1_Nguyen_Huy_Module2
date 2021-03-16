package _18_string_regex.exercises;

import java.util.Scanner;

public class ValidatePhoneNumber {
    static final String validateClass = "^[(]\\d{2}[)][\\-][(][0]\\d{9}[)]$";

    public static void main(String[] args) {
        check();
    }

    static public String  check() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số điện thoại(xx)-(0xxxxxxxxx): ");
            String input = scanner.nextLine();
            boolean check = input.matches(validateClass);
            if (check) {
                System.out.println("số điện thoại: " + input);
                return input;
            } else {
                System.out.println("nhập sai định dạng");
            }
        }
    }
}
