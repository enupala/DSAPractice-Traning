package catchITProblems.srp;

public class Worker implements Eatable,Workable{
    @Override
    public void eat() {
        System.out.println("worker is eating");
    }

    @Override
    public void work() {
        System.out.println("worker is working");
    }
}
