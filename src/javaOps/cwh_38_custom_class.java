package javaOps;


class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("My is is " + id);
        System.out.println("And my  name is "+ name);
    }
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee Ankit = new Employee();  // Instantiating a new Employee Object
        Employee john = new Employee();  // Instantiating a new Employee Object
        // setting properties
        Ankit.name = "CodeWithAkku";
        Ankit.id = 12;
        john.id = 17;
        john.name = " john papadkhajur";



        // Printing the Attributes
        Ankit.printDetails();
        john.printDetails();
//        System.out.println(Ankit.id);
//        System.out.println(Ankit.name);
    }
}
