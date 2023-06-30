import java.util.*;
class Arr2{
	public static void main(String[] args){
		int[] marks=new int[3] ;
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<3;i++){
			marks[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		for(int i=0;i<3;i++){
			if(marks[i]==x)
			System.out.println(i);
		}
		
	}
}