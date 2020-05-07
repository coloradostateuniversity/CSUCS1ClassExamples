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
    protected String name;

    private int armor = 1;
    private int attack = 1;

    abstract double getJobModifier(); // unique to sub classes

    public double getArmor() {
        // make other calculations based on inventory items
        return armor * getJobModifier();
    }

    public void setArmorBase(int val) {
        armor = val;
    }

    public double getAttack() {
        return attack * getJobModifier();
    }

    public void setAttackBase(int val) {
        attack = val;
    }

    public AbstractJob(String name) {
        this.name = name;
    }
}
