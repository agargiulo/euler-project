/**
 * @author Anthony Gargiulo
 * @version 1
 *          Euler Project
 *          Problem 5
 *          ---------
 *          2520 is the smallest number that can be divided by each of the
 *          numbers from
 *          1 to 10 without any remainder.
 *          What is the smallest positive number that is evenly divisible by all
 *          of the
 *          numbers from 1 to 20?
 */

public class Problem005
{

    /**
     * @param args
     */
    public static void main(String args[])
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
