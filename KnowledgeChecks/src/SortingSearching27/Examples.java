package SortingSearching27;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class Examples {


    public static int linearSearch(char key, char[] array) {
        for(int i = 0; i < array.length; i++) {
            if(key == array[i])  return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(linearSearch('n',
                new char[]{'k', 'i','n','n', 'i', 'k', 'i', 'n', 'n', 'i', 'k'}));



        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("awonder", "awonder@wonderland.colostate.edu");
        contacts.put("queen", "redqueen@wonderland.colostate.edu");
        contacts.put("hatter", "madhatter@wonderland.colostate.edu");
        System.out.println(contacts.get("queen")); // prints redqueen@wonderland.colostate.edu

    }

}
