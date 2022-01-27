/*
Christian Vanzant
CS 321
November 14, 2021
*/

package lenstester;

/**
 * A UV Protection coating that extends the abstract LensDecorator class
 * and wraps a glasses object. The methods add extra functionality to the glasses
 * abstract class, such as adding the coating's cost, the days to make, and a 
 * descriptor to a glasses object.
 * @author Christian Vanzant
 */
public class UVProtection extends LensDecorator {
    
    
    private CartierEyeGlasses glasses;  // create object that will wrap base objects
    
    /**
     * This constructor creates a decorator object that wraps around a base
     * lens. It sets the object to the base lens, and other methods in class add to
     * its characteristics.
     * @param glasses is a base glasses object to be wrapped by our AntiFog decorator
     */
    public UVProtection(CartierEyeGlasses glasses) {
        this.glasses = glasses;
    }
    
    /**
     * This method returns a string representation of some lens/glasses object
     * with the UV Protection decoration included.
     * @return the base lens description and the additional decorator (UV Protection)
     */
    @Override
    public String getDescription() {
        return glasses.getDescription() + "\nUV Protected: A protective coating "
                + "that blocks UV rays";
    }
    
    /**
     * This method adds the cost of UV Protected lens to the base lens price
     * @return the price of the lens including the UV Protected Lens price.
     */
    @Override
    public double cost() {
        return glasses.cost() + 10;  // Add UV Protection price
    }

    /**
     * A UV Protected lens takes two extra days to make, so this method adds 2
     * to the days needed to make the glasses it decorates.
     * @return the days needed to make the base lens plus the 2 days it takes to
     * make them UV Protected
     */
    @Override
    public int daysToMake() {
        return glasses.daysToMake() + 2; // Takes 2 extra days
    }
    
    
}
