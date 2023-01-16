package pattern_problem;

public class Pattern19 {

    // https://practice.geeksforgeeks.org/problems/double-triangle-pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_19

    //   * * * * * * * * * *
    //   * * * *     * * * *
    //   * * *         * * *
    //   * *             * *
    //   *                 *
    //   * *             * *
    //   * * *         * * * 
    //   * * * *     * * * *
    //   * * * * * * * * * * 

    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for(int j = n; j>=i; j--)
            {
                System.out.print("*");
            }

            for (int j = 1; j <= 2*(i-1); j++) {
                System.out.print(" ");
            }

            for(int j = n; j>=i; j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= (2*n)-(2*i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }


            System.out.println();
        }


    }
}