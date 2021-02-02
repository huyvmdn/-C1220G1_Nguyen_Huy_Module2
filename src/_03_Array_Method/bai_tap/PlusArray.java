package _03_Array_Method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class PlusArray {
    public static void main(String[] args) {
        int size1;
        int size2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size arr1:");
            size1 = scanner.nextInt();
        } while (size1 < 0);

        int[] arr1 = new int[size1];

        for (int i=0;i<arr1.length;i++){
            System.out.print("phần tử"+i+":");
            arr1[i] = scanner.nextInt();
        }
        do {
            System.out.print("Enter a size arr2:");
            size2 = scanner.nextInt();
        } while (size2 < 0);
        int[] arr2= new int[size2];
        for (int i=0;i<arr2.length;i++){
            System.out.print("phần tử"+i+":");
            arr2[i] = scanner.nextInt();
        }
       int size3= size1+size2;
        int[] arr3= new int[size3];
        for (int i=0;i<arr3.length;i++){
            if (i<size1) {
                arr3[i]=arr1[i];
            } else {
                arr3[i]=arr2[i-size2];
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
