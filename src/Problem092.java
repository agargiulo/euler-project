import java.util.HashMap;
import java.util.TreeSet;

/**
 * File: Problem092.java
 * Date created: Apr 7, 2012
 */

/**
 * **SOLVED**
 * 
 * @author Anthony Gargiulo
 * @version 1.0
 * 
 *          A number chain is created by continuously adding the square of the
 *          digits in a number to form a new number until it has been seen
 *          before.
 * 
 *          For example,
 * 
 *          44 -> 32 -> 13 -> 10 -> 1 -> 1
 *          85 -> 89 -> 145 -> 42 -> 20 -> 4 -> 16 -> 37 -> 58 -> 89
 * 
 *          Therefore any chain that arrives at 1 or 89 will become stuck in an
 *          endless loop. What is most amazing is that EVERY starting number
 *          will eventually arrive at 1 or 89.
 * 
 *          How many starting numbers below ten million will arrive at 89?
 * 
 * 
 */
public class Problem092
{

	private static HashMap<Long, Long>	nextNums;

	private static long getNextInChain(long currentNum)
	{
		long nextNum = 0;
		int digit;
		if (nextNums.containsKey(currentNum))
		{
			nextNum = nextNums.get(currentNum);
		} else
		{
			long num = currentNum;
			while (num >= 10)
			{
				digit = (int) (num % 10);
				num /= 10;
				nextNum += digit * digit;
			}
			nextNum += num * num;
			nextNums.put(currentNum, nextNum);
		}
		return nextNum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// How many times has something ended in 89
		int numberOf89s = 0;

		// Use this later to speed things up.
		nextNums = new HashMap<Long, Long>();

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
		System.out.println("There are " + numberOf89s
				+ " chains that end in 89 that start below 10 Million");
	}
}
