package pattern_problem;

public class Pattern4 {

    // https://practice.geeksforgeeks.org/problems/triangle-number-1661428795/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_4

    // 1
    // 1 2
    // 1 2 3 
    // 1 2 3 4
    // 1 2 3 4 5

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}