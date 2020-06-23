package Polymorphism25;
/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */



public abstract class AbstractAnimal {
    public enum Size {SMALL, MEDIUM, LARGE};
    public enum Habitat {LAND, WATER, AIR};

    abstract protected String getSound();

    private Size size = Size.MEDIUM;
    private Habitat habitat = Habitat.LAND;

    public Size getSize() { return size;}
    public void setSize(Size size) { this.size = size;}
    public Habitat getHabitat() { return habitat;}
    public void setHabitat(Habitat habitat) { this.habitat = habitat;}

    public String toString() {
        return String.format("size:%s, habitat:%s, sound:%s",
                getSize(), getHabitat(), getSound());
    }
    
}
