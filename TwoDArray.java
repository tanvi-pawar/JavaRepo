import java.util.*;
class FinallyExample{
	public static void main(String[] args) {
		
		// int[][]arr = {{1,2,3},{4,5},{6,7,8,9}};
		// for(int i = 0;i<arr.length;i++){
		// 	for(int j =0;j<arr[i].length;j++){
		// 		System.out.print(arr[i][j] +" ");
		// 	}
		// 	System.out.println();
		// }


		///while loop

		// int [][]arr ={{10,20},{30,40,50},{60,70,80}};

		// int i =0;
		// while(i<arr.length){

		// 	int j =0;
		// 	while(j<arr[i].length){
		// 		System.out.print(arr[i][j]+" ");
		// 		j++;
		// 	}

		// 	System.out.println();
		// 	i++;
		// }

       ///do while loop
		int[][] arr = {{10,20},{30,40,50},{60,70,80}};

		int i = 0;
		do{
		int	j = 0;
		

		do{
			System.out.println(arr[i][j]+" ");
			j++;
		}

		while (j<arr[i].length);
			System.out.println();
			i++;
		

		}while(i<arr.length);
		
	}
}