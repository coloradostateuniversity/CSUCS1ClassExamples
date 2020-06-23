package AbstractClasses24;


/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class CombatSimulation {


    public static void main(String[] args) {
        Paladin cecil = new Paladin("Cecil");
        Paladin caliban = new Paladin("Caliban");
        WhiteMage mage = new WhiteMage("Rosa");
        mage.setLevel(5);
        cecil.setLevel(2);
        System.out.println(cecil.getArmor());
        System.out.println(compareTest(cecil, caliban));
        caliban.setArmorBase(2);
        System.out.println(compareTest(cecil, caliban));
        System.out.println(mage.getCureModifier());
        System.out.println(mage.getArmor());
     

    }


    public static int compareTest(Comparable one, Comparable two) {
        return one.compareTo(two);
    }
}
