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
        BigInteger num = BigInteger.valueOf(100L);
        for (int i = 99; i >= 1; i--)
        {
            num = num.multiply(BigInteger.valueOf(i));
        }
        String numStr = num.toString();
        long sum = 0;
        for (int i = 0; i < numStr.length(); i++)
        {
            sum += Integer.parseInt(numStr.substring(i, i + 1));
        }
        System.out.println(sum);
    }
}
