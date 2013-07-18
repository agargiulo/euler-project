package com.agargiulo.code.projecteuler;
/**
 * **SOLVED**
 * 
 * @author Anthony Gargiulo
 * @version 1.0
 *          Euler Project
 *          Problem 9
 *          ---------
 *          A Pythagorean triplet is a set of three natural numbers, a < b < c,
 *          for which,
 *          a^2 + b^2 = c^2
 *          For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 *          There exists exactly one Pythagorean triplet for which a + b + c =
 *          1000.
 *          Find the product abc.
 */

public class Problem009
{

	/**
	 * @param args
	 */
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
					System.out.println("a: " + a + " b: " + b + " c: " + c);
					System.out.println("a*b*c: " + a * b * c);

				}
			}
		}

	}
}
