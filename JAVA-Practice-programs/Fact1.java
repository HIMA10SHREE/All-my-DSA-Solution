class Fact1{
	public static void main(String[] args){
		int x=5;
		int fact=1;
		FactNo(x,fact);
	}

	public static void FactNo(int x,int fact){
		if(x==0){
			System.out.println(fact);
			return;
		}
		fact=fact*x;
		FactNo(x-1,fact);

	}
}