package Unit1Examples;

/**
 * Simple examples using different String methods
 */
public class SillyString {


    public static String businessCardNoFormat(String name) {
        return  "+==================================+\n" +
                "|  Round Table Enterprises         |\n" +
                "|                                  |\n" +
                "|            " + name +"  |\n" +
                "+==================================+";
    }

    public static String businessCardUsingFormat(String name) {
        return  "+==================================+\n" +
                "|  Round Table Enterprises         |\n" +
                "|                                  |\n" +
                String.format("|%33s |%n", name) +
                "+==================================+";
    }


    public static String percentNoFormat(double val) {
        return val + "%";
    }

    public static String percentFormat(double val) {
        return String.format("%.0f%%", val);
    }

    public static void main(String[] args) {
        String lancelot = "Lancelot of the Lake";
        String bors = "Bors the Younger";
        String arthur = "Arthur Pendragon";

        System.out.println(businessCardNoFormat(lancelot));
        System.out.println(businessCardNoFormat(bors));
        System.out.println(businessCardUsingFormat(lancelot));
        System.out.println(businessCardUsingFormat(bors));
        System.out.println(businessCardUsingFormat(arthur));


        double value = (1 / 3.0) * 100;
        System.out.println(percentNoFormat(value));
        System.out.println(percentFormat(value));
    }

}
