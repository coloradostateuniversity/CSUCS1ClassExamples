package IntroToRecursion20;

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 1.0
 */
public class IntroRecursionMethods {

    public static void myMethod(int n) {
        System.out.print(n + " ");
        if (n == 1)
            return;
        if (n % 2 == 0)
            myMethod(n / 2);
        else
            myMethod(2*n + 2);
    }

    public static String stringManipulator(String str) {
        if (str.isEmpty()) return str;
        return stringManipulator(str.substring(1)) + str.charAt(0);
    }

    public static boolean stringCheck(String s) {
        if(s.length() <= 1) // 0 or 1
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))  // only call if they are the same
            return stringCheck(s.substring(1, s.length()-1));
        return false;
    }

    public static void main(String[] args) {
        myMethod(8);
        System.out.println(stringManipulator("occioa"));
        System.out.println(stringCheck("satoxrotas"));

    }


}
