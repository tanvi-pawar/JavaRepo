import java.util.Scanner;
class GuessingNumber{


     public static void  GuessingNumber(){

     Scanner sc = new Scanner(System.in);
      
      //random number
     int number = 1 + (int) (100 * Math.random());

     int atempt = 5;
     System.out.println("Number is Choosen between 1 to 100 : ");

     System.out.println("you have" +atempt + "atempt to guess correct number");

        //looping statement
     for(int i = 1 ; i<=atempt;i++){
     	System.out.println("Enter Your Guess : ");
     	int guess = sc.nextInt();

     	if(guess == number){

     		System.out.println("Congrats ! Your Guess is correct ");

     		sc.close();
     		return;
     	}

     	else if(guess<number){
     		System.out.println("Your number is Greater than " + guess);
     	}
     	else if (guess>number){
           System.out.println("Your number is less than " + guess);
     	}

     }


     System.out.println("You've exhausted all attempts. The correct number was: " + number);

     sc.close();



     }
	public static void main(String[] args) {
		
		GuessingNumber();
	}
}