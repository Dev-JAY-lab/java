class Student {
    String name;
    int age;

public Student(String n, int a){
    name = n;
    age = a;
}

public void displayInfo(){
    System.out.println(name + " "+ age);
}
}





public class constructor {
    public static void main(String[] args) {
       Student s1 = new Student("nitin", 23);
       Student s2 = new Student("shubham", 18);

       s1.displayInfo();
       s2.displayInfo();
    }
}
