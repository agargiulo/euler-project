package com.agargiulo.code.projecteuler;
import java.util.ArrayList;

/**
 * File: Problem368.java
 * Date created: Jan 24, 2012
 * 
 * @author Anthony Gargiulo
 */

/**
 * @author Anthony Gargiulo
 * @version 0.1
 *          Euler Project
 *          Problem 368
 *          -----------
 *          The harmonic series 1 + 1/2 + 1/3 + 1/4 + ... is well known to be
 *          divergent.
 * 
 *          If we however omit from this series every term where the denominator
 *          has a 9 in it, the series remarkably enough converges to
 *          approximately 22.9206766193.
 *          This modified harmonic series is called the Kempner series.
 * 
 *          Let us now consider another modified harmonic series by omitting
 *          from the harmonic series every term where the denominator has 3 or
 *          more equal consecutive digits. One can verify that out of the first
 *          1200 terms of the harmonic series, only 20 terms will be omitted.
 *          These 20 omitted terms are:
 *          1/111 , 1/222 , 1/333 , 1/444 , 1/555 , 1/666 , 1/777 , 1/888 ,
 *          1/999 , 1/1000 , 1/1110 , 1/1111 , 1/1112 , 1/1113 , 1/1114 , 1/1115
 *          , 1/1116 , 1/1117 , 1/1118 and 1/1119 .
 *          This series converges as well.
 * 
 *          Find the value the series converges to.
 *          Give your answer rounded to 10 digits behind the decimal point.
 * 
 */
public class Problem368
{

	private static boolean isBadNumber(int num)
	{
		boolean badNumber = false;
		String numStr = num + "";
		if (numStr.contains("9"))
		{
			badNumber = true;
		} else if (num >= 100 && num < 1000)
		{
			if (num % 111 == 0)
			{
				badNumber = true;
			}
		} else if (num >= 1000 && num < 10000)
		{
			if (isBadNumber(num - 1000))
			{
				badNumber = true;
			} else
			{
				System.err.println("Recursing");
				badNumber = isBadNumber(num / 10);
			}

		}
		return badNumber;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		ArrayList<Integer> denoms = new ArrayList<Integer>(10000000);
		double sum = 0;
		for (int i = 1; i <= 10000000; i++)
		{
			denoms.add(i);
			System.err.println("Added " + i + " to the list");
		}
		for (int num = denoms.size() - 1; num >= 0; num--)
		{
			if (isBadNumber(num))
			{
				// System.out.print(num + " | ");
				denoms.remove(num);
			}

		}
		System.out.println("");
		for (int num : denoms)
		{
			sum += 1.0 / num;
		}
		System.out.println("The sum is: " + sum);

	}

}
