package pattern_problem;

public class Pattern5 {

    // https://practice.geeksforgeeks.org/problems/triangle-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_5

    // * * * * *
    // * * * *
    // * * * 
    // * * 
    // *

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}