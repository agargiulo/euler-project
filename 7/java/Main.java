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
		ArrayList<Long> primes = new ArrayList<Long>(10001);
		long currentPrime = 2;
		primes.add(currentPrime);
		while (primes.size() != 10001)
		{
			currentPrime = PrimeGen.getNextPrime(currentPrime);
			primes.add(currentPrime);
		}
		System.out.println(currentPrime);
	}

}
