package Inheritance21;

/**
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Animal {

    private String name;
    protected String says = "UNKNOWN";

    public String getName() {
        if(hasName()) {
            return name;
        }
        return "The " + this.getClass().getSimpleName(); // return simple name of instance class
    }

    protected String getSays() {
        return says;
    }

    private boolean hasName() {
        return name != null && !name.isEmpty();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("%s says %s", getName(), says);
    }
    public Animal() {}

    public Animal(String name) {
        this();
        setName(name);
    }

}
