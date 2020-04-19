package Inheritance21;

/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class Tests {


    public static void main(String[] args) {
        Animal[] zoo = new Animal[4];
        zoo[0] = new Animal("Brother Bear");
        zoo[1] = new Dog("Nita");
        zoo[2] = new Cat("Cattivo");
        zoo[3] = new Fox();

        System.out.println(zoo[0]); // line 1
        System.out.println(zoo[1]); // line 2
        System.out.println(zoo[2]); // line 3
        System.out.println(zoo[3]); // line 4

    }
}
