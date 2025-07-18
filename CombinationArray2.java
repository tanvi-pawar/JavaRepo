import java.util.*;
class CombinationArray2{
	

public static void main(String[] args) {
	
	int[]arr ={10,20,30,40};

	int[][]op = new int[2][2];
	int max= Integer.MIN_VALUE;
	System.out.println(Arrays.toString(arr));
for(int i =0;i<arr.length;i++){

			for(int j=i+1;j<arr.length;j++){

				if(arr[i]==arr[j]) 
					continue;

					if(max<arr[i]+arr[j]){
						max=arr[i]+arr[j];
						int[][]op1={{arr[i],i},{arr[j],j}};

						op=op1;
					}
				}

				   System.out.println(Arrays.deepToString(op) +"sum : "+max);


			}
		}
	}

	
       
		
	

