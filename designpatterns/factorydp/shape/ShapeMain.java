package org.example.practice2.designpatterns.factorydp.shape;

public class ShapeMain {
    public Shape getShape(String s)
    {
        if(s.equals("circle"))
            return new Circle();
        else if(s.equals("square"))
            return new Square();
        else
            return new Rectangle();
    }
}
