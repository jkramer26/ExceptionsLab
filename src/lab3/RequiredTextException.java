/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *
 * @author jkramer26
 */
public class RequiredTextException extends IllegalArgumentException {
    
    //have to make this static so the variable belongs to the class and not the object. 
    //This way we are able to give message to superclass and not have to worry about 
    //ojbect not being created yet
    private static String msg = "Text entry mandatory";
    
    //default constructor
    //enter referance to superclass, this matters when we want message to be given to the superclass
    //want to give the message to the superclass
    public RequiredTextException() {
        super(msg);
    }
    
    //Ignore msg being passed in by programmer and using our own message
    public RequiredTextException(String s) {
        super(msg);
    }
    
    //
    public RequiredTextException(String message, Throwable cause) {
        super(msg, cause);
    }
    
    
    public RequiredTextException(Throwable cause) {
        super(cause);
    }
    
    
    
}
