package pattern_problem;

public class Pattern17 {

    // https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285911/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_17

    //        A
    //      A B A
    //    A B C B A 
    //  A B C D C B A  

    public static void main(String[] args) {
        
        int n = 4;

        for (int i = 1; i <= n; i++) {
            
            for(int j = 1; j<=n-i; j++)
            {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print((char)(65+j-1));
            }

            for (int j = i-1; j >= 1; j--) {
                System.out.print((char)(65+j-1));
            }

            System.out.println();

        }


    }
}