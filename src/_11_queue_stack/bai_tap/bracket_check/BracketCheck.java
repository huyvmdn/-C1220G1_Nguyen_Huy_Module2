package _11_queue_stack.bai_tap.bracket_check;

import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        System.out.print("Enter any string:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();

        Stack<String> stack = new Stack<>();

        String[] tokens = inputString.split("");

        int len = tokens.length;

        for (int i = 0; i < len; i++) {
            if (tokens[i].equals(")")) {
                stack.push(tokens[i]);
            }
        }

        for (int i = 0; i < len; i++) {
            if (tokens[i].equals("(")) {
                if (stack.isEmpty()) {
                    System.out.println("???");
                }
                stack.pop();
            }
        }

        System.out.println(stack.isEmpty());
    }
}

