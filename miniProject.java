import java.util.*;
public class miniProject {
    public static void main(String[] args) {
             //MINI PROJECT
             Scanner sc = new Scanner(System.in);
             int myNumber = (int)(Math.random()*100);
             int userNumber= 0;
             
             do {
               System.out.println("GUSS MY NUMBER:");
                userNumber= sc.nextInt();
               if (userNumber == myNumber) {
                 System.out.println("CONGRATULATION");
                 break;
                 
               }
               else if(userNumber > myNumber) {
                 System.out.println("YOUR NUMBER IS LARGE");
 
 
               }
               else {
                 System.out.println("YOUR NUMBER IS SMALL");
                 
               }
             } while (userNumber >= 0);
 
 
             System.out.println("MY NUMBER WAS : ");
             System.out.println(myNumber);
 
              sc.close();

    }
    
}
