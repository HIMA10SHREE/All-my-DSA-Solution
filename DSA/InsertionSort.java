import java.util.*;
class InsertionSort{
      
      public static void insertion(int[] arr,int x){
      	
         for(int i=1;i<x;i++){
            int min=arr[i];
            int j=i-1;
            while(j>=0 && min<arr[j]){
                arr[j+1]=arr[j];
                j--;           
                 } 

                 arr[j+1]=min;
         
         }


      	for(int i=0;i<x;i++){


      	System.out.print(arr[i]);
      }
      }

      public static void main(String[] args){

         InsertionSort b=new InsertionSort();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number of elements:");
         int x=sc.nextInt();
         int[] arr=new int[x];
         System.out.println("Enter elements:");
         for(int i=0;i<x;i++){
         	arr[i]=sc.nextInt();
}
         b.insertion(arr,x);

      }

}