package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Square;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        Shape square = new Square(2);
        Shape rectangle = new Rectangle(2,21);

        Renderer cir = new Renderer(circle);
        Renderer squ = new Renderer(square);
        Renderer rec = new Renderer(rectangle);

        cir.draw();
        squ.draw();
        rec.draw();
    }
}
