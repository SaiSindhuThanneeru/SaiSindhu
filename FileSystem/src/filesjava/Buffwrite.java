package filesjava;
import java.io.*;
public class Buffwrite {
    public static void main(String[] args) throws Exception {
        FileWriter fw=new FileWriter("javafile3.txt");
        //chars are written to internal buffer instead of disk
        BufferedWriter bw=new BufferedWriter(fw);
        //writing content
        bw.write("hi sindhuuu..");
        //giving new line in between
        bw.newLine();

        bw.write("this is 3rd file.");
        bw.close();
        System.out.println("Contetn written");

        System.out.println("File Content is ");
        FileReader f=new FileReader("javafile3.txt");
        BufferedReader bf=new BufferedReader(f);
        while(bf.ready()){
            System.out.println(bf.readLine());//reads content from specified file
        }
    }
}
