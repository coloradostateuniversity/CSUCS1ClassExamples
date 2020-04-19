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
    public static String STORE ="Big Box Store";

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

    public int getArea(){
        return getHeight()*getLength()*getWidth();
    }

    public Box(int width, int height, int length) {
        setHeight(height);
        setWidth(width);
        setLength(length);
    }

    public Box(int cubed) {
        setHeight(cubed);
        setWidth(cubed);
        setLength(cubed);
    }

    public static int calcArea(int length, int width, int height) {
        return length*width*height;
    }



}
