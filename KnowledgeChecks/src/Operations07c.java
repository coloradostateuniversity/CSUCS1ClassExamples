/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class Operations07c {

    public static int d6(int value) {
        return value % 6;
    }


    public static int d10(int value) {
        return value % 10;
    }

    public static int d20(int value) {
        return value % 20;
    }

    public static void values() {
        String doc = "Doctor";
        doc += "Who";
        int val = 10;
        val += 3;

        System.out.println(doc);    // line 1
        System.out.println(val);    // line 2
        System.out.println(++val);   // line 3
        doc += val--;
        System.out.println(doc);  // line 4
    }

    public static void main(String[] args) {
        System.out.println(d6(13));  // print 1
        System.out.println(d10(10));  // print 2
        System.out.println(d20(0));  // print 3
        System.out.println(d10(17)); // print 4
    }

}
