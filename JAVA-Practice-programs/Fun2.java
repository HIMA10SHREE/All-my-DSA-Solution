import java.util.*;
class Fun2{
	static int sumTwoNo(int x,int y){
		int sum=x+y;
		return sum;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int y=sumTwoNo(a,b);
		System.out.println(y);
		

	}
}