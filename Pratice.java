import java.util.*;
class Pratice{
	

public static void main(String[] args) {
	
	int[]arr ={10,20,30,40};
	System.out.println(Arrays.toString(arr));
for(int i =0;i<arr.length;i++){

			for(int j=0;j<arr.length;j++){

				if(arr[i]==arr[j]) {
					continue;
				}
				else if(arr[i]!=arr[j]){
               System.out.print(arr[i]+":" + arr[j]); 


			}

			System.out.println();

			}
			
		}
	
	}

	
       
		
	}

