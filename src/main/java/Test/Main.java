package Test;

import DBAccess.BrickMapper;
import FunctionLayer.Calculation;

/**
 *
 * @author malik
 */
public class Main 
{
    public static void main(String[] args) throws ClassNotFoundException 
    {
        Calculation c = new Calculation();
        //int res = c.brickTotalBottom(20);
        System.out.println("Bottom " + c.brickTotalBottom(20));
        System.out.println("Above bottom " + c.brickTotalOverBottom(20));
        
        BrickMapper brick = new BrickMapper();
        System.out.println("\n\nAll " + brick.getAllBottoms());
        
        System.out.println("... " + brick.totalLength("big"));
    }
}
