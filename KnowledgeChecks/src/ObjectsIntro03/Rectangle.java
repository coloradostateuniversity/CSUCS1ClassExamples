package ObjectsIntro03;

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Rectangle {
    private int width;
    private int length;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea() {
        return length * width;
    }


    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }


    public static void main(String[] args) {
        int width = 10;
        Rectangle frame = new Rectangle(width, 12);
        System.out.println(frame.getWidth()); // Print 1
        width = 12;
        System.out.println(frame.getWidth()); // Print 2
        Rectangle silverFrame = new Rectangle(width, 5);
        System.out.println(silverFrame.getLength()); // Print 3
        frame.setLength(10);
        System.out.println(silverFrame.getLength());  // Print 4
        silverFrame.setLength(10);
        System.out.println(silverFrame.getArea());  // print 5
    }
}
