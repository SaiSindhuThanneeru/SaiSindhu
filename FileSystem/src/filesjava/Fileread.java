package filesjava;
import java.io.*;
//filereader class used to read data from file, returns in byte format
public class Fileread {
    public static void main(String[] args) {
        char[] arr=new char[50];
        try{
            FileReader i=new FileReader("javafile1.txt");
            //passing array to read characters
            i.read(arr);
            System.out.println("Contents of the file: ");
            System.out.println(arr);

            i.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
