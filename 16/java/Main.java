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
        BigInteger largeNumber = BigInteger.valueOf(2L);
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
