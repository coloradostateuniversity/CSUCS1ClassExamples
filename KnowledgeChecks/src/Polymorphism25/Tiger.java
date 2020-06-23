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
    
    public String toString() {
        return String.format("swimSpeed:%s, stripCount:%s", 
                getSpeed(), getStripCount());
    }

    public int getStripCount() {
        return stripCount;
    }

    public static void main(String[] args) {
        Tiger tony = new Tiger();
        Feline felix = new Feline();
        
        AbstractAnimal a = felix;
        Object catlike3 = tony;
        
        System.out.println(felix);
        System.out.println(tony);
        System.out.println(a);
        System.out.println(catlike3);
        
        


    }

}
