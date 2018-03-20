package Test;

import DBAccess.BrickMapper;
import Temporary.Calculation;

/**
 *
 * @author malik
 */
public class Main 
{
    public static void main(String[] args) throws ClassNotFoundException 
    {
        Calculation c = new Calculation();
        //int res = c.brickTotalLengthBottom(20);
        System.out.println("Testing... " + c.brickTotalLengthBottom(6));
        
        BrickMapper brick = new BrickMapper();
        System.out.println("\n\nAll " + brick.getAllBottoms());
        
        System.out.println("... " + brick.totalLength("big"));
    }
}
