package sorting;

import java.util.Arrays;

public class MergeSort {

    static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k++] = arr[i++];
        }

        while (j < e) {
            mix[k++] = arr[j++];
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
    static void mergeSort(int arr[], int l, int r)
    {
        if (r-l == 1) {
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid, r);
        merge(arr, l, mid, r);
    }
    public static void main(String[] args) {
        int []a = {10,9,8,7,6,5,4,3,2,1};

        mergeSort(a,0,a.length);

        System.out.println(Arrays.toString(a));
    }
}
