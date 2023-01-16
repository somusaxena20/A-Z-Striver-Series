package pattern_problem;

public class Pattern14 {

    // https://practice.geeksforgeeks.org/problems/triangle-pattern-1662284916/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_14

    // A
    // A B
    // A B C
    // A B C D
    // A B C D E

    public static void main(String[] args) {
        
        int n = 5;

        
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(65+j-1));
            }
            System.out.println();
        }
    }
}