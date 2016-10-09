/**
 * **SOLVED**
 * @author Anthony Gargiulo
 * @version 1.0
 */

public class Main
{

	public static void main(String[] args)
	{
		int squareSum = 0; // the sum of the squares
		int sumSquare = 0; // the square of the sum
		for (int i = 1; i <= 100; i++)
		{
			squareSum += i * i;
			sumSquare += i;
		}
		int difference = sumSquare * sumSquare - squareSum;
		System.out.println(difference);
	}

}
