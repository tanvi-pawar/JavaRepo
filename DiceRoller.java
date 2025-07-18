import java.util.*;
class DiceRoller{
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
	  int total = 0;
		int numOfDice = 0;


     System.out.println("Enter the num of dice : ");
     numOfDice = sc.nextInt();

     if(numOfDice>0){

     	for(int i = 0 ; i<=numOfDice;i++){
          
          int roll = random.nextInt(1,7);

          printDie(roll);
          System.out.println("your Roll :" + roll);

          total +=roll;



     	}
     	System.out.println("Total : " + total);

     }
     else{
     	System.out.println("number of dice is greater than 0");
     }

     sc.close();
 }

     static void printDie(int roll){

     	String dice1 = """ 
     	 _______

     	|       |
     	|   •   |
     	|       |
     	 _______

     	""";

     	String dice2 = """ 
     	 ________

     	| •      |
     	|        |
     	|      • |
     	 ________

     	""";

     	String dice3 = """ 
     	 ________

     	| •      |
     	|    •   |
     	|       •|
     	 ________

     	""";


     	String dice4 = """ 
     	  ________
                 
     	|  •    • |
     	|         |
     	|  •    • |
     	  ________ 

     	""";


     	String dice5 = """ 
     	  ________
                 
     	|  •    • |
     	|     •   |
     	|  •    • |
     	  ________ 

     	""";


String dice6 = """ 
     	  ________
                 
     	|  •    • |
     	|  •    • |
     	|  •    • |
     	  ________ 

     	""";
     


     switch(roll){

     	case 1 -> System.out.println (dice1);
     	case 2 -> System.out.println (dice2);
     	case 3 -> System.out.println (dice3);
     	case 4 -> System.out.print (dice4);
     	case 5 ->System.out.print (dice5);
     	case 6 -> System.out.print (dice6);
        default -> System.out.println("Invalid roll");

     }

	}
}