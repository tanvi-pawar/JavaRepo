import java.util.*;
class ex{
	public static void main(String[] args) {
		String[][]paragraph ={{"hello", "world"},{"How","areYou","doing"},{"please","look","and","align","to","the","center"}};
        
		int width = 16;

       for (String []ele:paragraph){

       	for(String ele1:ele){

       		System.out.print(ele1);

       		String [] ele2 = new String[ele1];

              int cnt=0;
          for(int i =0;i<ele1.length;i++){
       		if(ele1[i]==width)
       			cnt++;

}

       	}
       }
	}
}