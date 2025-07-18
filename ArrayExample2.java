import java.util.*;
class ArrayExample2{
	public static void main(String[] args) {
		//seprate even odd
		int [] arr = {2,3,4,5,6,7};

		for(int i =0;i<arr.length;i++){

			if(arr[i]%2==0){
              for(int j =i+1;j<arr.length;j++){
              	if(arr[j]%2 != 0){

              		int temp =arr[j];
              		arr[j]=arr[i];
              		arr[i] = temp;
                    break;

              	}


              	
              }

			}
		}

		System.out.println(Arrays.toString(arr));

	}
}