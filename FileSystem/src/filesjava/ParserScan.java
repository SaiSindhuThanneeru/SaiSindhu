package filesjava;
import java.util.Scanner;
public class ParserScan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter full name");
        String m=sc.nextLine();//full line is considered

        System.out.println("Enter rollnumber");
        int a=sc.nextInt();

        System.out.println("Enter Department code");
        String k=sc.next();//after space text is not considered




        System.out.println("My name is "+m+" my rollnumber is "+a+" my class is "+k);
    }
}
