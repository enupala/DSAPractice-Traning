package designpatterns.factorydp;

public class FactoryMain {
    public OS getOs(String s){
        if(s.equals("Open"))
           return new Android();
        else if(s.equals("closed"))
            return new IOS();
        else
            return  new Windows();

    }
}
