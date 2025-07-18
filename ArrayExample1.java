import java.util.*;
class ArrayExample1{

	///all zero right side

	public static void main(String[] args) {
		

		int [] arr = {2,0,1,4,0,4};
		

       int size = arr.length;
        System.out.println(arr.length); 
       int[] arr1 = new int[size];
       int temp=0;
           for(int i =0;i<arr.length;i++){
        	for(int j=arr.length-1; j>=0; j--){
        		if(arr[i]!=0){
        			System.out.println(arr[i]);
        		}

        		
        	}
        	arr[i]=temp;
        	
        }
  
  
                    
	}
	
}