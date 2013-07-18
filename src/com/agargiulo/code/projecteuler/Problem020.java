package com.agargiulo.code.projecteuler;
import java.math.BigInteger;

/**
 * **SOLVED**
 * @author Anthony Gargiulo
 * @version 1.0
 *          Euler Project
 *          Problem 20
 *          ---------
 *          n! means n × (n − 1) × ... × 3 × 2 × 1
 *          For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 *          and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0
 *          + 0 = 27.
 *          Find the sum of the digits in the number 100!
 */

public class Problem020
{

    /**
     * @param args
     */
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
