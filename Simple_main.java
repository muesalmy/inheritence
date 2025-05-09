package tr.edu.maltepe.oop;
public  class Simple_main {

    // Parent class
    static class Person {
       public String name;
       private int age;

        // Constructor
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Method to display details
        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    // Child class
    static class Student extends Person {
      private   String major;

        // Constructor
        Student(String name, int age, String major) {
            super(name, age);
            this.major = major;
        }

        // Overriding the displayDetails method
        @Override
        void displayDetails() {
            super.displayDetails(); // Calling parent class method
            System.out.println("Major: " + major);
        }

        // Method overloading
        void study() {
            System.out.println(name + " is studying.");
        }

        void study(int hours) {
            System.out.println(name + " is studying for " + hours + " hours.");
        }
    }

    public static class Main {
        public static void main(String... args) {
            // Creating two Student objects

            Student student1 = new Student("enes", 29, "Computer Science");
            Student student2 = new Student("burak", 21, "Physics");

            // Calling methods
            student1.displayDetails();
            student1.study();
            student1.study(8);
            System.out.println();

            student2.displayDetails();
            student2.study();
            student2.study(7);
        }
    }

}


