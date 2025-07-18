import java.util.Arrays;
class StringFrequency{

	public static void main(String[] args) {
		
		String [] arr = {"a","b","c"};
		boolean [] b = new boolean[arr.length];

		System.out.println(Arrays.toString(arr));
		for(int i =0;i<arr.length;i++){
                
			if (b[i]) continue;

			int cnt =0;

           int maxCount = 0;
          String mostFrequent = "";

			for(int j =0;j<arr.length;j++){

				if(arr[i]==arr[j] && !b[j]){

                  cnt++;
                  b[j]=true;
				}

				
              }
			
			// if (cnt ==1){
			// 	String[] result ={"" + arr[i]};
			// 	System.out.println("first non repeating");
			// 	System.out.println(Arrays.toString(result));
			// 	return;
			// }   ///non repeating
            

           	

			
             
			//unique
			//System.out.println(arr[i]+" : "+cnt);
			}
			
		}
	}
