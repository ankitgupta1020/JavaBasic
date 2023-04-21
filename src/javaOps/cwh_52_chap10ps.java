package javaOps;

class Circle {
    public int radius;

    Circle(int r) {
        System.out.print("I a circle parametrized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

}

class Cylinder extends Circle {
    public int height;

    Cylinder(int r, int h) {
        super(r);
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}


public class cwh_52_chap10ps {
    public static void main(String[] args) {
        //problwem 1
//        Circle objc = new Circle(12 );
        Cylinder obj = new Cylinder(12,4);

    }
}
