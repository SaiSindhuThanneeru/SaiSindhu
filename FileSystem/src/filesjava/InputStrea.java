package filesjava;
import java.io.*;
public class InputStrea {
    public static void main(String[] args) {
        try{
            FileInputStream fis=new FileInputStream("javafile1.txt");
            System.out.println("data in the mentioned file is: ");
            //reading first byte
            int i=fis.read();
            while(i!=-1)
            {
                System.out.print((char) i);//typecasting to char
                //reading next byte from file
                i=fis.read();
            }
            fis.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
