import java.util.*;
class IBMAssisment{

public static void main(String[] args) {

Solve(new int[][]{{111,120},{1,20}});
	
	
}

public static void Solve(int[][]arr){

for(int[] ele:arr){

	int n = ele[0],m=ele[1];

	int op = generateNumber(n,m);
	System.out.println(Arrays.toString(ele) +":"+op);
     }


}


public static int generateNumber(int n,int m){
	int cnt=0;
	for(int i =n;i<=m;i++){
		if(checkUniqueDigit(i))
			cnt++;
	}

	return cnt++;
}


public static boolean checkUniqueDigit(int num){
	for(int i =0;i<=9;i++){
		int cnt =0;
		for(int j = num;j!=0;j/=10){
			if(i==(j %10))
				cnt++;
		}

		if(cnt !=0 && cnt>1)

			return false;
	}

	return true;
}


}