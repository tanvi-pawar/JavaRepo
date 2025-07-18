class lengthOfArrayUsingForEachLoop{
	public static void main(String[] args) {
		int[]arr = {1,2,3,4,5,6,7,8,7,9};

		System.out.println(arr.length);

		int len = 0;
		for(int ele:arr){
			len++;
			
		}
		System.out.println(len);
	}
}