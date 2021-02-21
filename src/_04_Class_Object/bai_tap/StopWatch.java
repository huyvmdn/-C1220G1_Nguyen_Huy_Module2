package _04_Class_Object.bai_tap;

import java.util.Scanner;

public class StopWatch {

    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;


    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }


    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }


    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }

    public void getSort() {

        this.start();
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.floor((Math.random() * 100000));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        this.stop();
        long time = this.getElapsedTime();
        System.out.println("Time :" + time);
    }
}

class Watch {
    public static void main(String[] args) {
        StopWatch Wa = new StopWatch();
        long t1;
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Start time");
        System.out.println("2. Stop time");
        System.out.println("3. Elapsed Time");
        System.out.println("4. Sort");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        do {
            choice = input.nextByte();
            switch (choice) {
                case 1:
                    Wa.start();
                    break;
                case 2:
                    Wa.stop();
                    break;
                case 3:
                    t1 = Wa.getElapsedTime();
                    System.out.println(t1 + "milisecond");
                    break;
                case 4:
                    Wa.getSort();
                    break;
                case 0:
                    System.out.println("bye");
                    break;
            }
        } while (choice != 0);

    }
}



