package filesjava;
import java.io.*;
public class SimpleFile {
    public static void main(String[] args) {
        //creating file
        try
        {
            File f=new File("javafile6.txt");
            if(f.createNewFile())
            {
                System.out.println("Created a new file");
            }
            else
            {
                System.out.println("File already exists");
            }
            String path=f.getAbsolutePath();
            System.out.println("FilePath is: "+path);
            //listing all files
            File f1=new File("C:\\Users\\sthanneeru\\IdeaProjects\\FileSystem");
            File[] ff=f1.listFiles();
            System.out.println("Listing all files");
            for(int i=0;i<ff.length;i++)
            {
                System.out.println(ff[i].getName());
            }
            //renaming file
            File m=new File("javafile6.txt");
            File n=new File("Empty.txt");
            if(m.renameTo(n)){
                System.out.println("renamed file successfully");
            }
            else {
                System.out.println("Failed to rename");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
