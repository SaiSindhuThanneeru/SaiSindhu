package filesjava;
import java.io.*;
public class OutputStream {
    public static void main(String[] args) {
        String s=" this is appended text from fileoutputstream";
        //Fileoutputstream helps to write data of raw bytes to file
        try {
            FileOutputStream fos = new FileOutputStream("javafile1.txt", true);
            //boolean is used to append data to file
            byte[] b=s.getBytes();
            //writing data to file after converting data to bytes

            fos.write(b);
            System.out.println("Content appended");
            fos.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
