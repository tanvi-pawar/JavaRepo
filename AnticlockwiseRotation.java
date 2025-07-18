import java.util.*;
class AnticlockwiseRotation{
	public static void main(String[] args) {
		

	
		int [] arr = {1,2,3,4,5,6};

		System.out.println("Before iteration :"+ Arrays.toString(arr));

		System.out.println("Enter the no of iteration: ");

		int rotation = new Scanner(System.in).nextInt();

		anticlock(arr,rotation);

		System.out.println("Before iteration:"+Arrays.toString(arr));

	}

	public static void anticlock(int[] arr,int rotation){

		for(int i =0;i<rotation;i++){
		int temp=arr[arr.length-1];

		for(int j = arr.length-1;j>0;j--){

			arr[j]=arr[j-1];
		}

		arr[0]=temp;

		}
	}
}
