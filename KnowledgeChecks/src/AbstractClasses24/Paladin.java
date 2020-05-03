package AbstractClasses24;

/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class Paladin extends AbstractJob implements MeleeType, HealerType {
    private double modifier = 1.6;

    @Override
    double getJobModifier() {
        return modifier;
    }

    public Paladin(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Paladin cecil = new Paladin("Cecil");
        System.out.println(cecil.getArmor());

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
    public int calcSwordDamage() {
        return (int)(100*getJobModifier());
    }
}