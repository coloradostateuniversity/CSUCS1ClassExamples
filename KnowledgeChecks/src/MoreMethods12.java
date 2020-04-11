/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class MoreMethods12 {

    public static String overloaded(int x) {
        return overloaded(x, "answer");
    }

    public static String overloaded(int x, String str) {
        return "The " + str + " is " + x;
    }


    public static void runTests() {
        assert overloaded(42).equals("The answer to the ultimate question of life the universe and everything is 42")
                :  "Assert Failed, the default case is wrong";
    }


    public static void main(String[] args) {
        System.out.println(overloaded(42, "question"));  // line 1
        System.out.println(overloaded(42)); // line two
        System.out.println();

        runTests();
        System.out.println(overloaded(42));

        System.out.println();
    }

}
