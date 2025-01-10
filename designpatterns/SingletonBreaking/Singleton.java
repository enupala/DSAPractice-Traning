package designpatterns.SingletonBreaking;

public class Singleton extends CloneableClass{
    private static Singleton instance;
    private Singleton(){}
    public static Singleton  getInstance(){
        if(instance==null)
            instance=new Singleton();
        return instance;
    }
}
