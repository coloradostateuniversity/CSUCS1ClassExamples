package AbstractClasses24;

/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class Paladin extends AbstractJob implements MeleeType, HealerType, Comparable<Paladin> {
    private double modifier = 1.6;

    @Override
    double getJobModifier() {
        return modifier;
    }

    public Paladin(String name) {
        super(name);
    }

    @Override
    public double getCureModifier() {
        return 1.5;
    }

    @Override
    public double getMP() {
        return 10.5;
    }

    @Override
    public boolean hasSwordAttack() {
        return true;
    }

    @Override
    public double calcSwordDamage() {
        return (100*getAttack());
    }

    @Override
    public int compareTo(Paladin o) {
        if(this.getArmor() > o.getArmor()) {
            return 1;
        }else if(this.getArmor() < o.getArmor()) {
            return -1;
        }else {
            return 0;// this.name.compareTo(o.name);
        }
    }
}