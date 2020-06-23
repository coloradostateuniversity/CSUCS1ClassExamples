package AbstractClasses24;

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
abstract public class AbstractJob {
    protected String name;
    private static int jobCounter = 0;
    
    private int armor = 1;
    private int attack = 1;
    private int level = 1;
    

    abstract double getJobModifier(); 
    
    public static int getJobCounter() {
        return jobCounter;
    }
    public double getArmor() {
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

    public void setLevel(int lvl) {
        level = lvl;
    }
    
    public int getLevel() {
        return level;
    }


    public AbstractJob(String name) {
        this.name = name;
        jobCounter++;
    }
}
