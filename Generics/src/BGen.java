public class BGen <T extends Number>{
    T data;
    BGen(T data)
    {
        this.data=data;
    }
    public void display()
    {
        System.out.println("Data value: "+this.data);
    }
}
