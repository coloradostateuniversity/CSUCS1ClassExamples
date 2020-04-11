import SupportClasses07a.Hero;

/**
 *
 * Knowledge Check problems for FinalVariables. Not all knowledge checks include code, so this only includes the code
 * based ones.
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class FinalVariables07a {




    // question 1 - will this compile - includes code from support class
    public static void main(String[] args) {
        System.out.println(Hero.LEAGUE);
       // Hero.LEAGUE = "Villain"; // ERROR!! Won’t compile

        Hero ajax = new Hero(); // must build the object
        System.out.println(ajax.powerLookup(-1));
    }




}
