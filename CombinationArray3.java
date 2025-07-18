import java.util.*;
class CombinationArray3{
	

public static void main(String[] args) {
	
	int[]arr ={10,20,30,40};

	
	
	System.out.println(Arrays.toString(arr));
         for(int i =0;i<arr.length;i++){

			  for(int j=i+1;j<arr.length;j++){

				   for(int k = j+1;k<arr.length;k++){

				System.out.println(arr[i] + ":" + arr[j]+":"+arr[k]);

                   
	            }

           }

       }

    }
}

	
       
		
	

