package Unit3Examples;

import java.util.Arrays;

/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class Arrays2D {

    public static String[] foreachExample() {
        String[] values = new String[2]; // string array!
        values[0] = "Fib:";
        values[1] = "Fib:";
        int[] arr = {1,1,2,3,5,8,13,21};

        for(int i =0; i<arr.length; i++) {
            int ar = arr[i];
            values[0] += ar;
        }

        for(int ar : arr) {
            values[1] += ar;
        }

        return values;
    }

    public static void twoDArrays(int size) {
        char[][] matrix = new char[size][size];
        char start = 'A';
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                matrix[i][j] += (char) (start+j);
            }
            start = (char)(matrix[i][size-1]+1); // grab last in the last part
        }
        for(char[] row : matrix) {
            for(char col : row) {
                System.out.print(col);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(foreachExample()));
        twoDArrays(3);
    }



}
