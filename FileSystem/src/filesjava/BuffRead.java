package filesjava;
import java.io.*;
public class BuffRead {
    public static void main (String[] args) throws Exception {
        FileReader f=new FileReader("javafile1.txt");
        //few chars are read from disk & stored in internal buffer, hence reading becomes faster than
        //filereader
        BufferedReader bf=new BufferedReader(f);
        while(bf.ready()){
            System.out.println(bf.readLine());//reads content from specified file
        }


    }
}
