package pattern_problem;

public class Pattern10 {

    // https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718013/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_10

    // * 
    // * *
    // * * *
    // * * * *
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *

    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 0; i < n+n-1; i++) {
            
            if(i < n)
            {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("* ");
                }
            }
            else{
                for (int j = 0; j < n+n-i-1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}