package Model;



/**
 * 
 */
public abstract class Burger implements Item {

    /**
     * Default constructor
     */
    public Burger() {
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
        // TODO implement here
        return new Wrapper();
    }

    @Override
    public abstract float price();

}