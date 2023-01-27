package Array.Easy;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

// https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays

public class UnionOfSortedArray {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // use sorted set
        
        SortedSet<Integer> set = new TreeSet<>();
        
        for(int i : arr1) set.add(i);
        
        for(int i : arr2) set.add(i);
         
        ArrayList<Integer> list = new ArrayList<>();
         
        for(int i : set) list.add(i);
          
        return list; 
    }


    

    public static void main(String[] args) {
        int a1[] = {2, 2, 3, 4, 5};
        int a2[] = {1, 1, 2, 3, 4};

        System.out.println(findUnion(a1, a2, a1.length, a2.length));
    }
}
