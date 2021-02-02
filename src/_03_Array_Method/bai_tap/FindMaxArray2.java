package _03_Array_Method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxArray2 {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size row:");
            row = scanner.nextInt();
        } while (row < 0);
        do {
            System.out.print("Enter a size colum:");
            col = scanner.nextInt();
        } while (col < 0);

        int[][] arr = new int[row][col];
        int indexI = 0;
        int indexJ = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("phần tử dòng" + i + "cột" + j + ":");
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (max< arr[i][j]){
                    max=arr[i][j];
                    indexI=i;
                    indexJ=j;
                }
            }
        }
        System.out.println("so lon nhat: "+max+". tai vi tri i="+indexI+" j= "+indexJ);
    }
}

