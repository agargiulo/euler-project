/**
 * **SOLVED**
 * @author Anthony Gargiulo
 * @version 1.0
 */

public class Main
{

	public static void main(String[] args)
	{
		int s = 20;
		while (true)
		{
			if (s % 11 == 0 && s % 12 == 0 && s % 13 == 0 && s % 14 == 0
					&& s % 15 == 0 && s % 16 == 0 && s % 17 == 0 && s % 18 == 0
					&& s % 19 == 0 && s % 20 == 0)
			{
				System.out.println(s);
				return;
			}
			s += 20;
		}
	}

}
