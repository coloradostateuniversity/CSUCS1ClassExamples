package MoreClasses17;

/**
 * Knowledge Check 17 - support classes
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Box {
    public static String store ="Big Box Store";

    int width;
    int height;
    int length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String value) {
        store = value;
    }

    public int getArea(){
        return calcArea(getLength(),getWidth(),getHeight());
    }

    public Box(int width, int height, int length) {
        setHeight(height);
        setWidth(width);
        setLength(length);
        store = "Box Store";
    }

    public Box(int cubed) {
       this(cubed, cubed, cubed);
       store = "Big Cube Store";
    }

    public static int calcArea(int length, int width, int height) {
        return length*width*height;
    }


    public static void main(String[] args) {

        System.out.println(Box.store);   // line 1
        Box b1 = new Box(10, 2, 2);
        b1.setStore("Store");
        System.out.println(Box.store);   // line 2
        Box b2 = new Box(10);
        System.out.println(Box.store);   // line 3
        Box b3 = new Box(10,3,4);
        b3.setStore("Qubit");
        System.out.println(b1.getStore());   // line 4
    }
}
