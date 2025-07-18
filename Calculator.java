import java.util.Scanner;
class Calculator{
	
	public static void main(String[] args) {
		

		char operator;
		double number1,number2,Result;

         Scanner sc = new Scanner(System.in);

         System.out.println("Choose One Operator (Which operation u do): ");
         operator=sc.next().charAt(0);

         System.out.println("Enter First Number : ");
         number1 = sc.nextDouble();

         System.out.println("Enter Second Number : ");
         number2 = sc.nextDouble();

         switch(operator)
         {
         case '+':
         Result = number1 + number2;
         System.out.println(number1 + "+" + number2 + "= " + Result);
         break;


          case '-':
         Result = number1 - number2;
         System.out.println(number1 + "-" + number2 + "= "+ Result);
         break;

            case '*':
         Result = number1 * number2;
         System.out.println(number1 + "*" + number2 +"= "+ Result);
         break;


            case '%':
         Result = number1 % number2;
         System.out.println(number1 + "%" + number2 + "= " + Result);
         break;


           case '/':
         Result = number1 / number2;
         System.out.println(number1 + "/" + number2 + "= "+ Result);
         break;

     default : 
     	System.out.println("Invalid Operator");
     	break;
         }

         sc.close();



	}
}