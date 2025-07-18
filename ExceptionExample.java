class ExceptionExample{

	// static int a;
	public static void main(String[] args) {
	// 	try{
	// 	String str = null;
	// 	str.charAt(0);
	// }
// catch(ArithmeticException ae){
	// 	System.out.println("ArithmeticException handled");
	// }
	// catch(ArrayIndexOutOfBoundsException aio){

	// 	System.out.println("ArrayIndexOutOfBoundsException handled");
	// }

		//It creates runtime exception
////////////////////////////////////////////////////////////////////////////

// 		try{
// 			String str = null;
// 			str.charAt(0);

// 		}

// 		catch(ArithmeticException ae){
// 			System.out.println("ArithmeticException handled");
// 		}

// 		catch(ArrayIndexOutOfBoundsException aiob){
// 	System.out.println("ArrayIndexOutOfBoundsException");
// }

// 		catch (RuntimeException re){
// 			System.out.println("RuntimeException handled");
// 		}

		//RuntimeException handled

///////////////////////////////////////////////////////////////////////////////////

		// try{

		// 	System.out.println("try block");
		// 	System.out.println(10/0);
		// 	System.out.println("java");
		// }

		// catch(ArithmeticException ae){
		// 	System.out.println("ArithmeticException handled");
		// }

		// catch(NullPointerException ne){
		// 	System.out.println("NullPointerException");
		// }

///////////////////////////////////////////////////////////////////////////////
		// try{
		// 	System.out.println("hello try");
		// 	System.out.println(10/0);
		// 	System.out.println(args[1]);
		// }

		// catch(ArithmeticException ae){
		// 	System.out.println("ArithmeticException");
		// }
		// catch(ArrayIndexOutOfBoundsException aiob){
		// 	System.out.println("ArrayIndexOutOfBoundsException");
		// }
/////////////////////////////////////////////////////////////////////////////

	// 	try{
	// 		System.out.println("try hello");
	// 		Thread.sleep(1500);
	// 		System.out.println(10/0);
	// 		System.out.println(args[1]);
	// 		System.out.println("java");
	// 	}

	// 	catch(InterruptedException ie){
	// 		System.out.println("InterruptedException");
	// 	}

	// 	catch(ArrayIndexOutOfBoundsException ai){
	// 		System.out.println("ArrayIndexOutOfBoundsException");
	// 	}
    //     catch(ArithmeticException ae){
	// 	System.out.println("ArithmeticException" );
	// }

	// catch(NullPointerException npe){
	// 	System.out.println("NullPointerException");
	// }

////////////////////////////////////////////////////////////////////////
// static{

// 	   try{
// 		a=10/0;

// 	}
//      catch(ArithmeticException ae){
// 		System.out.println("ArithmeticException ");
// 	}
// 	System.exit(0);
//      }


      //////////////////////////////////////////////////////////////////////

// try{
// 	System.out.println("Outer catch");

// 	try{
// 		System.out.println("inner Try");
// 		System.out.println(10/0);
// 	}

// catch(ArithmeticException ae){
// 	System.out.println("ArithmeticException");
// }


// }

// catch(IndexOutOfBoundsException ioe){
// 	System.out.println("IndexOutOfBoundsException");
// }

//Outer catch
//inner Try
//ArithmeticException
///////////////////////////////////////////////////////////////////////////



		// try{
		// 	System.out.println("try block");
		// }

		// catch(IndexOutOfBoundsException ie){
		// 	System.out.println("IndexOutOfBoundsException");
		// 	System.out.println("outer catch");
		//     System.out.println(10/0);
		// }

		// catch(ArithmeticException ae){
		// 	System.out.println("inner catch");
		// 	System.out.println(args[0]);

			//o/p-try block
		// }
		/////////////////////////////////////////////////////////////////////////

// 		try{
// 			System.out.println("outer try");
// 			Thread.sleep(2000);

// 		}

// 		catch(InterruptedException ie){
// 			System.out.println("InterruptedException");
// 		}

// 		try{
// 			System.out.println("inner try");
// 			System.out.println(10/0);
// 		}
// 	catch(ArithmeticException ae){
// 		System.out.println("ArithmeticException");
// 		System.out.println(args[0]);

		
   // }

//outer try
//inner try
//ArithmeticException
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
       // at ExceptionExample.main(ExceptionExample.java:171)

////////////////////////////////////////////////////////////////////////////

		// try{
		// 	System.out.println(10/0);
		// }

		// catch(Exception e){
		// 	System.out.println("Exception");
		// }

		// catch(RuntimeException re){
		// 	System.out.println("RuntimeException");
		// }

		// catch(ArithmeticException ae){
		// 	System.out.println("ArithmeticException");
		// }



//CTE--le.java
//ExceptionExample.java:192: error: exception RuntimeException has already been caught
              //  catch(RuntimeException re){
                ^
//ExceptionExample.java:196: error: exception ArithmeticException has already been caught
               // catch(ArithmeticException ae){


   ////////////////////////////////////////////////////////////////////////
   

	//}

// ExceptionExample(int num1,int num2) throws Exception{
// 	System.out.println("constructor");
// 	System.out.println(num1/num2);
// }

// public static void main(String[] args) {
// 	System.out.println("hello");

// 	try{
// 		ExceptionExample obj = new ExceptionExample(10,2);
// 	}
// 	catch(ArithmeticException ae){
// 		System.out.println("ArithmeticException");
// 	}
// }

//CTE

                

            }

}