/**
 * Subclass of Shoe. Used to describe "running shoes"
 */

// "extends" means that it is a subclass
public class OOP_Practice_Running extends OOP_Practice_Shoe {

    public final double weight;

    OOP_Practice_Running(double weight, String brand, double size) {

//        must create the Shoe object first to create Walking
        super(brand, size);
        this.weight = weight;
    }
}
