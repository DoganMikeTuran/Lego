/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginException;
import FunctionLayer.Ordre;
import FunctionLayer.User;
import FunctionLayer.Wall;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dmt1
 */
public class Order extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginException {

        
        if(request.getParameter("command").equals("ordre-show-stykliste")){
            User user = (User) request.getSession().getAttribute("user");
            if(user != null){
                String length = request.getParameter("length");
                String width = request.getParameter("width");
                String layer = request.getParameter("layer");
                Ordre newOrdre = SaveOrder(length, width, layer, user);
                
                if(newOrdre != null){
                    HttpSession session = request.getSession();
                    LogicFacade.calculateStykliste(newOrdre);
                    session.setAttribute("order", newOrdre );
                }
                
            }
        }
        
        if(request.getParameter("command").equals("bestil-ordre")){
            Ordre ordre = (Ordre) request.getSession().getAttribute("order");
            if(ordre != null){
                Ordre newOrdre = OrderOrdre(ordre);
                if(newOrdre != null){
                    HttpSession session = request.getSession();
                    session.setAttribute("order", newOrdre );
                    session.setAttribute("ordreStatusBestilt", "Y" );
                }
            }
        }
                        
        return "Order";
    }

    private Ordre  SaveOrder(String length, String width, String layer, User user) throws LoginException {
        Ordre newOrdre = LogicFacade.makeOrder(Integer.parseInt(length), 
                Integer.parseInt(width), 
                Integer.parseInt(layer),
                user);
        
        return newOrdre;
    }
    
    private Ordre  OrderOrdre(Ordre o) throws LoginException {
        Ordre newOrdre = LogicFacade.OrderOrdre(o);
        return newOrdre;
    }    
}
