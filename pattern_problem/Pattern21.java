package pattern_problem;

public class Pattern21 {

    // https://practice.geeksforgeeks.org/problems/square-pattern-1662287714/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_21

    //   * * * *
    //   *     *
    //   *     *
    //   * * * *    

    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n; j++) {
                
                if(j>1 && j < n && (i != 1 && i != n))
                {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}