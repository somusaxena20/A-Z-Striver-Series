package basic_recursion;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-first-n-fibonacci-numbers
public class FibbonachiSeries {

    // Iterative
    public static long[] printFibb(int n) 
    {
        long []l = new long[n];

        long a = 1;
        long b = 1;

        l[0] = 1;
        l[1] = 1;
        for (int i = 2; i < n; i++) {
            long c = a+b;
            a = b;
            b = c;
            l[i] = c;
        }

        return l;
    }

   

    public static void main(String[] args) {
       System.out.println(Arrays.toString(printFibb(7))); 
    }
}
