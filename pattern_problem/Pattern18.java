package pattern_problem;

public class Pattern18 {

    // https://practice.geeksforgeeks.org/problems/triangle-pattern-1662286302/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_18

    // E
    // E D
    // E D C
    // E D C B
    // E D C B A

    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 1; i <= n; i++) {
            
           for (int j = 1; j <= i; j++) {
                System.out.print((char)(65+n-j)+" ");
           }

           System.out.println();

        }


    }
}