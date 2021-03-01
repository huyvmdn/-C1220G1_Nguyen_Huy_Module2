package _11_queue_stack.bai_tap.reverseIntArray;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size:");
            size = Integer.parseInt(scanner.nextLine()) ;
        } while (size < 0);
        Stack<String> stack = new Stack();
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a element:");
            String mWord = scanner.nextLine();
            stack.push(mWord);
        }
        System.out.println(stack.toString());
        Stack wStack = new Stack();
        for (int i = 0; i < size; i++) {
            wStack.push(stack.pop());
        }
        System.out.println(wStack.toString());
    }
}
