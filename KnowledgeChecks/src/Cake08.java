/**
 *
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Cake08 {
    public static boolean EAT_IT = true;
    private String name;
    private double cost;

    public Cake08() {
        this("Chocolate", 0.0);
    }

    public Cake08(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    public boolean getEat() {return EAT_IT;}

    public void setEat(boolean eat) { EAT_IT = eat; }

    public void setName(String str) {
        name = str;
    }
    public String getName() {
        return name;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    public double getCost() {
        return this.cost;
    }

    public static void updatePrice(Cake08 cake, double priceModification) {
        cake.setCost(cake.getCost() + priceModification);
    }

    public static void funWithNames(Cake08 cake, String owner) {
        cake.setName(String.format("%s's %s", owner, cake.getName()));
    }

    public static void main(String[] args) {
        Cake08 coconut  = new Cake08("Coconut", 1.0);
        Cake08 chocolate = new Cake08();
        System.out.println(coconut.getCost()); // line 1
        updatePrice(coconut, 5.0);
        System.out.println(coconut.getCost()); // line 2
        funWithNames(coconut, chocolate.getName());
        System.out.println(coconut.getName()); // line 3
        chocolate.setCost(100);
        System.out.println(chocolate.getCost()); // line 4
        coconut.setEat(false);
        System.out.println(chocolate.getEat());  // line 5


    }

}
