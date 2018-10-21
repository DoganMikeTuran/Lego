package PresentationLayer;

import FunctionLayer.LoginException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put("order", new Order());
        commands.put("orderList", new Order());
        commands.put("Profile", new Profile());
        commands.put("ordre-show-stykliste", new Order());
        commands.put("bestil-ordre", new Order());
       
        
      
    }

    static Command from( HttpServletRequest request ) {
        String commandName = request.getParameter( "command" );
      if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(commandName, new UnknownCommand() );
    }

    abstract String execute( HttpServletRequest request, HttpServletResponse response ) 
            throws LoginException;

}
