import java.util.ArrayList;

/**
 * **SOLVED**
 * @author Anthony Gargiulo
 * @version 1.5
 */

public class Main
{

  public static void main(String[] args)
  {
        ArrayList<Long> primes = new ArrayList<Long>();
        primes.add(2l);
        long curPrime = PrimeGen.getNextPrime(2l);
        while (curPrime < 2000000l)
        {
            primes.add(curPrime);
            curPrime = PrimeGen.getNextPrime(curPrime);
        }
        long sum = 0;
        for (long l : primes)
        {
            sum += l;
        }
        System.out.println(sum);
  }

}
