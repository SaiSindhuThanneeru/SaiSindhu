import java.util.*;
public class Polymain {
    public static void gethobbies(List<? extends Polygen> l){
        for(Polygen v:l){
            v.myhobby();
        }
    }

    public static void main(String[] args) {
        List<Cat> l1=new ArrayList<Cat>();
        l1.add(new Cat());

        List<Dog> l2=new ArrayList<Dog>();
        l2.add(new Dog());
        

        gethobbies(l1);
        gethobbies(l2);
    }
}
