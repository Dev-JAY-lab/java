import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        

     Scanner sc = new Scanner(System.in);

     System.out.println(" Hello I am  Your Calculator ");

     System.out.println("Enter Any Number:");

     double num1 = sc.nextDouble();

     System.out.println("Select any of them: (+ , - , * , / ,  % )");
     char Operators= (sc.next().charAt(0));
     

     double num2 = sc.nextDouble();

     double Result;

     // implimentation of switch

     switch ( Operators) {


        case '+': 

        Result = num1 + num2;
        System.out.println("Result : " + Result);
        
        break;

        case '-':

         Result = num1- num2;
         System.out.println("Result : " + Result);
         
        break;

        case '*':

         Result = num1* num2;
         System.out.println("Result :" + Result);
         
        break;
        
        case '/':

        Result = num1 / num2;
        System.out.println("Result :" + Result);
        
        break;
       

        case '%':

         Result = num1 % num2;
         System.out.println("Result : " + Result);
         
        break;


        default:

         System.out.println("Invalid operator! Please enter one of +, -, *, or /.");

         break;

         
}
       
          sc.close();

}
    
}
