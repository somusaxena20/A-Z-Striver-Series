package basic_hashing;

public class HappyNumber {
    public static boolean isHappy(int n) {
        int sum = 0;

        while (sum != 1) {
            sum = digitSum(n);

            if (sum == 1) {
                return true;
            }

            if (sum < 10) {
                return false;
            }
            n = sum;
        }

        return true;
    }

    static int digitSum(int n)
    {
        int sum = 0;

        while (n > 0) {
            int x = n % 10;

            sum += Math.pow(x, 2);

            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 2;

        System.out.println(isHappy(n));
    }
}