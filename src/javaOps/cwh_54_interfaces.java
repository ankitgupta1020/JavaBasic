package javaOps;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle{

    //Interface ek se jada implement kar skte hai
    // Lekin jo class hai wo sirf ek etends kar ske hai

    void blowHorn(){
        System.out.println("pee pee pee");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUP");
    } public void blowHornK3g(){
        System.out.println("Kabhi khsui Hamesha khusi");
    }public void blowHornmhn(){
        System.out.println("Main hoon naa po po po");
    }
}
public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleAnkit = new AvonCycle();
        cycleAnkit.applyBrake(1);

        // you can create properties in Interfaces
        System.out.println(cycleAnkit.a);
        // you cannot modify the properties in INterfaces as they are final
//        System.out.println(cycleAnkit.a);
         cycleAnkit.blowHornK3g();
         cycleAnkit.blowHornmhn();
    }
}
