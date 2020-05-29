package SupportClasses07a;

/**
 * Example class that will not compile by itself due to overwriting a final variable
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Hero {
    public static final String LEAGUE = "HERO";

    public String powerLookup(int which) {
        String rtn = LEAGUE + ": Flight";

        if (which < 0) {
            rtn = LEAGUE + ": Laser Eyes"; 
        }

        return rtn;
    }
}