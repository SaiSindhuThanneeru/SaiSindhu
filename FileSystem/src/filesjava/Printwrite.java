package filesjava;
import java.io.*;
public class Printwrite {
    public static void main(String[] args) throws Exception {
        //printwriter converts primitive data into text
       //printing output on console
        PrintWriter pw=new PrintWriter("javafile4.txt");
        //using print method to print data into file
        pw.print("hey sindhu, how you doing?");
        //printing in new line
        pw.println();
        pw.print(34);
        pw.println();
        pw.print('S');
        //adding char beside, using append method
        pw.append('a');
        pw.append('i');
        System.out.println("Content inserted into file");
        pw.close();


    }
}
