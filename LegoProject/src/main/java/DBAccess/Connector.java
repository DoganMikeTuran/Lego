package DBAccess;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginException;
import FunctionLayer.Side;
import FunctionLayer.Stykliste;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The purpose of Connector is to...
 *
 * @author kasper
 */
public class Connector {

    private static final String URL = "jdbc:mysql://139.59.143.43:3306/Lego";
    private static final String USERNAME = "dogansql";
    private static final String PASSWORD = "abc123";

    private static Connection singleton;

    public static void setConnection(Connection con) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        if (singleton == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            singleton = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return singleton;
    }

    public static void main(String[] args) throws LoginException {

        
}
}