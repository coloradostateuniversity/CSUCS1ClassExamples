package Unit3Examples;

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Box {
    private int width;
    private int height;
    private int length;

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

    public int getArea() {
        return getHeight()*getLength()*getWidth();
    }

    @Override
    public String toString() {
        return String.format("Width: %d Height: %d Length: %d",
                getWidth(), getHeight(), getLength());
    }


    public Box(int width, int height, int length) {
        setHeight(height);
        setWidth(width);
        setLength(length);
    }


}
