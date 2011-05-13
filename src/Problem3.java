import java.util.ArrayList;

/**
 * @author Anthony Gargiulo
 * @version 1.5
 *          Euler Project
 *          Problem 3
 *          ---------
 *          The prime factors of 13195 are 5, 7, 13 and 29.
 *          What is the largest prime factor of the number 600851475143 ?
 */

public class Problem3
{

    /**
     * @param args
     */
    public static void main(String args[])
    {
        long compNum = 600851475143l;
        ArrayList<Long> factors = getFactors(compNum);
        int offset = 1;
        long max = factors.get(factors.size() - offset);
        while (!PrimeGen.isPrime(max))
        {
            offset++;
            max = factors.get(factors.size() - offset);
        }
        System.out.println(max);
    }

    /**
     * @param number
     * @return the list of factors
     */
    private static ArrayList<Long> getFactors(long number)
    {
        ArrayList<Long> factors = new ArrayList<Long>(
                (int) Math.sqrt(number) / 2);
        for (long f = 1; f < Math.sqrt(number); f++)
        {
            if (number % f == 0)
            {
                factors.add(f);
            }
        }
        return factors;
    }
}
