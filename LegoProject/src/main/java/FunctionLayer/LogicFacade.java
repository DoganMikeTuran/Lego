package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.util.ArrayList;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    
    
    public static User GetInfo( String email, String password ) throws LoginException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    
    public static User login( String email, String password ) throws LoginException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static Ordre makeOrder(int length, int width, int layer, User user) throws LoginException{
        Ordre o = new Ordre(0, "Oprettet", null, length, width, layer);
        Ordre newOrdre = OrderMapper.createOrder(o, user);
        return newOrdre;    
    }
    
    public static Ordre calculateStykliste(Ordre o){
        Stykliste sl = new StyklisteEngine().CreateStykliste(o);
        o.stykliste = sl;
        return o;
    }

    public static Ordre OrderOrdre(Ordre o) throws LoginException {
        o.status = "Bestilt";
        Ordre newOrdre = OrderMapper.updateOrdreStatus(o);
        return newOrdre;
    }

}
