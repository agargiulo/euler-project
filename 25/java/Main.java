import java.math.BigInteger;
import java.util.ArrayList;

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
		ArrayList<BigInteger> fibb = new ArrayList<BigInteger>(1000);
		fibb.add(BigInteger.ONE);
		fibb.add(BigInteger.ONE);
		int index = 2;
		BigInteger curVal = BigInteger.ZERO;
		String curValStr = "";
		do
		{
			curVal = fibb.get(index - 1).add(fibb.get(index - 2));
			fibb.add(curVal);
			curValStr = curVal.toString();
			index++;
		} while (curValStr.length() < 1000);
		System.out.println(index);
	}
}
