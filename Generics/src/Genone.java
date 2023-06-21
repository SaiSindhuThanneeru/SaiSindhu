public class Genone<T,U> {


    public  <E> void printel(E[] o1,E[]  o2)
    {
        for(E el: o1)
        {
            System.out.print(el+" ");
        }
        System.out.println();
        for(E el: o2)
        {
            System.out.print(el+" ");
        }
        System.out.println();
    }

}
