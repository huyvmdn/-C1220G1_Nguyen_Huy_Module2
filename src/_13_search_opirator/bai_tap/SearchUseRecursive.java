package _13_search_opirator.bai_tap;

import java.util.*;

public class SearchUseRecursive {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Key number: ");
        int number = sc.nextInt();
        System.out.println(Search(numbers, 0, numbers.length - 1, number));
    }
    public static int Search(int[] array,int start, int end,int key) {
        if (end>=start) {
            int mid= (start +end)/2;
            if (key==array[mid]) {
                return mid;
            } else if(key>array[mid]) {
                return Search(array,mid+1, end,key);
            } else {
                return Search(array,start,mid-1,key);
            }
        }
        return -1;
    }
}
