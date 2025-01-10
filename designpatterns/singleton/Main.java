package designpatterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton ins1 = Singleton.getInstance();
        System.out.println(ins1.hashCode());

       /* Singleton ins2=(Singleton) ins1.clone();
        System.out.println(ins2.hashCode());*/
        Singleton refInstance=null;
       Constructor constructor[] =Singleton.class.getDeclaredConstructors();
       for(Constructor c: constructor)
       {
           c.setAccessible(true);
           refInstance=(Singleton) c.newInstance();
       }
        System.out.println(refInstance.hashCode());
    }

}
