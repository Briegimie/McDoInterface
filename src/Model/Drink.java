package Model;



/**
 * 
 */
public abstract class Drink implements Item {

    /**
     * Default constructor
     */
    public Drink() {
    }

    /**
     * @return
     */
    public String name() {
        // TODO implement here
        return "";
    }
    public String orderId() {
        // TODO implement here
        return "";
    }

    @Override
    public Packing packing() {
        
        return new Bottle();
    }

    @Override
    public abstract float price();

}