import java.util.*;
class demo{
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6};

		System.out.println("Before rotation: " +Arrays.toString(arr));
		System.out.println("Enter no of iteration:");

         int rotation=new Scanner(System.in).nextInt();



               clock(arr,rotation);
         System.out.println("After rotation : "+Arrays.toString(arr));



	}


	public static void clock(int[]arr,int rotation){

           for(int i =0;i<rotation;i++)
          {
		         int temp =arr[0];//1

		       for(int j =1;j<arr.length;j++)
		      {
                     arr[j-1]=arr[j];


		}

		arr[arr.length-1]=temp;
}
	}
}