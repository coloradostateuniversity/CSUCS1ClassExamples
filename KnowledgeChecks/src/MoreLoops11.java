/**
 * More Loops Knowledge Check Problems
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class MoreLoops11 {

    public static void threeLoops() {
        int value = 0;
        StringBuilder build = new StringBuilder();
        do {
            build.append(value++);
        }while(value++ < 10);
        System.out.println(build.toString()); // line 1

        String motto = "What's the motto with you?";
        String motto2 = motto;
        while(motto2.contains("motto")) {
            motto2 = motto.replace("motto", "matter");
        }
        System.out.println(motto2.equalsIgnoreCase(motto)); // line 2

        String count = "0123456789";
        int counter = 0;
        for(int i = 0; i < count.length(); i++) {
            int tmp = Character.digit(count.charAt(i), 10); // converts character to int
            if(tmp % 2 == 0) counter++;
        }
        System.out.println(counter); // line 3
    }

    public static void nestedLoops() {
        for(int i = 1; i <= 3; i++) {
            String tmp = "";
            for(int j = i*2; j < 10; j++) {
                tmp += j + ","; // line 1, line 2, line 3
            }
            System.out.println(tmp.substring(0, tmp.length()-1));
        }
    }

    public static String breakIt(String value) {
        String temp = "";
        for(int i = 0; i < value.length(); i++) {
            temp += value.charAt(value.length()-(i+1));
            if(temp.length() <= value.length()/2) continue;
            if(value.contains(temp)) break;
        }
        return temp;

    }

    public static void main(String[] args) {
        threeLoops();
        System.out.println();
        nestedLoops();
        System.out.println(breakIt("kinnikinnik"));
        System.out.println(breakIt("sotorotos"));
        System.out.println(breakIt("annlee"));
    }
}
