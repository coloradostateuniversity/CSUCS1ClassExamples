import java.util.Scanner;

/**
 * Code used in the Knowledge Check for reading 02
 *
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 1.0
 */
public class PuppyClassic02 {

    public static void main(String[] args) {
        String name = "Cerberus";
        int puppyCounter = 10;
        puppyCounter = puppyCounter + 10/3;
        System.out.println(name);  // line 1
        System.out.println(puppyCounter); // line 2
        System.out.print(name + " has how many heads? ");
        double heads = 3;
        System.out.println(heads + "heads"); // line 3
        boolean isCool = true;
        System.out.println(name + " is " + isCool); // line 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many heads again? ");
        double dbl = scanner.nextDouble();  // assume 3 is entered
        System.out.println(dbl); // line 5
    }

}
