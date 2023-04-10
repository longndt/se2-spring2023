package tuts.tut10.to_dos.chain_of_responsibility.middleware;

import tuts.tut10.complete.chain_of_responsibility.server.Server;

/**
 * ConcreteHandler. Checks whether a user with the given credentials exists.
 */
public class UserExistsMiddleware extends Middleware {
    private Server server;

    //TO-DO: Implement the UserExistsMiddleWare() method
    public UserExistsMiddleware(Server server) {
         
    }

    public boolean check(String email, String password) {
    	//TO-DO: Check for invalid email => show error message then return false
         
        //TO-DO: Check for invalid password for an email => show error message then return false
         
        return checkNext(email, password);
    }
}