/*
Christian Vanzant
CS 321
November 14, 2021
*/

package lenstester;

/**
 * An AntiReflective coating that extends the abstract LensDecorator class
 * and wraps a glasses object. The methods add extra functionality to the glasses
 * abstract class, such as adding the coating's cost, the days to make, and a 
 * descriptor to a glasses object.
 * @author Christian Vanzant
 */
public class AntiReflective extends LensDecorator {
    
    
    private CartierEyeGlasses glasses;  // create object that will wrap base objects
    
    /**
     * This constructor creates a decorator object that wraps around a base
     * lens. It sets the object to the base lens, other methods add to the 
     * description of it
     * @param glasses is a base glasses object to be wrapped by our decorator
     */
    public AntiReflective(CartierEyeGlasses glasses) {
        this.glasses = glasses;     
    }
    
    /**
     * This method returns a string representation of some lens/glasses object
     * with the AntiReflective decoration included.
     * @return the base lens description and the additional decorator
     */
    @Override
    public String getDescription() {
        return glasses.getDescription() + "\nAnti-Reflective: A thin coating "
                + "that helps reduce glare";    // Add Anti-Reflective description
    }
    
    /**
     * This method adds the cost of AntiReflective lens to the base lens price
     * @return the price of the lens including the decorator price.
     */
    @Override
    public double cost() {
        return glasses.cost() + 7;  // Add decorator price
    }

    /**
     * Because an AntiReflective lens takes 0 extra days, this method simply
     * returns the days needed to make the lens it wraps.
     * @return the days needed to make the lens that AntiReflective wraps
     */
    @Override
    public int daysToMake() {
        return glasses.daysToMake(); // Takes 0 days, no need to add
    }
    
}
