package _14_sort_algorithm.exercises;

public class InsertionSort {


    void insertionSort(int arrayInt[]) {
        int size = arrayInt.length;
        for (int i = 1; i < size; ++i) {
            int key = arrayInt[i];
            int j = i - 1;

            while (j >= 0 && arrayInt[j] > key) {
                arrayInt[j + 1] = arrayInt[j];
                j = j - 1;
            }
            arrayInt[j + 1] = key;
        }
    }

    static void printArray(int arrayInt[]) {
        int size = arrayInt.length;
        for (int i = 0; i < size; ++i)
            System.out.print(arrayInt[i] + " ");

        System.out.println();
    }

    public static void main(String args[]) {
        int arrayInt[] = { 5,4,3,2,1 };
        System.out.println("Mảng ban đầu:");
        printArray(arrayInt);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arrayInt);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arrayInt);
    }
}
