package Unit3Examples;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Cube extends Box{

    public Cube(int side) {
        super(side, side, side);
    }

    @Override
    public String toString() {
       return String.format("Side Length: %d Area: %d", getWidth(), getArea());
    }


    public static void main(String[] args) {
        Box bx = new Box(10, 12, 7);
        Cube cb = new Cube(5);

        ArrayList<Box> boxList = new ArrayList<>();

        boxList.add(new Box(10,3,4));
        boxList.add(new Cube(5));
        boxList.add(new Box(10,3,13));
        for(Box box : boxList) {
            System.out.println(box);
        }
        System.out.println(boxList.size());
        boxList.remove(2);
        System.out.println(boxList.size());

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(2);
        list.add(-1);

        int total = list.get(0) + list.get(1);
        System.out.println(total);

        System.out.println(bx);
        System.out.println(cb);

        Box[] boxes = new Box[2];
        boxes[0] = bx;
        boxes[1] = cb;
        System.out.println(Arrays.toString(boxes));


    }
}
