package MoreArrays19;

import java.util.Arrays;

/**
 * Knowledge Check 19
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Arrays2D {

    public int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};


    public void swapper(){
        for(int i = 0; i < matrix.length; i++) {
            for(int j =i; j< matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    // prints out array in format [[1,2,3],[4,5,6],[7,8,9]]
    public String render() {
        StringBuilder builder = new StringBuilder();
        for(int[] row : matrix) {
            builder.append(Arrays.toString(row));
            builder.append("\n");
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        Arrays2D a2d = new Arrays2D();
        System.out.println(a2d.render());  // line 1
        a2d.swapper();
        System.out.println(a2d.render());

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9,10,11}};
        System.out.printf("%s, %d", Arrays.toString(matrix[1]), matrix[2].length);
    }
}
