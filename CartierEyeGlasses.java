/*
Christian Vanzant
CS 321
November 14, 2021
*/

package lenstester;

import java.text.DecimalFormat;

/**
 * An abstract glasses object that contains methods to set the description of a 
 * lens, get the description of a lens. The class also features abstract methods
 * cost() and daysToMake() which return the cost of a concrete glasses object
 * (implemented in concrete classes)
 * @author Christian Vanzant
 */
public abstract class CartierEyeGlasses {
    
    private static final DecimalFormat decFormat = new DecimalFormat("0.00");
    
    private String description = "Unknown Lens"; // Default description, should not be printed
    
    /**
     * A default functionality that sets the description of a glasses object
     * to a string containing a specific description of the concrete class.
     * @param description
     */
    public void setDescription(String description){
        this.description = description;
    }
    
    /**
     * An Abstraction to return a description of a glasses object (with
     * no decorators)
     * @return a string description of a glasses object
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * An abstraction to return the number of days needed to make a glasses object
     * @return the days needed to make the glasses.
     */
    public abstract int daysToMake();    

    /**
     * An abstraction to return the cost of a glasses object.
     * @return cost of lens.
     */
    public abstract double cost();
    
    /**
     * A method to create and return a full representation of a glasses object.
     * @return A string representation of every facet of a glasses object: Its
     * price, the days required to make, and its description.
     */
    @Override
    public String toString() {
        return getDescription() + "\n$" + decFormat.format(cost())
                + "\n" + (daysToMake()) + " Days To Make";
    }
    
    
}
