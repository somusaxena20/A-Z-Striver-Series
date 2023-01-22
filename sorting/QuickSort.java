package sorting;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int ind = partition(arr, low, high);
            quickSort(arr, low, ind - 1);
            quickSort(arr, ind + 1, high);
        }
    }

    static int partition(int a[], int s, int e) {
        int pivot = a[s];
        int i = s, j = e; 
        while (i < j) {
            while (i < j && a[i] <= pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }

            if (i < j) {
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        int t = a[s];
        a[s] = a[j];
        a[j] = t;

        return j;
    }

    public static void main(String[] args) {
        int[] a = { 4, 1, 3, 9, 7 };

        quickSort(a, 0, a.length-1);

        System.out.println(Arrays.toString(a));
    }
}
