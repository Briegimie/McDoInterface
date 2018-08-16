package Model;



/**
 * 
 */
public interface Item {

    /**
     * @return
     */
	public String orderId();
	public String name();

    /**
     * @return
     */
    public Packing packing();

    /**
     * @return
     */
    public float price();

}


