import java.util.*;
class SortingOfNames{

	public static void main(String[] args) {
		
		String[ ] arr = {"mahesh","mash","prathmesh","suresh"};
		System.out.println(Arrays.toString(arr));

		arrAsending(arr,arr.length);
		System.out.println(Arrays.toString(arr));


		arrdescending(arr,arr.length);
		System.out.println(Arrays.toString(arr));


	}


	public static void arrAsending(String[]arr,int len){

      for(int i =0;i<len;i++){

      	for(int j =i+1;j<len;j++){

      		if(arr[i].compareTo(arr[j])>0){

      			String temp = arr[i];

      			arr[i]=arr[j];
      			arr[j]=temp;
      		}
      	}
      }


	}




	public static void arrdescending(String[]arr,int len){

      for(int i =0;i<len;i++){

      	for(int j =i+1;j<len;j++){

      		if(arr[i].compareTo(arr[j])<0){

      			String temp = arr[i];

      			arr[i]=arr[j];
      			arr[j]=temp;
      		}
      	}
      }


	}

}