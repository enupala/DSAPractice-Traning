package org.example.practice2.designpatterns.factorydp;

public class Main {
    public static void main(String[] args) {
        FactoryMain fm=new FactoryMain();
                OS os=fm.getOs("closed");
                os.spec();
        System.out.println(os);
    }
}
