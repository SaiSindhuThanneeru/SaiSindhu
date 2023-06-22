package filesjava;
import java.io.*;
public class Filewrite {
    public static void main(String[] args) throws IOException{
        String str="Hey there, This is sindhu's file";
        try{
            FileWriter fw=new FileWriter("javafile2.txt");
            for(int i=0;i<str.length();i++)
            {
                fw.write(str.charAt(i));
            }
            System.out.println("Content Written Successfully");
            fw.close();
            //reading file contents
            System.out.println("File COntent is ");
            FileReader f=new FileReader("javafile2.txt");
            BufferedReader bf=new BufferedReader(f);
            while(bf.ready()){
                System.out.println(bf.readLine());//reads content from specified file
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
