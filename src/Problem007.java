import java.util.ArrayList;

/**
 * @author Anthony Gargiulo
 * @version 1.5
 *          Euler Project
 *          Problem 7
 *          ---------
 *          By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we
 *          can see that the 6th prime is 13.
 *          What is the 10001st prime number?
 */

public class Problem007
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
            currentPrime = PrimeGen.getNextPrime(currentPrime);
            primes.add(currentPrime);
        }
        System.out.println("The 10001st prime is: " + currentPrime);
    }
}
