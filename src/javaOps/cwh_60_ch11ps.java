package javaOps;

abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountatinPen extends Pen {
    void write() {
        System.out.println("Write");

    }

    void refill() {
        System.out.println("Refill");

    }

    void changeNib() {
        System.out.println("Changing the nib");

    }
}

class Monkey {                       //This is class
    void jump() {                     //This is method
        System.out.println("Jumping.......");
    }

    void bite() {                        //This is method
        System.out.println("Biting.........");

    }
}

interface BasicAnimal {            //This is Interface
    void eat();

    void sleep();
}

class Human extends Monkey  implements BasicAnimal{
    void speak() {                    //This is method
        System.out.println("Hello sir! ");
    }

    @Override
    public void eat() {
        System.out.println("Eating................");

    }

    @Override
    public void sleep() {
        System.out.println("Sleeping................");
    }
}

public class cwh_60_ch11ps {
    public static void main(String[] args) {

        // q1 + q2
        FountatinPen pen = new FountatinPen();
        pen.changeNib();

        // q3
        Human ankit = new Human();
        ankit.sleep();

        // q5

        Monkey m1 = new Human();
       // m1.speak(); // cannot use speak method because the refrence is monkey which does not have speak method
    }
}
