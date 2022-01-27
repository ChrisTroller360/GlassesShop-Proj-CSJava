/*
Christian Vanzant
CS 321
November 14, 2021
*/

package lenstester;

/**
 * An AntiFog coating that extends the abstract LensDecorator class
 * and wraps a glasses object. The methods add extra functionality to the glasses
 * abstract class, such as adding the coating's cost, the days to make, and a 
 * descriptor to a glasses object.
 * @author Christian Vanzant
 */
public class AntiFog extends LensDecorator {
    
    private final CartierEyeGlasses glasses;  // create object that will wrap base objects
    
    /**
     * This constructor creates a decorator object that wraps around a base
     * lens. It sets the object to the base lens, other methods in class add to
     * its characteristics
     * @param glasses is a base glasses object to be wrapped by our AntiFog decorator
     */
    public AntiFog(CartierEyeGlasses glasses) {
        this.glasses = glasses;
    }
    
    /**
     * This method returns a string representation of some lens/glasses object
     * with the AntiFog decoration included.
     * @return the base lens description and the additional decorator (AntiFog)
     */
    @Override
    public String getDescription() {
        return glasses.getDescription() + "\nAnti-Fog: A coating that helps prevent "
                + "your lenses from fogging up during activities such as cooking";
        // Add Anti-Fog description
    }
    
    /**
     * This method adds the cost of AntiFog lens to the base lens price
     * @return the price of the lens including the AntiFog Lens price.
     */
    @Override
    public double cost() {
        return glasses.cost() + 15;  // Add AntiFog price
    }

    /**
     * An AntiFog lens takes one extra day to make, so this method adds the day
     * to the days needed to make the glasses it decorates.
     * @return the days needed to make the base lens plus the 1 day it takes to
     * make them AntiFog
     */
    @Override
    public int daysToMake() {
        return glasses.daysToMake() + 1; // Takes 1 extra day
    }
    
}