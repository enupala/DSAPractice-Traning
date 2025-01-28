package org.example.practice2;

class Parent {
     void display() {
        System.out.println("Static method in Parent");
    }
}

class Child extends Parent {
   @Override
     void display() {
        System.out.println("Static method in Child");
    }
}

public class StaticOverride {
    public static void main(String[] args) {
        Parent p=new Parent();
        Child c=new Child();
        p.display(); // Output: Static method in Parent
        c.display();  // Output: Static method in Child
    }
}

