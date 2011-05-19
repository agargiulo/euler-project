import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Anthony Gargiulo
 * @version 0.1
 *          Euler Project
 *          Problem 22
 *          ---------
 *          Using names.txt , a 46K text file containing over five-thousand
 *          first names, begin by sorting it into alphabetical order. Then
 *          working out the alphabetical value for each name, multiply this
 *          value by its alphabetical position in the list to obtain a name
 *          score.
 *          For example, when the list is sorted into alphabetical order, COLIN,
 *          which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the
 *          list. So, COLIN would obtain a score of 938 × 53 = 49714.
 *          What is the total of all the name scores in the file?
 */

public class Problem22
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        File names = new File("names.txt");
        Scanner in;
        try
        {
            in = new Scanner(names);
        } catch (FileNotFoundException e)
        {
            System.err
                    .println("Cannot find file \"names.txt\"."
                            + "Please make sure that you placed it in the correct directory");
            return;
        }
        ArrayList<String> nameList = new ArrayList<String>(6000);
        while (in.hasNextLine())
        {
            nameList.add(in.nextLine());
        }
        long sum = 0;
        for (int i = 0; i < nameList.size(); i++)
        {
            sum += calcNameScore(nameList.get(i), i + 1);
        }
        System.out.println("Sum: " + sum);
    }

    private static long calcNameScore(String name, int index)
    {
        char[] letters = name.toCharArray();
        long score = 0;
        for (char c : letters)
        {
            // the +1 is to fix the fact that 'A' - 'A' = 0
            score += c - 'A' + 1;
        }
        score *= index;
        return score;
    }
}
