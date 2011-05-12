import java.util.ArrayList;

/**
 * @author Anthony Gargiulo
 * @version 1.0
 *          Euler Project
 *          Problem 7
 *          ---------
 *          By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we
 *          can see that the 6th prime is 13.
 *          What is the 10001st prime number?
 */

public class Problem7
{

    /**
     * 
     */
    private static final ArrayList<Long> primes = new ArrayList<Long>(10001);

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        long currentPrime = 2;
        primes.add(currentPrime);
        while (primes.size() != 10001)
        {
            currentPrime = getNextPrime(currentPrime);
            primes.add(currentPrime);
        }
        System.out.println("The 10001st prime is: " + currentPrime);
    }

    /**
     * @param number
     * @return the list of factors
     */
    private static ArrayList<Long> getFactors(long number)
    {
        ArrayList<Long> factors = new ArrayList<Long>(
                (int) Math.sqrt(number) / 2);
        for (long f = 1; f <= Math.sqrt(number); f++)
        {
            if (number % f == 0)
            {
                factors.add(f);
            }
        }
        ArrayList<Long> factors2 = new ArrayList<Long>();
        for (long l : factors)
        {
            factors2.add(number / l);
        }
        factors.addAll(factors2);
        // System.out.println(number + ": " + factors);
        return factors;
    }

    /**
     * @param currentPrime
     * @return the next prime, after <code>currentPrime</code>
     */
    private static long getNextPrime(long currentPrime)
    {
        long nextPrime = currentPrime + 1;
        while (!isPrime(nextPrime))
        {
            nextPrime++;
        }
        return nextPrime;
    }

    /**
     * @param number
     * @return true if the number is prime or false if it is not
     */
    private static boolean isPrime(long number)
    {
        return getFactors(number).size() <= 2;
    }
}
