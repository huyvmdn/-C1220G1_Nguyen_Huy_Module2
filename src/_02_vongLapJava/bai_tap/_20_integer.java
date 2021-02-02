package _02_vongLapJava.bai_tap;

import java.util.Scanner;

public class _20_integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        int count = 0;
        int n=2;
        while (count<number) {
            boolean check = true;
            for (byte i=2; i<n;i++){
                if (n%i==0){
                    check = false;
                    break;
                }
            }if (check ) {
                System.out.println(n);
                count++;
            }
            n++;
        }

        }
    }

