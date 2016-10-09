public class Main
{

/**
 * **SOLVED**
 * @author Anthony Gargiulo
 * @version 1.0
 */

	public static void main(String[] args)
	{
		int num = 0;
		int max = 0;
		for (int i = 999; i >= 100; i--)
		{
			for (int j = 999; j >= 100; j--)
			{
				num = i * j;
				if (("" + num).equals(reverse(num)))
				{
					max = Math.max(max, num);
				}
			}
		}
		System.out.println(max);
	}

	/**
	 * @param num
	 *			the number to reverse
	 * @return a String that is the reverse of the given number
	 */
	private static String reverse(int num)
	{
		String in = "" + num;
		String out = "";
		for (int i = in.length() - 1; i >= 0; i--)
		{
			out += in.charAt(i);
		}
		return out;
	}

}
