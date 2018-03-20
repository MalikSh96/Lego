package FunctionLayer;

import DBAccess.UserMapper;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    
    public static Calculation Calculate(int CustomerLength) throws ClassNotFoundException
    {
        Calculation c = new Calculation();
        c.brickTotalBottom(CustomerLength);
        c.brickTotalOverBottom(CustomerLength);
        return c;
    }
}
