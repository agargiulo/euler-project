/**
 * @author Anthony Gargiulo
 * @version 0.1
 *          Euler Project
 *          Digits.java
 *          ---------
 *          The Enum used by #17 to make life a WHOLE lot easier
 */

public enum Digits
{
    ONE("one"), TWO("two"), THREE("three"), FOUR("four"), FIVE("five"), SIX(
            "six"), SEVEN("seven"), EIGHT("eight"), NINE("nine"), TEN("ten"), EVELEN(
            "eleven"), TWELVE("twelve"), THIRTEEN("thirteen"), FOURTEEN(
            "fourteen"), FIVETEEN("fiveteen"), SIXTEEN("sixteen"), SEVENTEEN(
            "seventeen"), EIGHTEEN("eighteen"), NINETEEN("ninetenn"), TWENTY(
            "twenty"), THIRTY("thirty"), FOURTY("fourty"), FIFTY("fifty"), SIXTY(
            "sixty"), SEVENTY("seventy"), EIGHTY("eighty"), NINTY("ninty"), HUNDRED(
            "hundred"), THOUSAND("thousand");

    private final String longWord;

    /**
     * @param word
     *            the String that represents that number
     */
    Digits(String word)
    {
        longWord = word;
    }

    public String getWord()
    {
        return longWord;
    }
}
