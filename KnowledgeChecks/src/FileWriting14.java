import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Knowledge Check: 14 - File Writing
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class FileWriting14 {
    private final PrintWriter writer;


    private void runExample() {
        System.out.println("This is a file writing example"); // line 1
        for(int i = 0; i < 10; i++) {
            writer.print(i); // line 2
        }
        writer.println();
        System.out.printf("Formatted strings are, %s", "cool"); // line 3
        boolean isCool = true;
        writer.printf("Is formatting cool?  %b", isCool); // line 4
        writer.close();
        System.out.close();
    }

    public FileWriting14(String filename) throws IOException {
        writer = new PrintWriter(new File(filename));
    }

    public static void main(String[] args) {
        try {
            FileWriting14 writer = new FileWriting14(args[0]);
            writer.runExample();
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
