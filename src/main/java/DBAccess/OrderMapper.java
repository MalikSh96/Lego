package DBAccess;

import FunctionLayer.PreOrder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author malik
 */
public class OrderMapper 
{
    public void createPreOrder(PreOrder ord) //To test in main
    {
        int orderId = 0;
        try 
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO preOrders (userID, length, width, height) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS ); 
            ps.setInt(1, ord.getUserId()); //user id
            ps.setInt(2, ord.getLength());
            ps.setInt(3, ord.getWidth());
            ps.setInt(4, ord.getHeight());

            System.out.println("Check sql order " + SQL);

            int check = ps.executeUpdate();
            if(check == 1)
            {
                ResultSet ids = ps.getGeneratedKeys();
                ids.next();
                orderId = ids.getInt( 1 );

                System.out.println("Debug " + orderId);

            }
        } catch ( SQLException | ClassNotFoundException ex ) { //temporary error
            throw new Error( ex.getMessage() );
        }
    }
    
    public static void createOrder(PreOrder ord) //to use in logcfacade
    {
        int orderId = 0;
        try 
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO preOrders (userID, length, width, height) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS ); 
            ps.setInt(1, ord.getUserId()); //user id
            ps.setInt(2, ord.getLength());
            ps.setInt(3, ord.getWidth());
            ps.setInt(4, ord.getHeight());

            System.out.println("Check sql order " + SQL);

            int check = ps.executeUpdate();
            if(check == 1)
            {
                ResultSet ids = ps.getGeneratedKeys();
                ids.next();
                orderId = ids.getInt( 1 );

                System.out.println("Debug " + orderId);

            }
        } catch ( SQLException | ClassNotFoundException ex ) { //temporary error
            throw new Error( ex.getMessage() );
        }
    }
    
    public List<PreOrder> History(PreOrder order)
    {
        List<PreOrder> history = new ArrayList<>();
        PreOrder ord = null;
        try 
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM useradmin.preorders where userID = " + order.getUserId();
            
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet resultset = ps.executeQuery();
            
            while(resultset.next())
            {   
                int id = resultset.getInt("id");
                int userID = resultset.getByte("userID");
                int length = resultset.getInt("length");
                int width = resultset.getInt("width");
                int height = resultset.getInt("height");
                
                if(userID == order.getUserId())
                {
                    ord = new PreOrder(userID, length, width, height);
                    history.add(ord);
                }
            }
            System.out.println("sql syntax ok? " + SQL);
            
        } catch ( SQLException | ClassNotFoundException ex ) { //temporary error
            throw new Error( ex.getMessage() );
        }
        
        return history;
    }
    public static List<PreOrder> orderHistory(PreOrder order)
    {
        List<PreOrder> history = new ArrayList<>();
        PreOrder ord = null;
        try 
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM useradmin.preorders where userID = " + order.getUserId();
            
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet resultset = ps.executeQuery();
            
            while(resultset.next())
            {   
                int id = resultset.getInt("id");
                int userID = resultset.getByte("userID");
                int length = resultset.getInt("length");
                int width = resultset.getInt("width");
                int height = resultset.getInt("height");
                
                if(userID == order.getUserId())
                {
                    ord = new PreOrder(userID, length, width, height);
                    history.add(ord);
                }
            }
            System.out.println("sql syntax ok? " + SQL);
            
        } catch ( SQLException | ClassNotFoundException ex ) { //temporary error
            throw new Error( ex.getMessage() );
        }
        
        return history;
    }
}