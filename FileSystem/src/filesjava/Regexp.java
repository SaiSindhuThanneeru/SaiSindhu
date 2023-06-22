package filesjava;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Regexp {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String k=sc.nextLine();
        String r="^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@"+
                "(?:[a-zA-Z0-9-]+\\.)+[a-z"+
                "A-Z]{2,7}$";
        Pattern p=Pattern.compile(r);
        Matcher m=p.matcher(k);
        if(m.find())
            System.out.println("Valid match");
        else
            System.out.println("Invalid match");
        // five letter string starts with 'a' and ends with 's'
        String reg1 = "^a...s$";

        System.out.println("alias".matches(reg1)); // true
        System.out.println("a tajmahal".matches(reg1)); // false
        //search pattern for numbers
        String reg2 = "^[0-9]+$";

        System.out.println("123a".matches(reg2)); // false
        System.out.println("98416".matches(reg2)); // true

        System.out.println(Pattern.matches(
                "saisin+dhu", "saisinnndhu"));

        System.out.println(
                Pattern.matches("s*indhu*", "sindhu"));


    }
}