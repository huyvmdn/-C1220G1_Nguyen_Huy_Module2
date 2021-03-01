package _03_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DelElement {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
        } while (size < 0);
        int[] arr = new int[size];
        int[] arr2 = new int[size - 1];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("element" + i + ":");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter X:");
        int x = scanner.nextInt();
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                k = i;
                break;
            } else {
                k = -1;
            }
        }
        System.out.println(k);
        if (k != -1) {
            for (int i = 0; i < arr.length; i++) {
                if (i < k) {
                    arr2[i] = arr[i];
                } else if (i == k) {
                    continue;
                } else {
                    arr2[i - 1] = arr[i];
                }
            }
        } else {
            System.out.println("Not available " + x + " in array");
        }
        System.out.println(Arrays.toString(arr2));
    }

}
