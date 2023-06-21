public class GenoneMain {
    public static void main(String[] args) {

        Genone<Integer,String> s2=new Genone<Integer,String>();
        Integer[] arr={1,2,3,4,5};
        System.out.println("Printing Int Array");
        Character c[]={'s','a','i'};
        System.out.println("Printing Char Array");
        s2.printel(arr,c);

    }
}
