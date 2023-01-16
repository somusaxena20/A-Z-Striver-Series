package pattern_problem;

public class Pattern16 {

    // https://practice.geeksforgeeks.org/problems/triangle-pattern-1662285334/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_16

    // A
    // B B
    // C C C
    // D D D D
    // E E E E E

    public static void main(String[] args) {
        
        int n = 5;

        
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(65+i-1));
            }
            System.out.println();
        }
    }
}