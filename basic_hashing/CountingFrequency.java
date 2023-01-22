package basic_hashing;

import java.util.Arrays;

public class CountingFrequency {
    public static void frequencyCount(int arr[], int n, int p)
    {
        int []t = new int[n];

        for (int x : arr) {
            
            if (x <= n) {
                t[--x]++;
            }
        }

        for (int i = 0; i < t.length; i++) {
            arr[i] = t[i];
        }


        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int [] a= {2, 4, 5, 6, 8};

        frequencyCount(a, 5, 10);
    }
}
