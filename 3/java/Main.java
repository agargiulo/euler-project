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
