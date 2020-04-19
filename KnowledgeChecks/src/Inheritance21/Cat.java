package Inheritance21;

/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class Cat  extends Animal{

    public boolean hasRetractableClaws() {
        return true;
    }

    public Cat(String name) {
        super(name);
        says = "Meow";
    }
}
