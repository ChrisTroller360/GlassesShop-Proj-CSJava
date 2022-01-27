/*
Christian Vanzant
CS 321
November 14, 2021
*/

package lenstester;

/**
 * A PolyCarbonateLens object that extends the CartierEyeGlasses abstract class.
 * cost() and daysToMake() methods from the abstract class are implemented here,
 * and are specific to the lens type.
 * @author Christian Vanzant
 */
public class PolyCarbonateLens extends CartierEyeGlasses {
    
    
    /**
     * A constructor that sets the description field of the 
     * lens to match the polycarbonate lens type
     */
    public PolyCarbonateLens() {
        setDescription("Polycarbonate Base Lens: Impact-resistant lens that is "
                + "great for sports or those who are rough on their glasses");
    }
    
    /**
     * Returns cost of base polycarbonate lens.
     * @return The cost of a polycarbonate lens
     */
    @Override
    public double cost() {
        return 30;  // Cost 30 dollars for polycarbonate lens
    }
    
    /**
     * Returns the days needed to make a polycarbonate lens
     * @return the days needed to make a polycarbonate lens with an integer.
     */
    @Override
    public int daysToMake() {
        return 9;   // Takes 9 days to make a polycarbonate lens
    }
    
}