import java.util.*;
class Mul1{
	static int mulTwoNo(int x,int y){
		int m=x*y;
		return m;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int y=mulTwoNo(a,b);
		System.out.println(y);
		
}
	}