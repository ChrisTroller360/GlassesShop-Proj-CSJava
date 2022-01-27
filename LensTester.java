/*
Christian Vanzant
CS 321
November 14, 2021
*/

package lenstester;


public class LensTester {
    

    public static void main(String[] args) {
        
        // Creating Order 1. Standard lens with anti-reflective and anti-fog coatings.
        CartierEyeGlasses order1 = new StandardLens();
        order1 = new AntiReflective(order1);
        order1 = new AntiFog(order1);
        
        // Printing Order 1
        System.out.println("ORDER 1");
        System.out.println("------------------");   // Formatting
        System.out.println(order1.toString());      // Print Order 1 Description
        System.out.println("------------------\n\n");  // Formatting
        
        
        // Creating Order 2. High-index lens with anti-scratch, anti-reflective, 
        // anti-fog, and UV protection.
        CartierEyeGlasses order2 = new HighIndexLens();
        order2 = new AntiScratch(order2);
        order2 = new AntiReflective(order2); // Wrapping Base with AntiReflective Dec.
        order2 = new AntiFog(order2);        // Wrapping Base with AntiFog Dec.
        order2 = new UVProtection(order2);   // Wrapping Base with UV Protection Dec.
        
        // Printing Order 2
        System.out.println("ORDER 2");
        System.out.println("------------------");  // Formatting
        System.out.println(order2.toString());     // Print Order 2 Description.
        System.out.println("------------------\n\n");  // Formatting
        
        
        // Creating Order 3. A polycarbonate lens with UV protection and lens tint.
        CartierEyeGlasses order3 = new PolyCarbonateLens();
        order3 = new UVProtection(order3);
        order3 = new Tint(order3);
        
        // Printing Order 3 
        System.out.println("ORDER 3");
        System.out.println("------------------");   // Formatting
        System.out.println(order3.toString());      // Print Order 1 Description
        System.out.println("------------------\n\n");  // Formatting
           
    }
    
}
