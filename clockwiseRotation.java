import java.util.*;
class clockwiseRotation{
	public static void main(String[] args) {
		

		int [] arr = {1,2,3,4,5,6};
		System.out.println("Before rotation"+Arrays.toString(arr));

		System.out.println("Enter the no of roatation:");

		int rotation = new Scanner(System.in).nextInt();

	clockwiseRotation(rotation,arr);
	System.out.println("After rotation" + Arrays.toString(arr));
	}

	public static void clockwiseRotation(int rotation,int []arr){

		for(int i =0;i<rotation;i++){
			int temp = arr[0];
			for(int j = 1;j<arr.length;j++){

				arr[j-1]=arr[j];
			}

			arr[arr.length-1] = temp;
		}
	}
}