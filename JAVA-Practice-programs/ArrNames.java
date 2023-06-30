//Take an array of names as input from the user and print them on the screen.

import java.util.*;
class ArrNames{
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many names to print:");
		int x=sc.nextInt();
		String [] y=new String[x];
		for(int i=0;i<x;i++){
			 y[i]=sc.next();
		}
		for(int i=0;i<x;i++){
			System.out.println(y[i]);
		}
	}
}