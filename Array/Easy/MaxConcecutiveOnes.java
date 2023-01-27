package Array.Easy;


public class MaxConcecutiveOnes {

    // https://leetcode.com/problems/max-consecutive-ones/
    public static int findMaxConsecutiveOnes(int[] a) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                count++;
            }
            else{
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }

        if (maxCount < count) {
            maxCount = count;
        }

        return maxCount;
    }

    // https://practice.geeksforgeeks.org/problems/maximize-number-of-1s0905/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=maximize-number-of-1s
    static int findZeroes(int a[], int n, int m) {
        
        int p = 1;
        int count = 0;
        int maxCount = 0;
        int lastZero = 0;
        for (int i = 0; i < a.length; ) {
            
            if (a[i] == 1 || p <= m) {
                count++;
                
                if (a[i] == 0) {
                    lastZero = i;
                    p++;
                }
                i++;
            }
            else{
                if (maxCount < count) {
                    maxCount = count;
                }
                p = 1;
                count = 0;
                i = lastZero+1;
            }
            
        }

        if (maxCount < count) {
            maxCount = count;
        }

        return maxCount;
    }
    public static void main(String[] args) {
        int []a = {1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};

        System.out.println(findZeroes(a, a.length, 2));
    }   
}