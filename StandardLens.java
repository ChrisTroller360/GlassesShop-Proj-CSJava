/*
Christian Vanzant
CS 321
November 14, 2021
*/

package lenstester;

/**
 * A Standard object that extends the CartierEyeGlasses abstract class.
 * cost() and daysToMake() methods from the abstract class are implemented here,
 * and are specific to the standard base lens.
 * @author Christian Vanzant
 */
public class StandardLens extends CartierEyeGlasses {
    
    
    /**
     * A constructor that sets the description field of the 
     * lens to match the standard base lens type
     */
    public StandardLens() {
        setDescription("Standard Base Lens: A good, basic lens");
    }
    
    /**
     * Returns cost of base standard lens.
     * @return The cost of a standard lens
     */
    @Override
    public double cost() {
        return 15;  // Cost 15 dollars for a standard lens
    }
    
    /**
     * Returns the days needed to make a standard lens 
     * @return the days needed to make a standard lens with an integer.
     */
    @Override
    public int daysToMake() {
        return 7;   // Takes 7 days to make a standard lens
    }
    
    
}
