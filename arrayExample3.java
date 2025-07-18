import java.util.*;
class arrayExample3{
	
	public static void main(String[] args) {
		
	 // int[]a = new int[3];
	 // a[0]=10;
	 // a[1]=20;
	 // a[2]=30;

	 // System.out.println(Arrays.toString(a));


		// char[]a = {'A','B','C','D','E','F','G'};
		
		// System.out.println(a.length);
        //   System.out.println(Arrays.toString(a));



       // int []arr ={1,2,3,4,5,6};
        // System.out.println(arr.length);

        // int len =0;
        // for(int i =0;true;i++){
        // 	try{

        // 		int a = arr[i];

        // 	}
        // 	catch(ArrayIndexOutOfBoundsException ae){
        // 		break;

        // 	}
        // 	len++;
        // }
        // System.out.println(len);


        // for(int i = arr.length-1;i>=0;i--){
        // 	System.out.print(arr[i]+" ");//reverse 6 5 4 3 2 1
        // }


        //   int[][]arr = {{1,2},{7,7,5},{3,4},{5,6,7}};
        //   for(int i=0;i<arr.length;i++){
        //   System.out.print(Arrays.toString(arr[i]));



        // }


        // char[][]arr={{'a','b'},{'e','f'},{'c','d'},{'d','f'}}{;

        // for(char arr1[]:arr){

        // 	for(char ele1:arr1)
        // 	System.out.print(ele1 + " ");
        // }
        // System.out.println();



       // int[][]arr={{1,2,3},{4,5,6},{7,8,9}};

        // for(int i =0;i<arr.length;i++){
        // 	for(int j =0;j<arr[i].length;j++){

        // 		System.out.print(arr[i][j] +" ");
        // 	}
        // 	System.out.println();
        // }
           
//////////////////////while loop//////////////////////


        //    int i =0;
        // while(i<arr.length){

        // 	int j=0;
        // 	while(j<arr[i].length){

        // 		System.out.print(arr[i][j]+" ");
        // 		j++;
        // 	}
 
        //     System.out.println();
        //       i++;
        	

        // }


///////////////////////do while loop//////////////////////
        // int i =0;
        // do{
        // 	int j =0;
        // 	do{

        // 		System.out.print(arr[i][j]+" ");
        // 		j++;
        // 	}
        // 	while(j<arr[i].length);
        // 	System.out.println();
        // 	i++;
        // }
        // while(i<arr.length);

        
        // System.out.println(Arrays.deepToString(arr));

        //         int[][][]arr1={{ {1,2,3} ,{4,5,6} }, { {7,8,9} ,{5,3,2}} ,{{2,3,1},{3,4,5}}};

        //      System.out.print(Arrays.deepToString(arr1));
        //      System.out.println();


        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter a value");
        // int size = sc.nextInt();

        // int []arr = new int[size];

        // System.out.println(Arrays.toString(arr));

        // for(int i =0;i<size;i++){
        // 	System.out.println("Enter the "+(i+1)+" element :");
        // 	arr[i]=sc.nextInt();
        // }


        // System.out.println(Arrays.toString(arr));

  
    //           char []arr= new char[26];

    //           for(int index=0;index<arr.length;){
    //           	char ch =(char)(Math.random()*99);

    //           	if(ch>=65 && ch<=90){

    //           		if(!(checkElement(arr,ch)))

    //           			arr[index++]=ch;
    //           	}
    //           }

    //           System.out.println(Arrays.toString(arr));


	// }



	// public static boolean checkElement(char[]arr,char ch){

	// 	for(char ele:arr)
	// 		if(ele==ch)
	// 			return true;

	// 		return false;
	// }
    //       int [] arr ={10,20,3,40};
    //       for (int ele : arr) {
    //         if (isEven(ele)) {
    //             System.out.println(ele + " is even");
    //         } else {
    //             System.out.println(ele + " is odd");
    //         }
    //     }
    // }


	


	// public static boolean  isEven(int ele){

		

    //    return ele%2==0;


        ////////separate even odd num

        // int [] a ={10,23,5,2,6,1};

        // for(int i = 0;i<a.length;i++){
        //     if(a[i]%2!=0){
        //         for(int j =i+1;j<a.length;j++){
        //             if(a[j]%2==0){
        //                 for(int k = j;k>i;k--){
        //                     int temp=a[k-1];
        //                     a[k-1]=a[k];
        //                     a[k]=temp;



        //                 }
        //                 break;


        //             }


        //         }
        //     }


        // }

        //  System.out.println(Arrays.toString(a));

      
         int[] arr = {1,2,3,2,3,4};

       boolean [] b = new boolean[arr.length];
       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(b));

       for(int i =0;i<arr.length;i++){

         if( b[i]) continue;

         int cnt =0;
         for(int j =0;j<arr.length;j++){
            if(arr[i] == arr[j] && !b[j]){
               cnt++;
               b[j] = true;
            }
         }

         System.out.println(arr[i] +":"+cnt);


       }



           





	}
}