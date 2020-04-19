package Unit3Examples;

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class IntroRecursion {

    public static String reverseString(String str) {
        return reverseString(str, str.length()-1);
    }

    public static String reverseString(String str, int index) {
        if(index < 0) return "";
        return str.charAt(index) + reverseString(str, index-1);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("arepO eht fo motnahP"));
    }
}
