package sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insert(int a[], int i) {
        
        while (i > 0) {
            if (a[i] < a[i-1]) {
                int t = a[i-1];
                a[i-1] = a[i];
                a[i] = t;
            }
            i--;
        }
    }

   
    public static void insertionSort(int arr[], int n) {
        for (int i = 1; i < arr.length; i++) {
            insert(arr, i);
        }
    }

    public static void main(String[] args) {
        int []a = {20, 10, 30, 50, 40};

        insertionSort(a, a.length);

        System.out.println(Arrays.toString(a));
    }
}
