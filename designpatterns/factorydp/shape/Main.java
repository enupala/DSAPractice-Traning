package org.example.practice2.designpatterns.factorydp.shape;

public class Main {
    public static void main(String[] args) {
        ShapeMain s=new ShapeMain();
        Shape shape=s.getShape("circle1");
        shape.shape();
        Shape shape1=s.getShape("Rectangle2");
        shape1.shape();
    }
}
