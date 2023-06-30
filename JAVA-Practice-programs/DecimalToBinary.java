import java.util.*;
class DecimalToBinary{
	public static void main(String[] args){
		int y;
		String b="";
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		while(x>=1){
			y=x%2;
			b=y+b;
		    x=x/2;
			
				}
				System.out.println(b);

	}
}