class Student {
    String name;
    int age;
   public void displayInfo(){
    System.out.println(" " + name +" " + age);
   }

}


public class constructor2 {
   public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "RAM";
    s1.age = 22;
   
   

    s1.displayInfo();
   }    
}
