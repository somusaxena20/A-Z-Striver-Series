package pattern_problem;

public class Pattern15 {

    // https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285196/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_15

    // A B C D E
    // A B C D
    // A B C
    // A B
    // A

    public static void main(String[] args) {
        
        int n = 3;

        
        
        for (int i = 1; i <= n; i++) {
            int t = 65;
            for (int j = n; j >=i ; j--) {
                System.out.print((char)(t++));
            }
            System.out.println();
        }
    }
}