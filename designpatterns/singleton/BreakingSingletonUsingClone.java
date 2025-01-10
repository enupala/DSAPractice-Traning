package designpatterns.singleton;

public class BreakingSingletonUsingClone implements Cloneable{
    @Override
   public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
