package Temporary;

/**
 *
 * @author malik
 */
public class Bricks 
{
    private int id;
    private String type;
    private int length;
    private int width;
    private int height;

    public int getId() 
    {
        return id;
    }

    public String getType() 
    {
        return type;
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

    @Override
    public String toString() 
    {
        return "BrickID: " + id + "\nBricktype: " + type + "\nBricklength: " + length 
                + "\nBrickwidth:" + width + "\nBrickheight: " + height;
    }
}
