package _03_array_method.bai_tap;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.print("cot muon tinh tong:");
        int x = scanner.nextInt();
        int sum=0;
        for (byte i=0;i<arr.length;i++){
            for (byte j=0;j<arr[i].length;j++){
                if (j==x){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("tong cot "+x+"la "+sum);
    }
}
