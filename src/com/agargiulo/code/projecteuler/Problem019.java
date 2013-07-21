/**
 * File: Problem019.java
 * Date created: Jul 21, 2013
 * 
 * @author agargiulo
 */

package com.agargiulo.code.projecteuler;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author agargiulo
 * @version 0.1
 * 
 * 
 *          You are given the following information, but you may prefer to do
 *          some research for yourself.
 * 
 *          1 Jan 1900 was a Monday.
 *          Thirty days has September,
 *          April, June and November.
 *          All the rest have thirty-one,
 *          Saving February alone,
 *          Which has twenty-eight, rain or shine.
 *          And on leap years, twenty-nine.
 *          A leap year occurs on any year evenly divisible by 4, but not on a
 *          century unless it is divisible by 400.
 * 
 *          How many Sundays fell on the first of the month during the twentieth
 *          century (1 Jan 1901 to 31 Dec 2000)?
 * 
 * 
 */
public class Problem019
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int startingYear = 1901;
		int endingYear = 2000;
		int dayOfMonth = 1;
		int firstSundays = 0;

		GregorianCalendar gcal = new GregorianCalendar(startingYear,
				Calendar.JANUARY, dayOfMonth);
		GregorianCalendar gcalEnd = new GregorianCalendar(endingYear,
				Calendar.DECEMBER, 31);
		while (!gcal.equals(gcalEnd))
		{
			if (gcal.get(Calendar.DAY_OF_MONTH) == 1
					&& gcal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
			{
				firstSundays++;

			}
			gcal.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out
				.println("Number of Sundays that are also the first of the month: "
						+ firstSundays);

	}
}
