package javaOps;

class Worker {
    void work() {
        System.out.println("Doing production work...");
    }
}

class MaintenanceWorker extends Worker {
    void work() {
        System.out.println("Repairing machines...");
    }
}

class QualityControlWorker extends Worker {
    void work() {
        System.out.println("Testing products...");
    }
}

public class Factory {
    public static void main(String[] args) {
        Worker worker1 = new Worker();  // creating object of Worker class
        Worker worker2 = new MaintenanceWorker();  // creating object of MaintenanceWorker class
        Worker worker3 = new QualityControlWorker();  // creating object of QualityControlWorker class

        worker1.work();  // calling work() method of Worker class
        worker2.work();  // calling overridden work() method of MaintenanceWorker class
        worker3.work();  // calling overridden work() method of QualityControlWorker class
    }
}

/*Socha jaa sakta hai ki tumhara ghar ek factory hai aur usme kaam karne waale workers hai. Factory mein different departments hote hain, jaise ki production, quality control, maintenance, etc.

Production department ke workers machines par kaam karte hai aur products banate hai, quality control department ke workers products ko test karte hai, aur maintenance department ke workers machines ko repair karte hai.

Ab socho ki tumhari factory ke ek worker ko ek task assign kiya gaya hai ki woh production department mein kaam kare. Lekin iss worker ko bhi maintenance aur quality control ke kaam aate hain.

Aur jab bhi koi problem hoti hai machine mein, maintenance department ke workers ko bula kar machines repair karwaate hain. Jab quality control department ke workers ko koi defect dikhta hai product mein, toh woh production department ke workers ko bataate hain.

Iss tarah se, yahan dynamic method dispatch jaisa concept use hota hai, jahan machine ka repair maintenance department ke workers kar rahe hote hain, aur product testing quality control department ke workers kar rahe hote hain, lekin yeh sab kaam production department ke workers ke through hi control kiya jaata hai.

Ismein production department ke workers superclass ki tarah hote hain, aur maintenance aur quality control department ke workers subclasses ki tarah hote hain, jinhone production department ke methods ko override kiya hai.*/