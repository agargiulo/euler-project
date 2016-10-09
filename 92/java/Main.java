import java.util.TreeSet;
/**
 * **SOLVED**
 * 
 * @author Anthony Gargiulo
 * @version 1.0
 */

public class Main
{
	private static long getNextInChain(long currentNum)
	{
		long nextNum = 0;
		int digit;
		long num = currentNum;
		while (num >= 10)
		{
			digit = (int) (num % 10);
			num /= 10;
			nextNum += digit * digit;
		}
		nextNum += num * num;
		return nextNum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// How many times has something ended in 89
		int numberOf89s = 0;

		TreeSet<Long> prevNums;
		long currentNum;

		for (long i = 2; i < 10000000; i++)
		{
			prevNums = new TreeSet<Long>();
			// Start out with the current number
			currentNum = i;
			while (!prevNums.contains(currentNum))
			{
				prevNums.add(currentNum);
				currentNum = getNextInChain(currentNum);
			}
			if (currentNum == 89 || prevNums.contains(89L))
			{
				numberOf89s++;
			}
		}
		System.out.println(numberOf89s);
	}

}
