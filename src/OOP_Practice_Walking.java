/**
 * Subclass of Shoe. Used to describe "Walking shoes"
 */

// "extends" means that it is a subclass
public class OOP_Practice_Walking extends OOP_Practice_Shoe {

    public final boolean goreTex;

    OOP_Practice_Walking(boolean goreTex, String brand, double size) {

//        must create the Shoe object first to create Walking
        super(brand, size);
        this.goreTex = goreTex;
    }
}
