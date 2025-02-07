package catchITProblems.srp;

public class Main {
    public static void main(String[] args) {
        Workable robot=new Robot();
        robot.work();
        Eatable eatable=new Worker();
        eatable.eat();
        Workable worker=new Worker();
        worker.work();

    }
}
