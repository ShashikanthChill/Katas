import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class GapInPrimes {

    public static long[] gap(int g, long m, long n) {

        List<Long> primes = new ArrayList<>();

        for (long i = m; i <= n; i++) {
            if (isPrime(i))
                primes.add(i);
        }

        if (!(primes.size() > 1))
            return null;
        else {
            for (int i = 1; i < primes.size(); i++) {
                if (primes.get(i) - primes.get(i - 1) == g)
                    return new long[] { primes.get(i - 1), primes.get(i) };
            }
        }
        return null;
    }

    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(gap(2, 100, 110)));
    }
}