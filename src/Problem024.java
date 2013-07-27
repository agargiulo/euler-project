import java.util.ArrayList;
import java.util.Collections;

/**
 * File: Problem024.java
 * Date created: Jul 26, 2013
 * 
 * @author agargiulo
 */

/**
 * @version 0.5
 * @author agargiulo
 *         A permutation is an ordered arrangement of objects. For example, 3124
 *         is one possible permutation of the digits 1, 2, 3 and 4. If all of
 *         the permutations are listed numerically or alphabetically, we call it
 *         lexicographic order. The lexicographic permutations of 0, 1 and 2
 *         are:
 * 
 *         012 021 102 120 201 210
 * 
 *         What is the millionth lexicographic permutation of the digits 0, 1,
 *         2, 3, 4, 5, 6, 7, 8 and 9?
 * 
 */
public class Problem024
{

	private static ArrayList<Integer>	permutations;

	private static int arrToInt(int[] digits)
	{
		/*
		 * [1,2,3,4,5] ==> 12345
		 * 1 * 10^(arr.len -1)
		 */
		int powOfTen, ret = 0;
		for (int i = 0; i < digits.length; i++)
		{
			powOfTen = digits.length - (i + 1);
			ret += digits[i] * (int) Math.pow(10, powOfTen);
		}
		return ret;

	}

	private static void getPermutations(int[] digits, int index)
	{
		if (index == digits.length)
		{
			if (!permutations.contains(arrToInt(digits)))
			{
				permutations.add(arrToInt(digits));
			}
			return;
		}
		for (int i = index; i < digits.length; i++)
		{
			int[] permutation = digits.clone();
			permutation[index] = digits[i];
			permutation[i] = digits[index];
			getPermutations(permutation, index + 1);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		permutations = new ArrayList<Integer>(3628800);
		int[] digits =
		{0,1,2,3,4,5,6,7,8,9};
		getPermutations(digits, 0);
		Collections.sort(permutations);
		System.out.println("number of permutations: " + permutations.size());
		System.out.println(permutations);
		/*
		 * System.out
		 * .print("The millionth lexicographic permutation of 0123456789 is ");
		 * System.out.println(permutations.get(999999));
		 */
	}

}
