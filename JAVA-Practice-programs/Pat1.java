import java.util.*;
class Pat1{
	public static void main(String[] args){
		int i,j,n=4;
		for(i=1;i<=4;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			int s=2*(n-i);
			for(j=1;j<=s;j++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("*");
			}

			System.out.println();
		}

		for(i=4;i>=1;i--){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			int s=2*(n-i);
			for(j=1;j<=s;j++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		}
	}