package pattern_problem;

public class Pattern9 {

    // https://practice.geeksforgeeks.org/problems/pattern/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_9

    //     *
    //    * *
    //   * * *
    //  * * * *
    // * * * * *
    // * * * * *
    //  * * * *
    //   * * *
    //    * *
    //     * 

    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}