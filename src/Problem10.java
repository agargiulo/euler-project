import java.util.ArrayList;

/**
 * @author Anthony Gargiulo
 * @version 0.1
 *          Euler Project
 *          Problem 10
 *          ---------
 *          The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *          Find the sum of all the primes below two million.
 */

public class Problem10
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        ArrayList<Long> primes = new ArrayList<Long>();
        primes.add(2l);
        long curPrime = Problem7.getNextPrime(2l);
        while (curPrime < 2000000l)
        {
            primes.add(curPrime);
            curPrime = Problem7.getNextPrime(curPrime);
        }
        long sum = 0;
        for (long l : primes)
        {
            sum += l;
        }
        System.out.println(sum);
    }
}
