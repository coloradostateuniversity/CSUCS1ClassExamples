package Strings04;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class StringFormat {

    public static String formatterA(double val) {
        return String.format("%.2f%%, %d", val, (int)val);
    }

    public static String formatterB(String str) {
        char tmp = str.charAt(0);
        return String.format("%S %s %C %c", str, str, tmp, tmp);

    }

        public static String formatterC(String str, int d) {
            return String.format("%" + d + "s", str);
        }

    public static void main(String[] args) {
        System.out.println(formatterA(1/3.0));  // Line 1
        System.out.println(formatterA(1.1)); // line 2

        System.out.println(formatterB("Destreza"));  // line 1
        System.out.println(formatterB("aggripa"));  // line 2

        System.out.println(formatterC("Monkey", 10));
        System.out.println(formatterC("Monkey", 3));

    }


}
