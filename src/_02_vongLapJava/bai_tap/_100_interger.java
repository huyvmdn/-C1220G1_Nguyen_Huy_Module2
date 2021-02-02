package _02_vongLapJava.bai_tap;

import java.util.Scanner;

public class _100_interger {
    public static void main(String[] args) {

            int n=2;
            while (n<100) {
                boolean check = true;
                for (byte i=2; i<n;i++){
                    if (n%i==0){
                        check = false;
                        break;
                    }
                }if (check ) {
                    System.out.println(n);

                }
                n++;
            }


    }
}
