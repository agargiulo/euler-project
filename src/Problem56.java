import java.math.BigInteger;

/**
 * @author Anthony Gargiulo
 * @version 0.1
 *          Euler Project
 *          Problem 56
 *          ---------
 *          A googol (10^100) is a massive number: one followed by one-hundred
 *          zeros; 100^100 is almost unimaginably large: one followed by
 *          two-hundred zeros. Despite their size, the sum of the digits in each
 *          number is only 1.
 *          Considering natural numbers of the form, a^b, where a, b < 100, what
 *          is the maximum digital sum?
 */

public class Problem56
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        BigInteger number;
        BigInteger maxSum = BigInteger.ZERO;
        for (int a = 1; a < 100; a++)
        {
            for (int b = 1; b < 100; b++)
            {
                number = BigInteger.valueOf(a).pow(b);
                maxSum = maxSum.max(sumDigits(number));
                // System.out.println(String.format("%s^%s = %s", a, b,
                // number));
            }
        }
        System.out.println("Max sum is: " + maxSum);
    }

    /**
     * @param number
     * @return the sum of the digits of the given BigInteger
     */
    private static BigInteger sumDigits(BigInteger number)
    {
        BigInteger sum = BigInteger.ZERO;
        for (char c : number.toString().toCharArray())
        {
            sum = sum.add(BigInteger.valueOf(c - '0'));
        }
        return sum;
    }

}