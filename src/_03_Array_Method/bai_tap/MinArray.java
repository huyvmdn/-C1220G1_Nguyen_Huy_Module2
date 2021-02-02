package _03_Array_Method.bai_tap;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int size;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
        } while (size < 0);
        int[] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.print("phần tử"+i+":");
            arr[i] = scanner.nextInt();
        }
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("phan tu nho nhat la: "+min);
    }
}
