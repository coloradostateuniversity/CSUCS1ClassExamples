/**
 * @author Albert Lionelle <br> lionelle@colostate.edu <br> Computer Science Department <br> Colorado State University
 * @version 1.0
 */
public class LogicalOperators10 {





    public static boolean isLovecraftian(String value, int cultists) {
        if(value != null && value.length() < 10) {
            if(value.equalsIgnoreCase("ghast") ||
                    value.equalsIgnoreCase("cthulhu") ||
                    value.equalsIgnoreCase("dagon") ||
                    value.equalsIgnoreCase("mi-go")) {
                return true;
            }else return cultists < 100 && cultists > 10;

        } else if(value != null && value.length() > 10) {
            return (value.equalsIgnoreCase("Kassogtha") ||
                    value.equalsIgnoreCase("Shoggoth") ||
                    value.equalsIgnoreCase("Azathoth") ||
                    value.equalsIgnoreCase("Y’golonac") ||
                    value.equalsIgnoreCase("Yog-Sothoth") ||
                    value.equalsIgnoreCase("Nyarlathotep"));
        }
        return false;
    }



    public static final String SHELLEY = "Mary Shelley";
    public static final String ALLAN = "Allan Rune Pettersson";
    public static final String DOYLE = "Arthur Conan Doyle";

    public static String nameTheAuthor(String novel, int year) {
        if(year <= 1900 && (novel.contains("Frankenstein") ||
                novel.contains("Last")) ||
                novel.contains("Falkner")) {
            return SHELLEY;
        }else if (novel.contains("Frankenstein")) {
            return ALLAN;
        }else if(novel.contains("Lost") || novel.contains("Scarlet")) return DOYLE;
        return null;
    }


    public static final String TNG = "The Next Generation";
    public static final String DS9 = "Deep Space Nine";
    public static final String VOYAGER = "Voyager";

    public static String trek(String character) {
        if(character != null && (character.equalsIgnoreCase("Picard") ||
                                 character.equalsIgnoreCase("Data"))) {
            return TNG;
        } else if(character != null && character.contains("7")) {
            return VOYAGER;
        }else if((character.contains("Quark") || character.contains("Odo"))) {
            return DS9;
        }
        return null;
    }

   public static void main(String[] args) {
        System.out.println(isLovecraftian("Dracula", 3));   // line 1
        System.out.println(isLovecraftian("Nyarlathotep", 1000));  // line 2
        System.out.println(isLovecraftian("Unnamed", 20));  // line 3
        System.out.println(isLovecraftian("Beebo", 10));  // line 4
        System.out.println(isLovecraftian(null, 20));   // line 5
        System.out.println();

        System.out.println(nameTheAuthor("Frankenstein", 1818));   // line 1
        System.out.println(nameTheAuthor("The Last Man", 1826));    // line 2
        System.out.println(nameTheAuthor("The Lost World", 1912));   // line 3
        System.out.println(nameTheAuthor("Frankenstein's Aunt", 1900)); // line 4
        System.out.println(nameTheAuthor("A Study in Scarlet", 1886)); // line 5
       System.out.println();

       System.out.println(trek("Captain Picard")); // line 1
       System.out.println(trek("7 of Nine")); // line 2
       System.out.println(trek("Odo")); // line 3
       System.out.println(trek("Data").equalsIgnoreCase(TNG)); // line 4
       System.out.println(trek(null)); // line 5

    }




}
