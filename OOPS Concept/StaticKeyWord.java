package OOPS;

class Student3 {
    static String school;
    String name;
}

public class StaticKeyWord {
    public static void main(String args[]) {
        Student3.school = "JMV";
        Student3 s1 = new Student3();
        Student3 s2 = new Student3();

        s1.name = "Meena";
        s2.name = "Beena";

        System.out.println(Student3.school);
        System.out.println(Student3.school);
    }

}
