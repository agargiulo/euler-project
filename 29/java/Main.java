import java.math.BigInteger;
import java.util.TreeSet;

/**
 * **SOLVED**
 * 
 * @author Anthony Gargiulo
 * @version 1.0
 */

public class Main
{
	public static void main(String[] args)
	{
		BigInteger num;
		TreeSet<BigInteger> nums = new TreeSet<BigInteger>();
		int a, b;
		a = b = 2;
		for (; a <= 100; a++)
		{
			for (b = 2; b <= 100; b++)
			{
				num = BigInteger.valueOf(a);
				num = num.pow(b);
				nums.add(num);
			}
		}
		System.out.println(nums.size());
	}
}
