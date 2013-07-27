
package com.agargiulo.code.projecteuler;

/**
 * File: Problem024.java
 * Date created: Jul 26, 2013
 * 
 * **SOLVED**
 * 
 * @author agargiulo
 * @version 1.0
 *          A permutation is an ordered arrangement of objects. For example,
 *          3124
 *          is one possible permutation of the digits 1, 2, 3 and 4. If all of
 *          the permutations are listed numerically or alphabetically, we call
 *          it
 *          lexicographic order. The lexicographic permutations of 0, 1 and 2
 *          are:
 * 
 *          012 021 102 120 201 210
 * 
 *          What is the millionth lexicographic permutation of the digits 0, 1,
 *          2, 3, 4, 5, 6, 7, 8 and 9?
 */

public class Problem024
{

	static long	numOfPermutations;

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

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		numOfPermutations = 0;
		String digits = "0123456789";
		getPermutations("", digits);
	}
}
