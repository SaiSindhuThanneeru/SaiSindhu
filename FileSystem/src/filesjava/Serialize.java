package filesjava;
import java.io.*;

class Serialize {
    public static void main(String[] args) {


        String d2 = "HI , iam Sai Sindhu";

        try {

            FileOutputStream f = new FileOutputStream("Empty.txt");

            ObjectOutputStream oos = new ObjectOutputStream(f);
            //serializing

            oos.writeObject(d2);

            // Reading data using the ObjectInputStream
            FileInputStream fs = new FileInputStream("Empty.txt");
            ObjectInputStream os = new ObjectInputStream(fs);
            //deserializing

            System.out.println("String data: " + os.readObject());

            oos.close();
            os.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}
