package Array.Easy;

// https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
public class SecondLargest {

    static int print2largest(int arr[], int n) {
        int large = 0, secLarge = 0;

        for (int x : arr) {
            if (large < x) {
                
               secLarge = large;

               large = x;
            }
            else if (secLarge < x && x != large) {
                secLarge = x;
            }
                
            
        }
        return secLarge;
    }

    public static void main(String[] args) {
        int []a = {12, 35, 1, 10, 34, 1};

        System.out.println(print2largest(a, a.length));
    }
}
