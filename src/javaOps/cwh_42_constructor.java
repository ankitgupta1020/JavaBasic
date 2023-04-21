package javaOps;

class MyMainEmployee{
    private int id;
    private String name;

    public String getName(){return name; }
    public void setName(String n) { this.name = n; }
    public void setId(int i) { this.id = i; }
    public int getId() { return id; }
}
public class cwh_42_constructor {
    public static void main(String[] args) {
        MyMainEmployee ankit =  new MyMainEmployee();
        ankit.setName("Ankit");
        ankit.setId(22);
    }
}
