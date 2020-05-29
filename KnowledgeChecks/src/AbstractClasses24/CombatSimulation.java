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
       // System.out.println(cecil.getArmor());

        Paladin caliban = new Paladin("Caliban");

        System.out.println(compareTest(cecil, caliban));
        caliban.setArmorBase(4);
        System.out.println(compareTest(cecil, caliban));
    }


    public static int compareTest(Comparable one, Comparable two) {
        return one.compareTo(two);
    }
}
