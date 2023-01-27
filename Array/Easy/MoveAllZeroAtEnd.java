package Array.Easy;

import java.util.Arrays;
// https://practice.geeksforgeeks.org/problems/reversal-algorithm5340/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reversal-algorithm
public class MoveAllZeroAtEnd {
    static void pushZerosToEnd(int[] a, int n) {
        int i = 0, j = 0;

        while (i < a.length) {

            if (a[i] == 0) {
                i++;
            } else {
                if (i != j) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 3, 5, 0, 0, 4, 5, 0, 9 };
        pushZerosToEnd(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
