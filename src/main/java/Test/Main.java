package Test;

import DBAccess.BrickMapper;
import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import FunctionLayer.Calculation;
import FunctionLayer.PreOrder;

/**
 *
 * @author malik
 */
public class Main 
{
    public static void main(String[] args) throws ClassNotFoundException 
    {
        Calculation c = new Calculation();
        UserMapper um = new UserMapper();
        
        System.out.println("user: " + um.getUse(1));
        
        OrderMapper om = new OrderMapper();
        PreOrder o = new PreOrder(1, 20, 10, 1);
        om.createPreOrder(o);
        System.out.println("\nTotal: " + c.totalBricks(o));
        
        BrickMapper brick = new BrickMapper();
        System.out.println("\n\nAll " + brick.getAllBottoms());
        
        System.out.println("... " + brick.totalLength("small"));
    }
}
