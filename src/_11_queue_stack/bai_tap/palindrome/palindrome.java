package _11_queue_stack.bai_tap.palindrome;

import java.util.*;

class PalindromeTest {

    public static void main(String[] args) {

        System.out.print("Enter any string:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();
        Queue queue = new LinkedList();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
            queue.add(inputString.charAt(i));
        }

        boolean check = true;
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT Palindrome");
        }


    }
}