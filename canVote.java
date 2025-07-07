import java.util.*;
public class vote {

    // public static boolean voteOrNot( int age ){
    //     if (age>= 18) {
    //         System.out.println( " You have right to vote go on...... ");
    //         return true;
    //     }else{
    //         System.out.println( "can't vote");
    //         return false;
    //     }
       
    // }
   
      
     public static int sumTwo(int a , int b){
        int sum = a+b;
        System.out.println(sum);
        return sum;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = sc.nextLine();
        // System.out.print("Enter your age: ");
        // int age = sc.nextInt();

    //   boolean canvote = voteOrNot(age);

    // voteOrNot(age);
  
     int a = sc.nextInt();
     int b = sc.nextInt();
     int sum = a + b;
     sumTwo(a, b);



        // int age = sc.nextInt();
        // String name = voteOrNot(age, null);
        


    


sc.close();
    }
    
}
