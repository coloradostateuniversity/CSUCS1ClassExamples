package Polymorphism25;

/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class Tiger extends Feline implements Swimmer{
    private int swimSpeed = 12;
    private int stripCount = 100;

    @Override
    public int getSpeed() {
        return swimSpeed;
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    public int getStripCount() {
        return stripCount;
    }

    public static void main(String[] args) {
        Tiger tony = new Tiger();
        boolean isFeline = tony instanceof Feline;


    }

}
