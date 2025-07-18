import java.util.*;

///////////////missing value between range/////////////////
class ArrayExamp{
	public static void main(String[] args) {
		int[]arr ={2,5};

		for(int i =arr[0]+1;i<arr[arr.length-1];i++){

			boolean flag =false;

			for(int ele :arr){

				if(ele==i)
					flag=true;
			}
			if(!flag)
				System.out.println(i);
		}
	}
}  