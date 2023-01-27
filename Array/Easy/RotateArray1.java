package Array.Easy;

import java.util.Arrays;

public class RotateArray1 {
    static void leftRotate(int[] arr, int n, int d) {
        d = d % arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, arr.length - 1 - d);
        reverse(arr, arr.length - d, arr.length-1);
    }

    static void reverse(int []a, int l, int h)
    {
        while (l < h) {

            int t = a[l];
            a[l] = a[h];
            a[h] = t;
            l++;
            h--;
        }
    }

    public static void main(String[] args) {
        int []a = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(a, a.length, 2);

        System.out.println(Arrays.toString(a));
    }
}
