/**
 * **SOLVED**
 *
 * @author agargiulo
 * @version 1.0
 */

public class Main
{
	static long numOfPermutations;

	private static void getPermutations(String begDigits, String endDigits)
	{
		if (endDigits.length() <= 1)
		{
			numOfPermutations++;
			if (numOfPermutations >= 1000000)
			{
				System.out.println(begDigits + endDigits);
        System.exit(0);
			}
		} else
		{
			for (int i = 0; i < endDigits.length(); i++)
			{
				String newDigits = endDigits.substring(0, i)
						+ endDigits.substring(i + 1);
				getPermutations(begDigits + endDigits.charAt(i), newDigits);
			}
		}
	}

	public static void main(String[] args)
	{
		numOfPermutations = 0;
		String digits = "0123456789";
		getPermutations("", digits);
	}
}
