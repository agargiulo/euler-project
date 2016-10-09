import java.util.ArrayList;

/**
 * **SOLVED**
 * @author Anthony Gargiulo
 * @version 1.0
 */

public class Main
{
    public static void main(String[] args)
    {
        long maxChainLength = 0;
        long maxChainStart = 0;
        long chainLength = 0;
        ArrayList<Long> chain;

        for (long i = 999999; i > 0; i--)
        {
            chain = getChain(i);
            chainLength = chain.size();
            if (chainLength >= maxChainLength)
            {
                maxChainStart = i;
                maxChainLength = chainLength;
            }
        }
        System.out.println(maxChainStart);
    }

    /**
     * @param start
     * @return the length of the chain starting from <code>start</code>
     */
    private static ArrayList<Long> getChain(long start)
    {
        ArrayList<Long> chain = new ArrayList<Long>();
        chain.add(start);
        long curNum = start;
        while (curNum > 1)
        {
            curNum = getNext(curNum);
            chain.add(curNum);
        }
        return chain;
    }

    /**
     * n → n/2 (n is even)
     * n → 3n + 1 (n is odd)
     * 
     * @param curNum
     * @return the next number in the chain
     */
    private static long getNext(long curNum)
    {
        if (curNum % 2 == 0)
        {
            return curNum / 2;
        } else
        {
            return 3 * curNum + 1;
        }
    }
}
