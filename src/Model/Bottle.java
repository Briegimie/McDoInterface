package Model;



/**
 * 
 */
public class Bottle implements Packing {

    /**
     * Default constructor
     */
    public Bottle() {
    }

    @Override
    public String pack() {
        return "Bottle";
    }

}