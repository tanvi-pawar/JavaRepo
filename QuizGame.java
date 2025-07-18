import java.util.*;
class QuizGame{

	public static void main(String[] args) {
		
		String[] questions ={
			"1. Which of the following is not a Java keyword?",
			"2. What is the size of an int variable in Java?", 
			"3. Which method is the entry point of a Java program?",
			"4. Which of the following is not a feature of Java?",
			"5. Which of the following is used to create an object in Java?",
			"6. What is the default value of a boolean variable in Java?",
			"7. Which package contains the Scanner class?",
			"8. In Java, which keyword is used to inherit a class?",
			"9. What is the use of the final keyword in Java?",
			"10. What will happen if the main() method is declared as private?"
		};

		String[][] options = {
    {"1) static", "2) Boolean", "3) void", "4) private"},
    {"1) 2 bytes", "2) 4 bytes", "3) 8 bytes", "4) Depends on the system"},
    {"1) start()", "2) run()", "3) main()", "4) init()"},
    {"1) Platform-independent", "2) Object-oriented", "3) Use of pointers", "4) Automatic memory management"},
    {"1) class", "2) new", "3) Object", "4) this"},
    {"1) true", "2) false", "C) 0", "D) null"},
    {"1) java.util", "2) java.io", "3) java.lang", "4) java.net"},
    {"1) this", "2) super", "3) extends", "4) implements"},
    {"1) To define a constant", "2) To prevent inheritance", "3) To prevent method overriding", "4) All of the above"},
    {"1) The program will compile but not run", "2) The program will run normally", "3) Compilation error", "4) Runtime error"}
};

int[] answers={
	2,2,3,3,2,2,1,3,4,1
};

int score = 0;
int guess ;

Scanner sc = new Scanner(System.in);

System.out.println("**********************************");
System.out.println("     WEL-COME TO JAVA QUIZ");

System.out.println("**********************************");


for(int i=0; i<questions.length;i++){

	System.out.println(questions[i]);

	

	for(String option:options[i]){
		System.out.println(option);
	}

	System.out.println("Enter Your Guess: ");
	guess = sc.nextInt();

	if(guess==answers[i]){
		System.out.println("**********************************");
		System.out.println("YOU ARE CORRECT ");
		System.out.println("**********************************");
       score++;


	}

	else{
         
         System.out.println("**********************************");
		System.out.println("YOU ARE WRONG ");
		System.out.println("**********************************");

         }

	}

	System.out.println("YOUR FINAL SCORE IS " + score +" OUT OF " + questions.length);

	if(score>6){
		System.out.println("Congrats ! You are Pass");
	}
	else{
		System.out.println("OOPS, You are Fail Try in NextTime");
	}

	System.out.println("Thanks For Visiting !!!");
	sc.close();

   }
}