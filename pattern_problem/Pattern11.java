package pattern_problem;

public class Pattern11 {

    // https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718455/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=pattern_11

    // 1 
    // 0 1
    // 1 0 1
    // 0 1 0 1
    // 1 0 1 0 1

    public static void main(String[] args) {
        
        int n = 5;

        for (int i = 1; i <= n; i++) {
            
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0) {
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
            }
            else{
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0) {
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                }
            }

            System.out.println();
        }
    }
}