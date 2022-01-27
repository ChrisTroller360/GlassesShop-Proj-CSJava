/*
Christian Vanzant
CS 321
November 14, 2021
*/

package lenstester;

/**
 * A Tint decoration that extends the abstract LensDecorator class
 * and wraps a glasses object. The methods add extra functionality to the glasses
 * abstract class, such as adding the coating's cost, the days to make, and a 
 * descriptor to a glasses object.
 * @author Christian Vanzant
 */
public class Tint extends LensDecorator {
    
    
    private CartierEyeGlasses glasses;  // create object that will wrap base objects
    
    /**
     * This constructor creates a decorator object that wraps around a base
     * lens. It sets the object to the base lens, other methods in class add to
     * its characteristics.
     * @param glasses is a base glasses object to be wrapped by our Tint decorator
     */
    public Tint(CartierEyeGlasses glasses) {
        this.glasses = glasses;
    }
    
    /**
     * This method returns a string representation of some lens/glasses object
     * with the Tint decoration included.
     * @return the base lens description and the additional decorator (Tint)
     */
    @Override
    public String getDescription() {
        return glasses.getDescription() + "\nTinted: A tint to turn your lenses "
                + "into sunglass lenses";
    }
    
    /**
     * This method adds the cost of a tinted lens to the base lens price
     * @return the price of the lens including the tinted Lens price.
     */
    @Override
    public double cost() {
        return glasses.cost() + 45;  // Add tint price
    }

    /**
     * A tinted lens takes 3 extra days to make, so this method adds 3
     * to the days needed to make the glasses it decorates.
     * @return the days needed to make the base lens plus the 3 days it takes to
     * make them tinted
     */
    @Override
    public int daysToMake() {
        return glasses.daysToMake() + 3; // Takes 3 extra days
    }
    
    
}
