/**
 * @author Anthony Gargiulo
 * @version 1
 *          Euler Project
 *          Problem 4
 *          ---------
 *          A palindromic number reads the same both ways. The largest
 *          palindrome made
 *          from the product of two 2-digit numbers is 9009 = 91 ×99.
 *          Find the largest palindrome made from the product of two 3-digit
 *          numbers.
 */

public class Problem004
{

    /**
     * @param args
     */
    public static void main(String args[])
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
     *            the number to reverse
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
