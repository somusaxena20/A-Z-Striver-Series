package basic_math;

// https://www.codingninjas.com/codestudio/problems/number-of-digits_9173?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems

public class CountDigit {
    public static void main(String[] args) {
        
        int x = 156;

        int count = 0;
        while (x > 0) {
            count++;
            x = x/10;
        }
        System.out.println(count);

        x = 156;

        int cn = (int)Math.log10(x)+1;
        System.out.println(cn);
    }
}
