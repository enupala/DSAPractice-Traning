package designpatterns.singleton;

public class Singleton extends BreakingSingletonUsingClone{
    private static Singleton instance;
    private Singleton(){
        if(instance!=null)
            throw new IllegalArgumentException("Object cant be created using reflection");
    }
    @Override
   public Object clone() throws CloneNotSupportedException {
        return  new CloneNotSupportedException();
    }
    public static Singleton getInstance(){
        if(instance==null)
        instance=new Singleton();

        return instance;
    }
}