/**
 * @author Anthony Gargiulo
 * @version 0.1
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

public class Problem9
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int upperBound = 100;
        int a = 2;
        int b = 1;
        while (true)
        {
            double c = Math.sqrt(a * a + b * b);
            if (c != (int) c)
            {
                b++;
                if (b + 1 == a)
                {
                    continue;
                } else
                {
                    b = 1;
                    a++;
                    if (a == upperBound)
                    {
                        break;
                    }
                }
            } else
            {
                System.out.println(String.format("a: %s | b: %s | c: %s", a, b,
                        Math.sqrt(a * a + b * b)));
            }
        }
    }
}
