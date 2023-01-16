package pattern_problem;

public class Pattern20 {

    // https://practice.geeksforgeeks.org/problems/double-triangle-pattern-1662287416/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_20

    //   *                 *
    //   * *             * *
    //   * * *         * * *
    //   * * * *     * * * *
    //   * * * * * * * * * *
    //   * * * *     * * * *
    //   * * *         * * * 
    //   * *             * *
    //   *                 * 

    public static void main(String[] args) {
        
        int n = 2;

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

        for (int i = 1; i <= n-1; i++) {

            for(int j = n-1; j>=i; j--)
            {
                System.out.print("*");
            }

            for (int j = 1; j <= 2*(i); j++) {
                System.out.print(" ");
            }

            for(int j = n-1; j>=i; j--)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}