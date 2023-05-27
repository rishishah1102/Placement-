package OOPS;

class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}

// Single Level Inheritance
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1 / 2) * b * h);
    }
}

// Multilevel Level Inheritance
class EquilateralTriangle extends Triangle {
    public void area(int r) {
        System.out.println((0.714) * r * r);
    }
}

// Hierarchical Level Inheritance
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

// Hybrid Level Inheritance

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(2, 4);
    }
}
