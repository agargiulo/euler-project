package com.agargiulo.code.projecteuler;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * **SOLVED**
 * 
 * @author Anthony Gargiulo
 * @version 1.0
 * 
 *          The Fibonacci sequence is defined by the recurrence relation:
 * 
 *          F(n) = F(n−1) + F(n−2), where F(1) = 1 and F(2) = 1.
 * 
 *          Hence the first 12 terms will be:
 * 
 *          F(1) = 1
 *          F(2) = 1
 *          F(3) = 2
 *          F(4) = 3
 *          F(5) = 5
 *          F(6) = 8
 *          F(7) = 13
 *          F(8) = 21
 *          F(9) = 34
 *          F(10) = 55
 *          F(11) = 89
 *          F(12) = 144
 * 
 *          The 12th term, F12, is the first term to contain three digits.
 * 
 *          What is the first term in the Fibonacci sequence to contain 1000
 *          digits?
 * 
 * 
 */
public class Problem025
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<BigInteger> fibb = new ArrayList<BigInteger>(1000);
		fibb.add(BigInteger.ONE);
		fibb.add(BigInteger.ONE);
		int index = 2;
		BigInteger curVal = BigInteger.ZERO;
		String curValStr = "";
		do
		{
			curVal = fibb.get(index - 1).add(fibb.get(index - 2));
			fibb.add(curVal);
			curValStr = curVal.toString();
			index++;
		} while (curValStr.length() < 1000);
		System.out.println(index);
	}

}
