package basic_math;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        int t = x;
        int sum = 0;
        while (x > 0) {
            int rem = x%10;

            sum = (sum * 10) + rem;

            x = x/10;
        }

        System.out.println(sum==t);
    }
}
