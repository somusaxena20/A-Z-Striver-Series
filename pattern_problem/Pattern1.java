package pattern_problem;

public class Pattern1 {

    // https://practice.geeksforgeeks.org/problems/square-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_1

    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *

    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}