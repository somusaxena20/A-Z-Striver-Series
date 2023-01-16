package pattern_problem;

public class Pattern1 {

    // https://practice.geeksforgeeks.org/problems/square-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_1

    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *

    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}