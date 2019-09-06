// The Fibonacci numbers are the numbers in the following integer sequence (Fn):

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

// such as

// F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.

// Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying

// F(n) * F(n+1) = prod.

// Your function productFib takes an integer (prod) and returns an array:

// [F(n), F(n+1), true] or {F(n), F(n+1), 1} or (F(n), F(n+1), True)
// depending on the language if F(n) * F(n+1) = prod.

// If you don't find two consecutive F(m) verifying F(m) * F(m+1) = prodyou will return

// [F(m), F(m+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
// F(m) being the smallest one such as F(m) * F(m+1) > prod.

// Examples
// productFib(714) # should return {21, 34, 1}, 
//                 # since F(8) = 21, F(9) = 34 and 714 = 21 * 34

// productFib(800) # should return {34, 55, 0}, 
//                 # since F(8) = 21, F(9) = 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55
// Notes: Not useful here but we can tell how to choose the number n up to which to go: we can use the "golden ratio" phi which is (1 + sqrt(5))/2 knowing that F(n) is asymptotic to: phi^n / sqrt(5). That gives a possible upper bound to n.

// You can see examples in "Example test".

// References
// http://en.wikipedia.org/wiki/Fibonacci_number

// http://oeis.org/A000045




import java.util.Arrays;

public class ProdFib {

    public static long[] productFib(long prod) {
        for (long i = 0; i <= (1 + (Math.sqrt(prod) / 2)); i++) {
            if (f(i) * f(i + 1) == prod) {
                return new long[] { f(i), f(i + 1), 1L };
            }

            if (f(i) * f(i + 1) > prod) {
                return new long[] { f(i), f(i + 1), 0L };
            }
        }
        return new long[] {};
    }

    public static long f(long x) {
        if (x == 0)
            return 0;
        else if (x == 1)
            return 1;
        else
            return f(x - 1) + f(x - 2);
    }

    public static void main(String[] args) {
        long started = System.currentTimeMillis();
        // System.out.println(System.currentTimeMillis());
        System.out.println(Arrays.toString(productFib(5895)));
        long completed = System.currentTimeMillis();
        System.out.println(completed - started);
        // System.out.println(System.currentTimeMillis());
    }
}