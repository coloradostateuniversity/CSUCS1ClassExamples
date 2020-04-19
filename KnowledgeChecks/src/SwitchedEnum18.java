/**
 * Code used in Switches and Enumerations Knowledge Check: 18
 *
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class SwitchedEnum18 {

        public enum Roles {
            ADMIN, CLIENT, EDITOR, OWNER, UNKNOWN
        }

        public static void similarSwitchTest() {
                int i1 = 11, i2 = 6;
                char c0 = '$', c1 = 'e', c2 = 'x', c3 = '9';
                boolean b0 = (i2 >= i1);

                if(b0)
                    c3 = '5';
                else
                    c3 = '7';
                i1--;

                switch (c3){
                    case '5': c0 = '#'; c1='q'; i1 = i1/2; break;
                    case '7': c0 = '$'; c1='r'; i2 = i2/2; break;
                    case '9': c0 = '%'; c1='s'; break;
                }

                System.out.println(b0); // Line 1
                System.out.println(c0); // Line 2
                System.out.println(c2); // Line 3
                System.out.println(i2); // Line 4
                System.out.println(i1); // Line 5


        }
        public static void switchTest(){
            int i1 = 10, i2 = 5;
            char c0 = '*', c1 = 'd', c2 = 'z', c3 = '8';
            boolean b0 = (i2 >= i1);

            if(b0)
                c3 = '4';
            else
                c3 = '6';
            i1--;

            switch (c3){
                case '4': c0 = '%'; c1='n'; i1 = i1/2; break;
                case '6': c0 = '$'; c1='m'; i2 = i2/2; break;
                case '8': c0 = '#'; c1='q'; break;
            }

            System.out.println(b0); // Line 1
            System.out.println(c0); // Line 2
            System.out.println(c2); // Line 3
            System.out.println(i2); // Line 4
            System.out.println(i1); // Line 5
        }


        public static String getAccessPermissions(Roles role) {
            String permissions = "";
            switch(role) {
                case OWNER:
                    permissions += "ch";
                case ADMIN:
                    permissions += "x";
                case EDITOR:
                    permissions += "w";
                case CLIENT:
                    permissions += "r";
                    break;
                default:
                    permissions = "no-access";
            }
            return permissions;

        }

        public static void main(String[] args) {
            switchTest();

            System.out.println(getAccessPermissions(Roles.CLIENT));
            System.out.println(getAccessPermissions(Roles.ADMIN));
            System.out.println(getAccessPermissions(Roles.UNKNOWN));


            similarSwitchTest();
    }


}
