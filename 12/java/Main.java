import java.util.TreeSet;

/**
 * **SOLVED**
 * @author Anthony Gargiulo
 * @version 1.0
 */

public class Main
{
    /**
     * the current triangle number
     */
    static long curTriNum   = 0;

    /**
     * 
     */
    static long triNumIndex = 1;

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        TreeSet<Long> factors;
        do
        {
            getNextTriNum();
            factors = getFactors(curTriNum);

        } while (factors.size() <= 500);
        System.out.println(curTriNum);

    }

    /**
     * @param number
     * @return the list of factors
     */
    private static TreeSet<Long> getFactors(long number)
    {
        TreeSet<Long> factors = new TreeSet<Long>();
        for (long f = 1; f <= Math.sqrt(number); f++)
        {
            if (number % f == 0)
            {
                factors.add(f);
            }
        }
        TreeSet<Long> factors2 = new TreeSet<Long>();
        for (long l : factors)
        {
            factors2.add(number / l);
        }
        factors.addAll(factors2);
        return factors;
    }

    /**
     * 
     */
    private static void getNextTriNum()
    {
        curTriNum += triNumIndex;
        triNumIndex++;

    }

}
