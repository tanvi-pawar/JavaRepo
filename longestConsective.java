import java.util.*;
class longestConsective{

	public static void main(String[] args) {
		int[]arr ={1,0,0,1,0,1,1,1,1,0};
		System.out.println(Arrays.toString(arr));
        System.out.println(largest(arr));
	}


	public static int largest(int arr[]){

		int cnt =0;
		int max=0;

		for(int i :arr){

			if(i==1){
				cnt++;

				if(cnt>max)
					max=cnt;
			}

			else{
				cnt=0;
			}
		}

		return max;

        


	}
}