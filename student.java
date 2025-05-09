package tr.edu.maltepe.oop;

public class student extends Simple_main.Person {
  private  String major;

    // Constructor
    student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    // Overriding the displayDetails method
    @Override
    void displayDetails() {
        super.displayDetails(); // Calling parent class method
        System.out.println("Major: " + major);
    }
}

