package Array.Easy;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=check-if-an-array-is-sorted
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/#:~:text=Input%3A%20nums%20%3D%20%5B2%2C,no%20rotation)%20to%20make%20nums.

public class CheckArrayIsSorted {

    // GFG Solution
    static boolean arraySortedOrNot(int[] a, int n) {
        
        for (int i = 1; i < a.length; i++) {
            if (a[i-1] > a[i]) {
                return false;
            }
        }

        return true;
    }

    // LeetCode Solution

    // you can only allowed one unsorted order to indegate that was the rotated point if you find more then one then simply return false
    public static boolean check(int[] a) {

        int inRegular = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[(i+1)%a.length]) {
                inRegular+=1;
            }
        }
        return inRegular > 1 ? false : true;
    }

    public static void main(String[] args) {
        int []a = {7,9,1,1,1,3};
        System.out.println(check(a));        
    }
}
