package AbstractClasses24;

/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 20200622
 */
public class WhiteMage extends AbstractJob implements HealerType{
    private double modifier = 1;
    private double MP = 152;
    private double cureModifier = 10.0;

    public WhiteMage(String name) {
        super(name);
    }

    @Override
    double getJobModifier() {
        return modifier;
    }

    @Override
    public double getCureModifier() {
        return cureModifier * getLevel();
    }

    @Override
    public double getMP() {
        return MP;
    }
}
