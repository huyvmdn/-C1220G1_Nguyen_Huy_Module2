package _14_sort_algorithm.exercises;

public class illustrationInsertionSort {
    void insertionSort(int arrayInt[]) {
        int size = arrayInt.length;
        for (int i = 1; i < size; ++i) {
            // đặt key tại vị trí i.
            int key = arrayInt[i];
            int j = i - 1;

// duyệt j=i-1 so với key( là phần tử thứ i) về đầu mảng. Nếu key > phần  tử thứ i thì bỏ qua vòng lặp ngược lại duyệt tới đầu hoặc phần tử >key.
            while (j >= 0 && arrayInt[j] > key) {
                //đẩy các phần tử >key lên 1
                arrayInt[j + 1] = arrayInt[j];
                // thiết lập lại i
                j = j - 1;
            }
            //kết thúc vòng lặp thì j -1 nên phải cộng 1 lại để thêm phần tử chèn
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
