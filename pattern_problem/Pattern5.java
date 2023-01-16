package pattern_problem;

public class Pattern5 {

    // https://practice.geeksforgeeks.org/problems/triangle-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_5

    // * * * * *
    // * * * *
    // * * * 
    // * * 
    // *

    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}