import java.util.*;
class QuickSort{


	public static int partition(int [] arr,int low,int high){
         int pivot=high;
         int i=-1;
         for(int j=0;j<high;j++){
         	if(arr[j]<arr[pivot]){
         		i++;
         		int temp=arr[i];
         		arr[i]=arr[j];
         		arr[j]=temp;
         	}
         }

         i++;
         int temp=arr[i];
         arr[i]=arr[high];
         arr[high]=temp;

         return i;

	}

	public static void quick(int [] arr, int low, int high){
		if(low<high){

			int pivotindx=partition(arr,low,high);
			quick(arr,low,pivotindx-1);
			quick(arr,pivotindx+1,high);
		}
	}

	public static void main(String[] args){
		 QuickSort b=new QuickSort();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number of elements:");
         int x=sc.nextInt();
         int[] arr=new int[x];
         System.out.println("Enter elements:");
         for(int i=0;i<x;i++){
         	arr[i]=sc.nextInt();
}

         int low=0;
         int high=arr.length-1;
         b.quick(arr,low,high);

         for(int i=0;i<arr.length;i++){
               System.out.print(arr[i]);
         }
	}
}