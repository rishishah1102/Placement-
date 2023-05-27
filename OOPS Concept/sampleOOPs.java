package OOPS;
class Pen {
    // The below are called the properties of class
    String colour;
    String type;

    // We can also define the method/functions of a class
    public void write() {
        System.out.println("Writing something...\n");
    }

    public void printColour() {
        System.out.println(this.colour);
    }

    // Types of constructors
    Pen() {
        System.out.println("\nNon-Parameterised Constructor");
    }

    Pen(String colour, String type) {
        System.out.println("\nParameterised Constructor");
        this.colour = colour;
        this.type = type;
    }

    Pen(Pen p) {
        System.out.println("\nCopy Constructor copys the data of one object into another");
        this.colour =  p.colour;
        this.type = p.type;
    }
    
}

public class sampleOOPs {
    public static void main(String[] args) {
        
        // Below new is used which creates a heap memory and Pen() is the constructor. In java there is non parameterised constructor by default. If we define our own non parameterised constructor than java will take it.
        Pen p1 = new Pen();
        p1.colour = "blue";
        p1.type = "gel";
        
        p1.printColour();
        p1.write();

        Pen p2 = new Pen("black", "ballpoint");

        p2.printColour();
        p2.write();

        Pen p3 = new Pen(p2);

        p3.printColour();
        p3.write();

        // There are also destructors in java but they are inbuilt and we dont need to define it. In java there are also garbage collectors which keeps track of unused properties and methods and it automatically deletes it.
        
    }
    
}