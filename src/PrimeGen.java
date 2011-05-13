/**
 * @author Anthony Gargiulo
 * @version 0.1
 *          Euler Project
 *          PrimeGen.java
 *          ---------
 *          Used to find prime numbers. This will have various methods for
 *          finding primes given different situations
 */

public class PrimeGen
{
    /**
     * @param currentPrime
     * @return the next prime, after <code>currentPrime</code>
     */
    public static long getNextPrime(long currentPrime)
    {
        long nextPrime = currentPrime + 1;
        while (!isPrime(nextPrime))
        {
            nextPrime++;
        }
        return nextPrime;
    }

    /**
     * @param num
     *            the number to check
     * @return true if the number is prime, false if it is composite
     */
    public static boolean isPrime(Long num)
    {
        if (num <= 1)
        {
            return false;
        } else if (num < 4)
        {
            return true;
        } else if (num % 2 == 0)
        {
            return false;
        } else if (num < 9)
        {
            return true;
        } else if (num % 3 == 0)
        {
            return false;
        } else
        {
            int r = (int) Math.floor(Math.sqrt(num));
            int f = 5;
            while (f <= r)
            {
                if (num % f == 0)
                {
                    return false;
                } else if (num % (f + 2) == 0) { return false; }
                f += 6;
            }
            return true;
        }
    }
}
