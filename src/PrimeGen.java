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
        {// 1 is never prime
            return false;
        } else if (num < 4)
        {// 2 and 3 are prime...
            return true;
        } else if (num % 2 == 0)
        {// any even number is not prime
            return false;
        } else if (num < 9)
        {// the previous tests have already dealt with 4, 6, 8
            return true;
        } else if (num % 3 == 0)
        {// any number divisible by three is clearly not prime
            return false;
        } else
        {
            /*
             * basically, this part deals with the fact that all primes over 3
             * satisfy the equation:
             * prime = 6k +/- 1
             * Also the fact that a number will not have any prime factors over
             * the square root of that number, except for itself if it is prime
             */
            // Math.sqrt(num) rounded to the greatest int, r, such that r * r <=
            // num
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
