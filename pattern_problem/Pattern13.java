package pattern_problem;

public class Pattern13 {

    // https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718712/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_13

    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    // 11 12 13 14 15

    public static void main(String[] args) {
        
        int n = 5;

        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count+++" ");
            }
            System.out.println();
        }
        
    }
}