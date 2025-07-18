class ReverseArray{
	public static void main(String[] args) {
		int[]arr = {12,32,14,78};
        System.out.println("original number:");
		for(int num : arr){
			System.out.println(num+" ");
		}

   
       for(int i =0;i<arr.length;i++){
       	arr[i]=reverseNumber(arr[i]);
       }




    System.out.println("Reverse number:");
		for(int num : arr){
			System.out.println(num+" ");
		}

	}

	public static int reverseNumber(int num){

		int rev=0;

		while(num!=0){
			rev= rev*10 + num % 10;
			num/=10;
		}
		return rev;
	}

}