import java.util.*;
///assisment Arrays
public class missedLectures {

    public static void main(String[] args) {
        System.out.println(Solve(5,5,6));
    }

    public static int Solve(int chpt,int start,int end){
        return (end-start)>chpt?chpt:(end-start)+1;
    }
}