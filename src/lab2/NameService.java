package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService { 
    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    
    //diff between empty string and null string
    //empty string is just empty but has been intiaizlied is an object
    //null string is not intialized and is not an object. There is no object
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    //this method is throwing an exception to the caller
    //putting throw at the end is a best practice to indicate that the exception will be thrown to the caller
    public String extractLastName(String fullName)throws IllegalArgumentException  {
        if(fullName == null) {
            throw new IllegalArgumentException();
        }
        
        String[] nameParts = fullName.split(" ");
        
        if(nameParts.length != 2) {
            throw new IllegalArgumentException();
        }
        
        return nameParts[nameParts.length - 1];
    }
    
    /**
     * Finds and returns the first name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName) throws IllegalArgumentException {
        if (fullName == null || fullName.length() < 2) {
            throw new IllegalArgumentException("Full name cannot be null or less than 2 characters");
        }
        
        String[] nameParts = fullName.split(" ");
        
        if(nameParts.length != 2) {
            throw new IllegalArgumentException("Only first and last name please");
        }
        
        return nameParts[FIRST_NAME_IDX];
    }
    
    //could have a helper method to reduce repeat code. 
    //example validate names thorugh getValidateName method

    /**
     * Gets the length of a name.
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) {
        return name.length();
    }
    
}
