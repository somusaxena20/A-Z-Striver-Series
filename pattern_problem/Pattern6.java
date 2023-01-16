package pattern_problem;

public class Pattern6 {

    // https://practice.geeksforgeeks.org/problems/triangle-number-1661489840/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_6

    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3 
    // 1 2 
    // 1

    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}