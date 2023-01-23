package Array.Easy;

import java.util.Arrays;

public class RotateArray {

    // GFG Solution
    static void leftRotate(long a[], int k,int n)
    {
        k = k % a.length;
        
        reverse1(a,0,a.length-1);
        reverse1(a,0,a.length-1-k);
        reverse1(a,a.length-k,a.length-1);
    }

    static public void reverse1(long []a, int s, int e)
    {
        
        while(s < e)
        {
            long t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++;
            e--;
        }
    }


    // LeetCode Solution
    // https://leetcode.com/problems/rotate-array/submissions/
    public void rotate(int[] a, int k) {
        k = k % a.length;
        
        reverse(a,0,a.length-1);
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
    }
    
    public void reverse(int []a, int s, int e)
    {
        
        while(s < e)
        {
            int t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        long []a = {1, 2, 3, 4, 5, 6, 7};
        leftRotate(a, 2, a.length );
        System.out.println(Arrays.toString(a));
    }
}
