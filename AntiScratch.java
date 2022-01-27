/*
Christian Vanzant
CS 321
November 14, 2021
*/

package lenstester;

/**
 * An AntiScratch decoration that extends the abstract LensDecorator class
 * and wraps a glasses object. The methods add extra functionality to the glasses
 * abstract class, such as adding the coating's cost, the days to make, and a 
 * descriptor to a glasses object.
 * @author Christian Vanzant
 */
public class AntiScratch extends LensDecorator {
    
    
    private CartierEyeGlasses glasses;  // create object that will wrap base objects
    
    /**
     * This constructor creates an AntiScratch decorator object that wraps around a base
     * lens. It sets the object to the base lens, other methods in the class add to
     * its characteristics
     * @param glasses is a base lens object to be wrapped by our AntiScratch decorator
     */
    public AntiScratch(CartierEyeGlasses glasses) {
        this.glasses = glasses;
    }
    
    /**
     * This method returns a string representation of some lens/glasses object
     * with the AntiScratch decoration included.
     * @return the base lens description and the additional decorator (AntiScratch)
     */
    @Override
    public String getDescription() {
        return glasses.getDescription() + "\nAnti-Scratch: A scratch-resistant "
                + "coating that improves the durability of the lens";
        // Add Anti-Scratch description
    }
    
    /**
     * This method adds the cost of AntiScratch lens to the base lens price
     * @return the price of the lens including the AntiScratch Lens price.
     */
    @Override
    public double cost() {
        return glasses.cost() + 5;  // Add AntiFog price
    }

    /**
     * An Anti-Scratch lens takes no extra days to make, so this method simply returns
     * the days needed to make the glasses it decorates.
     * @return the days needed to make the base lens 
     */
    @Override
    public int daysToMake() {
        return glasses.daysToMake(); // Takes 0 extra days
    }
    
    
}
