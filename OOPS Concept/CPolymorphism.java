package OOPS;

// This polymorphism is known as compile time polymorphism because it finds the error at the time of compiling.
class student {
    int no;
    String name;

    public void printInfo (String name) {
        System.out.println(name);
    }

    public void printInfo (int no) {
        System.out.println(no);
    }

    public void printInfo (String name, int no) {
        System.out.println("Name: " + name + ", No: " + no);
    }
}
public class CPolymorphism {
    public static void main(String[] args) {
        student s1 =  new student();
        s1.name = "Rishabh";
        s1.no = 1234;

        s1.printInfo(s1.name);
        s1.printInfo(s1.no);
        s1.printInfo(s1.name, s1.no);
    }
}