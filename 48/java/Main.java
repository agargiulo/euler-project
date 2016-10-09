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
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= 1000; i++)
        {
            number = BigInteger.valueOf(i);
            sum = sum.add(number.pow(i));
        }
        String sumStr = sum.toString();
        System.out.println(sumStr.substring(sumStr.length() - 10));
    }
}
