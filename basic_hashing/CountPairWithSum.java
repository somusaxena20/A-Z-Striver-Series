package basic_hashing;

import java.util.HashMap;

// https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1?page=1&category[]=Hash&sortBy=submissions

public class CountPairWithSum {

    // BRUTE FORCE SOLUTION 
    // T.C. : (n*n)

    // static int getPairsCount(int[] a, int n, int k) {
    //     int count = 0;

    //     for (int i = 0; i < a.length-1; i++) {
    //         for (int j = i+1; j < a.length; j++) {
    //             if (a[i]+a[j] == k) {
    //                 count++;            
    //             }
    //         }
    //     }
        
    //     return count;
    // }

    // OPTIMIZED SOLUTION

    static int getPairsCount(int []a, int n, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            
            if (map.containsKey(k - a[i])) {
                count += map.get(k - a[i]);
            }

            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i])+1);
            }
            else{
                map.put(a[i], 1);
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int []a = {1, 5, 7, 1};
        System.out.println(getPairsCount(a, 4, 6));
    }    
}
