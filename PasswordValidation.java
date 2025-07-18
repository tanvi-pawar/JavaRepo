import java.util.Scanner;
class PasswordValidation{


public static void main(String[] args)  throws InterruptedException {
	
	Scanner sc = new Scanner(System.in);
	int storedPin = 1234;
	int duration= 5000;


	outerloop:
	for( ; ; ){

		int attempt = 3;
		do{
			System.out.println();
			System.out.println("Enter Your Pin : ");
			int userPin = sc.nextInt();

			if(userPin == storedPin){
				System.out.println("Phone is unlocked");

				break outerloop;
			}
			else{

				System.out.println("Wrong Paswword ");
				System.out.println("Please Try next Time");
				System.out.println("Attemt left :" + (attempt-1));

			}

			attempt --;

		}

		while(attempt>=1);
		System.out.println();

		System.out.println("Phone is Locked for:"+(duration/100));
		Thread.sleep(duration);
		duration *=2;
	}
  }
}