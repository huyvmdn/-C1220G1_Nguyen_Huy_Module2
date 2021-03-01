package _11_queue_stack.bai_tap.bracket_check;

import java.util.Scanner;
import java.util.Stack;

public class BracketCheck {
    public static void main(String[] args) {
        System.out.print("Enter any string:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Stack<Character> stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            if (stack.isEmpty() && inputString.charAt(i) == '(') {
                stack.push(inputString.charAt(i));
            } else if ((stack.isEmpty() && inputString.charAt(i) == ')')) {
                System.out.println("???");
            } else if (!stack.isEmpty()&& (inputString.charAt(i)== '(' || inputString.charAt(i)== ')' )) {
                stack.push(inputString.charAt(i));
            }
        }
        System.out.println(stack.toString());
        int temp=stack.size();
        if (temp%2==0){
        }


//        boolean check = true;
//        char checkChar= stack.pop();

//        while (!stack.isEmpty()) {
//           if (stack.pop()== checkChar) {
//               check=false;
//               break;
//           }
//        }
//        if (check) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("NOT Palindrome");
//        }

    }
}
