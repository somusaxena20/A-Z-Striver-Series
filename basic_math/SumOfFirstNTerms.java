package basic_math;

public class SumOfFirstNTerms {

    static long sumOfSeries(long n) {
        long sum = n*(n+1)/2;
        return sum*sum;
    }

    public static void main(String[] args) {
        long n = 7;

        System.out.println(sumOfSeries(n));
    }
}
