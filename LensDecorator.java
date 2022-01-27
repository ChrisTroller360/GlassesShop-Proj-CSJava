/*
Christian Vanzant
CS 321
November 14, 2021
*/

package lenstester;

/**
 * An Abstract class that extends CartierEyeGlasses and reimplements abstract methods
 * to add functionality to a CartierEyeGlasses object. Cost, getDescription, and
 * daysToMake methods are all included and are implemented in concrete decorator
 * classes.
 * @author Christian Vanzant
 */
public abstract class LensDecorator extends CartierEyeGlasses {
    
    /**
     * A method we have to reimplement in our decorators. This method is
     * an abstraction that is implemented in concrete classes to 
     * add the new decoration to the description of a glasses object
     * @return A Description of a glasses object, including any new decorators
     */
    @Override
    public abstract String getDescription();
    
    /**
     * A method we have to reimplement in our decorators. This method is
     * an abstraction that is implemented in concrete classes to 
     * add and return the days needed to make a glasses object along with decorators.
     * @return The days needed to make a glasses object, including any extra days
     * from decorators
     */
    @Override
    public abstract int daysToMake();
    
     /**
     * This method is an abstraction that is implemented in concrete decorator classes to 
     * add and return the cost of a glasses object, including decorators.
     * @return The cost of a glasses object, including/adding any extra cost
     * from decorators
     */
    @Override
    public abstract double cost();
    
}
