package _03_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
        } while (size < 0);
        int[] arr = new int[size];
        int[] arr2= new int[size+1];
        for (int i=0;i<arr.length;i++){
            System.out.print("phần tử"+i+":");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter X:");
        int x = scanner.nextInt();
        System.out.print("Enter index X:");
        int index = scanner.nextInt();
        if (index<=1 && index>=arr.length-1){
            System.out.println("không chèn được phần tử vào mảng.");
        }else {
            for (byte i=0;i<arr2.length;i++){
                if (i<index){
                    arr2[i]=arr[i];
                }else if (i==index){
                    arr2[i]=x;
                }else if (i>index){
                    arr2[i]=arr[i-1];
                }
            }
        }

        System.out.println(Arrays.toString(arr2));
    }
}
