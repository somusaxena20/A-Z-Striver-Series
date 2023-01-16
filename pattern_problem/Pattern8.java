package pattern_problem;

public class Pattern8 {

    // https://practice.geeksforgeeks.org/problems/triangle-pattern-1661493231/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_8

    //  * * * * * * * * *
    //    * * * * * * *
    //      * * * * *
    //        * * *
    //          *

    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 0; i < n; i++) {
            
            for(int j = n; j>n-i; j--)
            {
                System.out.print(" ");
            }

            for (int j = i; j < n+n-i-1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}