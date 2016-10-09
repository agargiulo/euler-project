import java.util.ArrayList;

/**
 * **SOLVED**
 * @author Anthony Gargiulo
 * @version 1.0
 */

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> fibb = new ArrayList<Integer>(1000);
		fibb.add(1);
		fibb.add(2);
		int index = 2;
		int curVal = 0;
		int sum = 2;
		do
		{
			curVal = fibb.get(index - 1) + fibb.get(index - 2);
			fibb.add(curVal);
			if (curVal % 2 == 0)
			{
				sum += curVal;
			}
			index++;
		} while (curVal < 4000000);
		System.out.println(sum);
	}

}
