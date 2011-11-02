/**
 * **SOLVED**
 * @author Anthony Gargiulo
 * @version 1.0
 *		  Euler Project
 *		  Problem 6
 *		  ---------
 *		  The sum of the squares of the first ten natural numbers is,
 *		  12 + 22 + ... + 102 = 385
 *		  The square of the sum of the first ten natural numbers is,
 *		  (1 + 2 + ... + 10)2 = 552 = 3025
 *		  Hence the difference between the sum of the squares of the first ten
 *		  natural numbers and the square of the sum is 3025 . 385 = 2640.
 *		  Find the difference between the sum of the squares of the first one
 *		  hundred
 *		  natural numbers and the square of the sum.
 */

public class Problem006
{

	/**
	 * @param args
	 */
	public static void main(String args[])
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
