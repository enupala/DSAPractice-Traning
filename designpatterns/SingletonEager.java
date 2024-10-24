package org.example.practice2.designpatterns;

//using lazy loading
/*
public class SingletonLazy {
    private SingletonLazy(){}
    private static SingletonLazy instance;
    public static SingletonLazy getInstance(){
        if(instance==null)
        {
            instance= new SingletonLazy();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingletonLazy instance1=SingletonLazy.getInstance();
        System.out.println(instance1);

        SingletonLazy instance2=SingletonLazy.getInstance();
        System.out.println(instance2);
    }


}
*/
//Eager loading
/* class SingletonEager {
    private SingletonEager(){}
    private static SingletonEager instance=new SingletonEager();
    public static SingletonEager getInstance(){

        return instance;
    }

    public static void main(String[] args) {
         SingletonEager instance1=SingletonEager.getInstance();
        System.out.println(instance1);

        SingletonEager instance2=SingletonEager.getInstance();
        System.out.println(instance2);
    }


}*/
//on multithreaded env using synchronized block
/*
class SingletonEager{
    private SingletonEager(){}
    private static SingletonEager instance;
    public static SingletonEager getInstance(){
        if(instance==null)
        {
            synchronized (SingletonEager.class){
                if(instance==null)
                    instance=new SingletonEager();
            }

        }
        return  instance;
    }

    public static void main(String[] args) {
        SingletonEager instance1=SingletonEager.getInstance();

        System.out.println(instance1);

        SingletonEager instance2=SingletonEager.getInstance();
        System.out.println(instance2);
    }

}
*/
//using Synchronized method on multithreaded env
class SingletonEager{
    private SingletonEager(){}
    private static SingletonEager instance;

    public static synchronized SingletonEager getInstance(){
        if(instance==null)
            instance=new SingletonEager();
        return instance;

    }

    public static void main(String[] args) {
        SingletonEager instance1=SingletonEager.getInstance();
        System.out.println(instance1);
        SingletonEager instance2=SingletonEager.getInstance();
        System.out.println(instance2);
    }
}
