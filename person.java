package tr.edu.maltepe.oop;

public class person {
   private String name;
    int age;

    // Constructor
    person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
