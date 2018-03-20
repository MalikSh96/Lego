/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.Calculation;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author malik
 */
public class Calculator extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException
    {
        int length = Integer.parseInt(request.getParameter("length"));
        
        Calculation c = LogicFacade.Calculate(length); //lenght is wrong
        
        HttpSession session = request.getSession();
        session.setAttribute("evenLegoPieces", c.getEven()); //save this in session
        return null;
    }
    
}
