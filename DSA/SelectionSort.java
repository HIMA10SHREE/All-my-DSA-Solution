import java.util.*;
class SelectionSort{
      
      public static void select(int[] arr,int x){
      	
         for(int i=0;i<x-1;i++){
            int min=i;
            for(int j=i+1;j<x;j++){
                if(arr[min]>arr[j]){
                  min=j;

            }
                }

               int temp=arr[min];
               arr[min]=arr[i];
               arr[i]=temp; 
         }

      	for(int i=0;i<x;i++){


      	System.out.print(arr[i]);
      }
      }

      public static void main(String[] args){

         SelectionSort b=new SelectionSort();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number of elements:");
         int x=sc.nextInt();
         int[] arr=new int[x];
         System.out.println("Enter elements:");
         for(int i=0;i<x;i++){
         	arr[i]=sc.nextInt();
}
         b.select(arr,x);

      }

}