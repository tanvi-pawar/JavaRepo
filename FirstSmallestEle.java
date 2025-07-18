import java.util.*;
class FirstSmallestEle{
	public static void main(String[] args) {
		
		int [] arr = {4,5,2,7,8,3,8};

		System.out.println(Arrays.toString(arr));

		int min = Integer.MAX_VALUE;

		for(int ele : arr){
         if(min > ele)

         min=ele;  


		}

		 System.out.println("MIN no: "+min);

			
	}

	
}