package DBAccess;

import FunctionLayer.LoginException;
import FunctionLayer.Ordre;
import FunctionLayer.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 The purpose of UserMapper is to...

 @author kasper
 */
public class OrderMapper {

    public static Ordre createOrder( Ordre ordre,User user ) throws LoginException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO ordre (userid, length, width, layer) VALUES (?, ?, ?, ?)";
            
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setInt(1,user.getId());
            ps.setInt(2, ordre.getLængde() );
            ps.setInt(3, ordre.getBredde());
            ps.setInt(4, ordre.getHøjde());
            ps.executeUpdate();
            
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt( 1 );
            ordre.setOrdreNummer(id);
            
            return ordre;
            
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginException( ex.getMessage() );
        }
        
    }

    public static Ordre updateOrdreStatus(Ordre o) throws LoginException {
        try {
            Connection con = Connector.connection();
            String SQL = "UPDATE ordre SET status = ? WHERE id = ?";
            
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(2, o.getOrdreNummer());
            ps.setString(1, o.getStatus() );
            ps.executeUpdate();
            
            return o;
            
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginException( ex.getMessage() );
        }

    }


}
