import java.util.*;
class CombinationArray4{
	

public static void main(String[] args) {
	
	int[]arr ={10,20,30,40};
	int[][]op = new int[2][2];
	int max= Integer.MIN_VALUE;

	
	
	System.out.println(Arrays.toString(arr));
         for(int i =0;i<arr.length;i++){

			  for(int j=i+1;j<arr.length;j++){

				   for(int k = j+1;k<arr.length;k++){

				if(max<arr[i]+arr[j]+arr[k]){
						max=arr[i]+arr[j]+arr[k];
						int[][]op1={{arr[i],i},{arr[j],j},{arr[k],k}};

						op=op1;
					}
                 
				   System.out.println(Arrays.deepToString(op) +"sum : "+max);

                   


				

	            }

           }

       }

    }
}

	
       
		
	

