package Test;

import DBAccess.BrickMapper;
import DBAccess.OrderMapper;
import FunctionLayer.Calculation;
import FunctionLayer.PreOrder;
import FunctionLayer.User;

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
        //System.out.println("Bottom " + c.brickTotalBottom(20));
        //System.out.println("Above bottom " + c.brickTotalOverBottom(20));
        //System.out.println("\nWidth bottom " + c.brickTotalWidth(10));
        //System.out.println("Width over bottom " + c.brickTotalOverBottomWidth(10));
        System.out.println("\nTotal: " + c.totalBricks(10, 10, 2));

        
        BrickMapper brick = new BrickMapper();
        System.out.println("\n\nAll " + brick.getAllBottoms());
        
        System.out.println("... " + brick.totalLength("big"));
    }
}
