package designpatterns.SingletonBreaking;

public class CloneableClass implements Cloneable{
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
