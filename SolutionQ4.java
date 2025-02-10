
interface Shape {
    void draw(); 
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw a Rectangle");
    }
}

public class SolutionQ4 {
    public static void main(String[] args) {
        Shape shape1 = new Circle();
        Shape shape2 = new Rectangle();

        shape1.draw(); 
        shape2.draw(); 
    }
}
