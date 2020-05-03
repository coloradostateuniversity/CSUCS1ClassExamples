package Polymorphism25;

/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class Feline extends AbstractAnimal implements Climber {
    boolean clawsOut = false;

    @Override
    protected String getSound() {
        return "meow";
    }


    @Override
    public boolean hasRetractableClaws() {
        return true;
    }

    @Override
    public void climb() {
        // do some fancy stuff
        if(clawsOut) {
            System.out.println("climbing");
        } else{
            System.out.println("falling");
        }
    }

    public boolean toggleClaws() {
        clawsOut = !clawsOut;
        return clawsOut;
    }

}
