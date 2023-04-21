package javaOps;


class MyEmployee{

   private int id;
   private String name;

   public String getName(){
       return name;
   }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
       id = i;
    }
}
public class cwh_40_ch9 {
    public static void main(String[] args) {
        MyEmployee ankit = new MyEmployee();
//        ankit.id = 45;
//        ankit.name = "codewithankit";// Throw an error due to private access modifier
          ankit.setName("codewithAnkit");
          System.out.println(ankit.getName());
    }
}
