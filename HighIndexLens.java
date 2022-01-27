/*
Christian Vanzant
CS 321
November 14, 2021
*/

package lenstester;

/**
 * A HighIndexLens object that extends the CartierEyeGlasses abstract class.
 * cost() and daysToMake() methods from the abstract class are implemented here,
 * and are specific to the High Index lens.
 * @author Christian Vanzant
 */
public class HighIndexLens extends CartierEyeGlasses {
    
    
    /**
     * A constructor that sets the description field of the 
     * lens to match the high index lens type
     */
    public HighIndexLens() {
        setDescription("High Index Lens: A lighter and thinner lens designed for "
                + "those with stronger prescriptions");
    }
    
    /**
     * Returns cost of base High Index lens.
     * @return The cost of a High Index lens
     */
    @Override
    public double cost() {
        return 75;   // Cost 75 dollars for a HighIndex lens
    }
    
    /**
     * Returns the days needed to make a high index lens
     * @return the days needed to make a high index lens with an integer.
     */
    @Override
    public int daysToMake() {
        return 12;  // Takes 12 days to make a HighIndex lens
    }
    
}
