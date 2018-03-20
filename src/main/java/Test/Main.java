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
//        Calculation c = new Calculation();
//        System.out.println("Testing... " + c.brickTotalLengthBottom(4, 20));
        
        BrickMapper brick = new BrickMapper();
        System.out.println("All " + brick.getAllBottoms());
    }
}
