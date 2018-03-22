package DBAccess;

import FunctionLayer.PreOrder;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author malik
 */
public class OrderMapper 
{
     public static void createPreOrder(PreOrder ord)
     {
        int orderId = 0;
        try 
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO preOrders (userID, brickTotal, length, width, height) VALUES (?)";
            
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS ); 
            ps.setInt(1, ord.getUserId()); //user id
            ps.setInt(2, ord.getBrickTotal());
            ps.setInt(3, ord.getLength());
            ps.setInt(4, ord.getWidth());
            ps.setInt(5, ord.getHeight());
            
            System.out.println("Check sql order " + SQL);
            
            int check = ps.executeUpdate();
            if(check == 1)
            {
                ResultSet ids = ps.getGeneratedKeys();
                ids.next();
                orderId = ids.getInt( 1 );
                
                System.out.println("Debug " + orderId);
                
                /*
                Orderline in here missing??
                */
            }
        } catch ( SQLException | ClassNotFoundException ex ) { //temporary error
            throw new Error( ex.getMessage() );
        }
    }

     
     
    //make an orderline method perhaps....
    
}
