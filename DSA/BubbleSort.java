import java.util.*;
class BubbleSort{
      
      public static void bubble(int[] arr,int x){
      	for(int i=0;i<x-1;i++){
      		for(int j=0;j<x-i-1;j++){
      			if(arr[j]<arr[j+1]){
      				int temp=arr[j];
      				arr[j]=arr[j+1];
      				arr[j+1]=temp;
      			}

      		}	      		
      	}
      	for(int i=0;i<x;i++){


      	System.out.print(arr[i]);
      }
      }

      public static void main(String[] args){

         BubbleSort b=new BubbleSort();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number of elements:");
         int x=sc.nextInt();
         int[] arr=new int[x];
         System.out.println("Enter elements:");
         for(int i=0;i<x;i++){
         	arr[i]=sc.nextInt();
}
         b.bubble(arr,x);

      }

}