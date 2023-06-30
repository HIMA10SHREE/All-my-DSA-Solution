class Fibonacci{
	public static void main(String[] args){
		int n1=0,n2=1,n=8;
		Fib(n1,n2,n);
	}
	public static void Fib(int n1,int n2,int n){
		int n3;
		if(n==0){
			return;
		}
		System.out.print(n1);
		n3=n1+n2;
		n1=n2;
		n2=n3;

		Fib(n1,n2,n-1);

	}
}