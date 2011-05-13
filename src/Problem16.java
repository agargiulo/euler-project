import java.math.BigInteger;

/**
 * @author Anthony Gargiulo
 * @version 1.0
 *          Euler Project
 *          Problem 16
 *          ---------
 *          2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *          What is the sum of the digits of the number 2^1000?
 */

public class Problem16
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        BigInteger largeNumber = BigInteger.valueOf(2l);
        largeNumber = largeNumber.pow(1000);
        String num = largeNumber.toString();
        long sum = 0;
        for (int i = 0; i < num.length(); i++)
        {
            sum += Integer.parseInt(num.substring(i, i + 1));
        }
        System.out.println(sum);
    }

}
