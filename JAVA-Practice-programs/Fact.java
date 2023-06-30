import java.util.*;
class Fact{
	static int Factorial(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
        int fact=Factorial(a);
        System.out.println(fact);

		
}
	}