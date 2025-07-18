import java.util.*;
class BubbleSort{
	public static void main(String[] args) {


		int[]arr = {5,3,8,2,9,1};

		System.out.println(Arrays.toString(arr));

        arrAsending(arr);
        System.out.println("arrdescending: "+Arrays.toString(arr));

        arrdescending(arr);
        System.out.println("arrdescending: "+Arrays.toString(arr));
		
	}


	public static void arrAsending(int[] arr){

   for(int i =0;i<arr.length;i++){

   	for(int j = i+1;j<arr.length;j++){

   		if(arr[i]>arr[j]){

   			int temp= arr[i];
   			arr[i]= arr[j];
   			arr[j]=temp;
   		}
   	}
   }


	}



	public static void arrdescending(int[] arr){

   for(int i =0;i<arr.length;i++){

   	for(int j = i+1;j<arr.length;j++){

   		if(arr[i]<arr[j]){

   			int temp= arr[i];
   			arr[i]= arr[j];
   			arr[j]=temp;
   		}
   	}
   }


	}
}