package designpatterns.factorydp;

public class Windows implements OS{
    @Override
    public void spec() {
        System.out.println("its window OS");
    }
}
