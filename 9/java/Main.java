/**
 * **SOLVED**
 * @author Anthony Gargiulo
 * @version 1.0
 */

public class Main
{

	public static void main(String[] args)
	{
		final int SUM = 1000;
		int a, b, c;
		for (a = 1; a < SUM / 2; a++)
		{
			for (b = a + 1; b < SUM; b++)
			{
				c = SUM - a - b;
				if (a * a + b * b == c * c)
				{
					System.out.println(a * b * c);
				}
			}
		}
	}

}
