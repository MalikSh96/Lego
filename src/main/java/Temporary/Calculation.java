package Temporary;

import DBAccess.BrickMapper;
import java.util.ArrayList;

/**
 *
 * @author malik
 */
public class Calculation 
{
        BrickMapper b = new BrickMapper();
        int bigL = 0; //counts amount used
        int mediumL = 0;
        int smallL = 0;
        ArrayList<Integer> bri = new ArrayList<>();

    public Calculation() throws ClassNotFoundException 
    {
        bigL = b.totalLength("big");
        mediumL = b.totalLength("medium");
        smallL = b.totalLength("small");
    }
        
    
    //1. Calculate the total of bricks to be used
    //2. Find out how the bottom layer is gonna be structured
    //3. Find out how the second (above bottom) layer is gonna be structured
    
    //To calculate the amount of bricks to be used, just calculate two of the sides, then * them with 2, to cover the last two 
    //1. The total of the length is calculated using the customers desired length and the length of the bricks chosen
    public ArrayList<Integer> brickTotalLengthBottom(int customerHouseLength) throws ClassNotFoundException
    {
        /*
        The length of the house will be a total of dots, so for example if a customer
        want the house to be 20 dots long, perhaps divide, or take modulus, the 
        customerHouseLength with first the big brick, then divide, or take the modulus, with 
        the remaining with the medium and etc....
        */
        int bigCounter = 0; //counts amount used
        int mediumCounter = 0;
        int smallCounter = 0;
        
        int total = customerHouseLength; //temp
        while(total != 0)
        {
//            while(total >= 0 && total - bigL > 0)
            while(total >= 0 && total - bigL > 0)
            {
                total -= bigL;
                bigCounter++;
                System.out.println("big " + bigCounter);
                
            }
            while(total - mediumL > 0 && total >= 0)
            {
                total -= mediumL;
                mediumCounter++;
                System.out.println("medium " + mediumCounter);
                
            }
            while(total > 0)
            {
                total -= smallL;
                smallCounter++;
                System.out.println("small " + smallCounter);
            }        
        }
        bri.add(bigCounter);
        bri.add(mediumCounter);
        bri.add(smallCounter);
        return bri;
    }
    
    //2.
    public int brickTotalLengthOverBottom(int length, int customerHouseLength)
    {
        return 0;
    }
    //3.

    @Override
    public String toString() {
        return "Calculation{" + "bri=" + bri + '}';
    }
    
    
}
