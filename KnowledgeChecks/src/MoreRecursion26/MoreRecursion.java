package MoreRecursion26;

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class MoreRecursion {

    public static int factorial(int n) {
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }


}
