import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * **SOLVED**
 *
 * @author Anthony Gargiulo
 * @version 1.0
 */

public class Main
{
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
			in.useDelimiter(",");
		} catch (FileNotFoundException e)
		{
			System.err
					.println("Cannot find file \"names.txt\"."
							+ "Please make sure that you placed it in the correct directory");
			return;
		}
		ArrayList<String> nameList = new ArrayList<String>(6000);
		while (in.hasNext())
		{
			String name = in.next();
			name = name.substring(1, name.length() - 1);
			if (!name.trim().equals(""))
			{
				nameList.add(name);
			}
		}
		in.close();
		Collections.sort(nameList);
		long sum = 0;
		for (int i = 0; i < nameList.size(); i++)
		{
			long score = calcNameScore(nameList.get(i), i + 1);
			sum += score;
		}
		System.out.println(sum);
	}
}
