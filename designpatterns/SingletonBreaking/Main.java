package designpatterns.SingletonBreaking;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton ins1=Singleton.getInstance();
        System.out.println(ins1.hashCode());

        Singleton ins2=Singleton.getInstance();
        System.out.println(ins2.hashCode());

        Singleton ins3=(Singleton) ins2.clone();
        System.out.println(ins3.hashCode());
        Singleton RefInst=null;
        Constructor constructor[]=Singleton.class.getDeclaredConstructors();
        for(Constructor con : constructor)
        {
            con.setAccessible(true);//no private cons
           RefInst=(Singleton) con.newInstance();
        }
        System.out.println(RefInst.hashCode());

    }
}
