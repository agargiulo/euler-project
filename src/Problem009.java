/**
 * @author Anthony Gargiulo
 * @version 0.1
 *          Euler Project
 *          Problem 9
 *          ---------
 *          A Pythagorean triplet is a set of three natural numbers, a < b < c,
 *          for which,
 *          a^2 + b^2 = c^2
 *          For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *          There exists exactly one Pythagorean triplet for which a + b + c =
 *          1000.
 *          Find the product abc.
 */

public class Problem009
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        final long SUM = 1000;
        long a, b, c;
        for (long n = 3; n < 35; n += 2)
        {
            a = n;
            c = (a * a + 1)/2;
            b = c - 1;
            System.out.println("a: " + a + "\t|\tb: " + b + "\t|\tc: " + c + "\t|\tSum: " + (a+b+c));
        }
    }
}
