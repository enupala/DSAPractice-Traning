package catchITProblems.ocp;

public class Rectangle implements Shape{
    int width;
    int ht;

    public  Rectangle(int width,int ht){
        this.width=width;
        this.ht=ht;
    }
    @Override
    public double calculateArea(){
        return ht*width;
    }


}
