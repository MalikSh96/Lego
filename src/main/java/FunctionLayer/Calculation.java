package FunctionLayer;

import DBAccess.BrickMapper;
import java.util.ArrayList;

/**
 *
 * @author malik
 */
public class Calculation 
{
    private BrickMapper b = new BrickMapper();
    private int bigL = 0; //is set to the size of the bricks
    private int mediumL = 0; // ^
    private int smallL = 0; // ^^
    
    private int totalCounterUneven = 0;
    private int totalCounterEven = 0;
    private int totalCounterUnevenWidth = 0;
    private int totalCounterEvenWidth = 0;
    
    private ArrayList<Integer> unevenLength = new ArrayList<>(); //bottom layer
    private ArrayList<Integer> evenLength = new ArrayList<>(); //above bottom
    private ArrayList<Integer> unevenWidth = new ArrayList<>();
    private ArrayList<Integer> evenWidth = new ArrayList<>();

    public Calculation() throws ClassNotFoundException 
    {
        bigL = b.totalLength("big");
        mediumL = b.totalLength("medium");
        smallL = b.totalLength("small");
    }
        
    
    //1. Calculate the total of bricks to be used for the bottom layer 1-3-5-7
    //2. Calculate the total of bricks to be used for the layer above bottom 2-4-6-8
    //3. Calculate the total of bricks to be used as the width of 1-3-5-7
    //4.
    //5. Find out how the second (above bottom) layer is gonna be structured... OR CALCULATE THE TOTSL SMOUNT OF BRICKS
    
    //To calculate the amount of bricks to be used, just calculate two of the sides, then * them with 2, to cover the last two 
    //1. The total of the length is calculated using the customers desired length and the length of the bricks chosen
    public ArrayList<Integer> brickTotalBottom(int customerHouseLength) throws ClassNotFoundException
    {
        /*
        The length of the house will be a total of dots, so for example if a customer
        want the house to be 20 dots long, perhaps divide, or take modulus, the 
        customerHouseLength with first the big brick, then divide, or take the modulus, with 
        the remaining with the medium and etc....
        I have used while loops to check whether or not the usage of the different bricks is possible.
        The idea here is to start at the bottom layer, by starting with using the big briks, then medium bricks and etc.
        */
        int bigCounter = 0; //counts amount used
        int mediumCounter = 0;
        int smallCounter = 0;
        
        int total = customerHouseLength; //The length of the customer choice
        while(total != 0)
        {
            while(total >= 0 && total - bigL >= 0)
            {
                total -= bigL; //every time we use a brick we count down
                bigCounter++; //increment the usage of the brick
                System.out.println("big " + bigCounter); //debug checker
                
            }
            while(total >= 0 && total - mediumL >= 0)
            {
                total -= mediumL; //same as the while loop above
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
        totalCounterUneven += bigCounter + mediumCounter + smallCounter;
        System.out.println("Check counter one " + totalCounterUneven);
        unevenLength.add(bigCounter); //adds the amount to an arraylist to store the amount
        unevenLength.add(mediumCounter);
        unevenLength.add(smallCounter);
        return unevenLength; //returns the arraylist with the brick total
    }
    
    //2. Same as method above, only difference is that no big bricks is used
    public ArrayList<Integer> brickTotalOverBottom(int customerHouseLength)
    {
        int mediumCounter = 0;
        int smallCounter = 0;
        
        int total = customerHouseLength; //temp
        while(total != 0)
        {
            while(total >= 0 && total - mediumL >= 0)
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
        totalCounterEven += mediumCounter + smallCounter;
        System.out.println("Check counter two " + totalCounterEven);
        evenLength.add(mediumCounter);
        evenLength.add(smallCounter);
        return evenLength;
    }
    
    //3.
    public ArrayList<Integer> brickTotalWidth(int customerHouseWidth) throws ClassNotFoundException
    {
        int bigCounter = 0; //counts amount used
        int mediumCounter = 0;
        int smallCounter = 0;
        
        int total = customerHouseWidth; //The length of the customer choice
        while(total != 0)
        {
            while(total >= 0 && total - bigL >= 0)
            {
                total -= bigL; //every time we use a brick we count down
                bigCounter++; //increment the usage of the brick
                System.out.println("big " + bigCounter); //debug checker
                
            }
            while(total >= 0 && total - mediumL >= 0)
            {
                total -= mediumL; //same as the while loop above
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
        totalCounterUnevenWidth += bigCounter + mediumCounter + smallCounter;
        System.out.println("Check counter three " + totalCounterUnevenWidth);
        unevenWidth.add(bigCounter); //adds the amount to an arraylist to store the amount
        unevenWidth.add(mediumCounter);
        unevenWidth.add(smallCounter);
        return unevenWidth; //returns the arraylist with the brick total
    }
    
    //4.
    public ArrayList<Integer> brickTotalOverBottomWidth(int customerHouseWidth)
    {
        int mediumCounter = 0;
        int smallCounter = 0;
        
        int total = customerHouseWidth; //temp
        while(total != 0)
        {
            while(total >= 0 && total - mediumL >= 0)
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
        totalCounterEvenWidth += mediumCounter + smallCounter;
        System.out.println("Check counter four " + totalCounterEvenWidth);
        evenWidth.add(mediumCounter);
        evenWidth.add(smallCounter);
        return evenWidth;
    }
    
    //5.
    public int totalBricks(int customerLength, int customerWidth, int customerHeight) throws ClassNotFoundException
    {
        ArrayList<Integer> totals = new ArrayList<>(); //just temporary, not sure if will be used
        int total = 0; //brick total
        
        brickTotalBottom(customerLength);
        brickTotalOverBottom(customerLength); //add the total of these two above together somehow^
        brickTotalWidth(customerWidth);
        brickTotalOverBottomWidth(customerWidth);
        
        int brickCountLength = 0;
        brickCountLength += totalCounterEven + totalCounterUneven;
        System.out.println("Brick count length " + brickCountLength);
        
        int brickCountWidth = 0;
        brickCountWidth += totalCounterEvenWidth + totalCounterUnevenWidth;
        System.out.println("Brick count width " + brickCountWidth);
        total += (brickCountLength *  customerHeight * brickCountWidth) * 2;
        System.out.println("What is total: " + total);
        
        //Store the total
        totals.add(total);
        
        return total;
    }

    public ArrayList<Integer> getUnevenLength() 
    {
        return unevenLength;
    }

    public ArrayList<Integer> getEvenLength() 
    {
        return evenLength;
    }

    public ArrayList<Integer> getUnevenWidth() {
        return unevenWidth;
    }

    public ArrayList<Integer> getEvenWidth() {
        return evenWidth;
    }
    
    
}
