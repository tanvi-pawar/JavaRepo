import java.util.*;
class highestRepeatingchar{

	public static void main(String[] args) {

		toCharArray(str);
		
	}

	public static void toCharArray(String str) {
		char[] arr={'a','b','a'};
		char[] arr = str.toCharArray();
		boolean b = new boolean [arr.length];

		System.out.println(Arrays.toString(arr));

		int max = Integer.MIN_VALUE;

		char highele ='';

	for(int i =0;i<arr.length;i++){

		if (b[i]) continue;
	int cnt =0;
	for(int j =0;j<arr.length;j++){

		if(arr[i]==arr[j] && !b[j])
		{
			cnt++;
			b[j]=true;
		}
	}
}

	if(max<cnt){
		max=cnt;
		highele=arr[i];
	}

	System.out.println("highele:"+highele + "max : "+max);
	}
}