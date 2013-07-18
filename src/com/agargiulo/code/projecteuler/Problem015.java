package com.agargiulo.code.projecteuler;
/**
 * @author Anthony Gargiulo
 * @version 0.1
 *          Euler Project
 *          Problem 15
 *          ---------
 *          Starting in the top left corner of a 2x2 grid, there are 6 routes
 *          (without backtracking) to the bottom right corner.
 *          How many routes are there through a 20x20 grid?
 */

public class Problem015
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {

    }

}

/**
 * @author Anthony Gargiulo
 */
class Node
{
    /**
     * 
     */
    private final Node[] neighbors;

    /**
     * @param south
     * @param east
     */
    public Node(Node south, Node east)
    {
        neighbors = new Node[2];
        neighbors[0] = south;
        neighbors[1] = east;
    }

    /**
     * @return the eastern neighbor
     */
    public Node getEast()
    {
        return neighbors[1];
    }

    /**
     * @return the southern neighbor
     */
    public Node getSouth()
    {
        return neighbors[0];
    }
}
