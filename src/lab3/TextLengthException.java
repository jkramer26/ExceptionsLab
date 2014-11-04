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
public class TextLengthException extends IllegalArgumentException  {
    private static String msg = "Text entry violates length requirements";

    public TextLengthException() {
        super(msg);
    }

    public TextLengthException(String s) {
        super(msg);
    }

    public TextLengthException(String message, Throwable cause) {
        super(msg, cause);
    }

    public TextLengthException(Throwable cause) {
        super(cause);
    }
    
    
}
