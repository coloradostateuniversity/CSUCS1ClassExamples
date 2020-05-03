package AbstractClasses24;

import java.util.ArrayList;

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
abstract public class AbstractJob {
    private String name;
    protected ArrayList<Item> inventory = new ArrayList<>();

    private int armor;
    private int attack;

    abstract double getJobModifier(); // unique to sub classes

    public double getArmor() {
        // make other calculations based on inventory items
        return armor * getJobModifier();
    }

    public AbstractJob(String name) {
        this.name = name;
    }
}
