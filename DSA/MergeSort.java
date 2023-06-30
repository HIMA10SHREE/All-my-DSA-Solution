import java.util.*;
class MergeSort{

     public static void conquer(int []a,int s,int mid,int en){

       int [] merge=new int[s-en+1];
       int x=s;
       int y=mid+1;
       int k=0;
       while(x<=mid && y<=en){
         if(a[x]<=a[y]){
                 merge[k]=a[x];
                 x++;
                 k++;
         }

         else{
            merge[k]=a[y];
            y++;
            k++;
         }
       }
       while(x<=mid){
         merge[k]=a[x];
         x++;
         k++;
       }

       while(y<=en){
         merge[k]=a[y];
         y++;
         k++;
       }

       for(int i=0;i<a.length;i++){
         a[i]=merge[i];
       }

     }
      
      public static void divide(int [] a,int s,int en){
         
         if(s>=en){
            return;
         }
         else{
         
         int mid=s+(en-s)/2;

         divide(a,s,mid);
         divide(a,mid+1,en);
         conquer(a,s,mid,en);

      }
   }
     

      public static void main(String[] args){

         MergeSort b=new MergeSort();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number of elements:");
         int x=sc.nextInt();
         int[] arr=new int[x];
         System.out.println("Enter elements:");
         for(int i=0;i<x;i++){
         	arr[i]=sc.nextInt();
}

         int s=0;
         int en=arr.length;
       //  int mid
         b.divide(arr,s,en);

         for(int i=0;i<arr.length;i++){
               System.out.println(arr[i]);
         }

      }

}