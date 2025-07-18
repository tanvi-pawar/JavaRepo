import java.util.*;
class CombinationArray1{
	

public static void main(String[] args) {
	
	int[]arr ={10,20,30,40};
	System.out.println(Arrays.toString(arr));
for(int i =0;i<arr.length;i++){

			for(int j=i+1;j<arr.length;j++){

				if(arr[i]==arr[j]) 
				continue;

					int [][] arr1 = new int[2][2];
					arr1[0][0] =arr[i];
					arr1[0][1] =i;

					arr1[1][0]=arr[j];
					arr1[1][1]=j;

					System.out.println(Arrays.deepToString(arr1));

				

				System.out.println("--------------------------");
				


			}

		

			}
			
		}
	
	}

	
       
		
	

