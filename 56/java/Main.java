import java.math.BigInteger;

/**
 * **SOLVED**
 * @author Anthony Gargiulo
 * @version 1.0
 */

public class Main
{
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
        System.out.println(maxSum);
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
