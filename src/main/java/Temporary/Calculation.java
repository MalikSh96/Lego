package Temporary;

/**
 *
 * @author malik
 */
public class Calculation 
{
    //1. Calculate the total of bricks to be used
    //2. Find out how the bottom layer is gonna be structured
    //3. Find out how the second (above bottom) layer is gonna be structured
    
    //To calculate the amount of bricks to be used, just calculate two of the sides, then * them with 2, to cover the last two 
    //!.
    public int brickTotal(int height, int width, int length, int customerHouseLength)
    {
        /*
        The length of the house will be a total of dots, so for example if a customer
        want the house to be 20 dots long, perhaps divide, or take modulus, the 
        customerHouseLength with first the big brick, then divide, or take the modulus, with 
        the remaining with the medium and etc....
        */
        int total = 0; //temp
        while(total != 0)
        {
            total = customerHouseLength % length;
            if(total == 0)
            {
                return total;
            }
            else
            {
                total %= length;
            }
        }
        
        return total; //temporary
    }
    
    //2.
    
    //3.
}
