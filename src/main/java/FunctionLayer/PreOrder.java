package FunctionLayer;

/**
 *
 * @author malik
 */
public class PreOrder 
{
    private int id; //id of order
    private int userId; //id of the user
    private int brickTotal; //total amount of bricks used
    private int length; //length of the house
    private int width; //width of the house
    private int height; //height of the house
    private boolean orderConfirmed; //check if the order is confirmed and ready to delivery

    public int getId() 
    {
        return id;
    }

    public int getUserId() 
    {
        return userId;
    }

    public int getBrickTotal() 
    {
        return brickTotal;
    }

    public int getLength() 
    {
        return length;
    }

    public int getWidth() 
    {
        return width;
    }

    public int getHeight() 
    {
        return height;
    }

    public boolean isOrderConfirmed() 
    {
        return orderConfirmed;
    }
}
