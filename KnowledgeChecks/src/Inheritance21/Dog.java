package Inheritance21;

/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class Dog extends Animal{

    public boolean playFetch() {
        return true;
    }

    public Dog() {
        this.says = "Woof";
    }

    public Dog(String name) {
        super(name);
        this.says = "Woof";
    }
}
