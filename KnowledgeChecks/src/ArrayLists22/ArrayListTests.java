package ArrayLists22;

import java.util.ArrayList;

/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class ArrayListTests {

    public static void main(String[] args){
        ArrayList<Object> array = new ArrayList<>();
        array.add("Frederic");
        array.add(1.0);
        array.add(3);
        array.set(0, "Claudia");
        array.remove(1);
        System.out.println(array.size());
        // Prints: [First_Line]
        System.out.println(array.get(1));
        // Prints: [Second_Line]
        System.out.println(array.indexOf("Claudia"));
        // Prints: [Third_Line]
        int val = (Integer)array.get(1);
        System.out.println(val == 3);
        // Prints: [Fourth_Line]
        array.clear();
        System.out.println(array.size());
        // Prints: [Fifth_Line]
    }
}
