package _13_search_opirator.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class ContinueString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String string = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> substring = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            substring.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > substring.getLast()) {
                    substring.add(string.charAt(j));
                } else {
                    break;
                }
            }
            if (substring.size() > max.size()) {
                max.clear();
                max = substring;
            }
        }
        for (Character c : max) {
            System.out.print(c);
        }
    }
}
