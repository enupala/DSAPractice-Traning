package catchITProblems.ocp;

public interface Shape {
    double calculateArea();
     default void display(){
        System.out.println("its a default method "+calculateArea());
    }
}
