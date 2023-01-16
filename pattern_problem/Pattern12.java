package pattern_problem;

public class Pattern12 {

    // https://practice.geeksforgeeks.org/problems/double-triangle-pattern-1662664259/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_12

    // 1                 1
    // 1 2             2 1
    // 1 2 3         3 2 1
    // 1 2 3 4     4 3 2 1
    // 1 2 3 4 5 5 4 3 2 1

    public static void main(String[] args) {
        
        int n = 5;

        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(j+" ");
            }

            for(int j = 1; j<=(2*n)-2*i; j++)
            {
                System.out.print("  ");
            }

            for(int j = i; j>=1; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }
        
    }
}