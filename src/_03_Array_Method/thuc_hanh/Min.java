package _03_Array_Method.thuc_hanh;

public class Min {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int minValue(int[] array){
        int min= array[0];
        byte k=0;
        for (byte i=0;i<array.length;i++){
            if (array[i]<min) {
                min=array[i];
                k=i;
            }
        }
        return k;
    }
}
