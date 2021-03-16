package _18_string_regex.exercises;

import java.util.Scanner;

public class ValidateClass {
    static final String validateClass = "^[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        check();
    }

    static public String  check() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap ten lop");
            String input = scanner.nextLine();
            boolean check = input.matches(validateClass);
            if (check) {
                System.out.println("tên lớp: " + input);
                return input;
            } else {
                System.out.println("nhập sai định dạng");
            }
        }
    }
}
