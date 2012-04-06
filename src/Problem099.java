import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 * File: Problem099.java
 * Date created: Apr 6, 2012
 * 
 * @author Anthony Gargiulo
 */

/**
 * @author Anthony Gargiulo
 * @version 0.1
 * 
 *          Comparing two numbers written in index form like 2^11 and 3^7 is not
 *          difficult, as any calculator would confirm that 2^11 = 2048 < 3^7 =
 *          2187.
 * 
 *          However, confirming that 632382^518061 > 519432^525806 would be much
 *          more difficult, as both numbers contain over three million digits.
 * 
 *          Using base_exp.txt (right click and 'Save Link/Target As...'), a 22K
 *          text file containing one thousand lines with a base/exponent pair on
 *          each line, determine which line number has the greatest numerical
 *          value.
 * 
 *          NOTE: The first two lines in the file represent the numbers in the
 *          example given above.
 */
public class Problem099
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println("Started at: " + dateFormat.format(cal.getTime()));

		File input = new File("base_exp.txt");
		Scanner in;
		try
		{
			in = new Scanner(input);
		} catch (FileNotFoundException e)
		{
			System.err
					.println("Cannot find file \"base_exp.txt\"."
							+ "Please make sure that you placed it in the correct directory");
			return;
		}
		ArrayList<BigInteger> numbers = new ArrayList<BigInteger>();
		String line;
		int x, y;
		BigInteger tempNum, result;
		while (in.hasNext())
		{
			line = in.nextLine();
			x = Integer.parseInt(line.split(",")[0]);
			y = Integer.parseInt(line.split(",")[1]);
			System.out.println("Now working on " + x + " ^ " + y);
			tempNum = BigInteger.valueOf(x);
			result = tempNum.pow(y);
			numbers.add(result);
		}
		int largestIndex = 0; // The index/line number of the biggest result
		int index = 0;
		for (BigInteger num : numbers)
		{
			if (num.max(numbers.get(largestIndex)).equals(num))
			{
				largestIndex = index;
			}
			index++;
		}
		System.out.println(largestIndex);

		Calendar cal2 = Calendar.getInstance();
		System.out.println("Ended at: " + dateFormat.format(cal2.getTime()));

	}
}
