package Unit3Examples;

/**
 * @author Albert Lionelle <br>
 *         lionelle@colostate.edu <br>
 *         Computer Science Department <br>
 *         Colorado State University
 * @version 202010
 */
public class SwitchStatements {


    public static String switchTest(String name){
        String faeType;
        switch(name) {
            case "dyson":
                faeType = "Werewolf";
                break;
            case "trick":
                faeType = "Sage";
                break;
            case "bo" :
            case "aife":
                faeType = "Succubus";
                break;
            case "hale":
                faeType = "Siren";
                break;
            case "vex":
                faeType = "Mesmer";
                break;
            default:
                faeType = "human";
        }
        return faeType;
    }

    public static void main(String[] args) {
        System.out.println(switchTest("vex"));
        System.out.println(switchTest("bo"));
    }
}
