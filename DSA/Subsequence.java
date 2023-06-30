import java.util.*;
class Subsequence{
	public static void fun(int ar[],ArrayList<Integer>list1,int i,int n){
      //  int n=ar.length;
        if(i>=n){
            System.out.println(list1);
            return;
        }
        list1.add(ar[i]);
        fun(ar,list1,i+1,n);
        list1.remove(i);
        fun(ar,list1,i+1,n);
    }
    public static void main(String[] args) {
        int n=3;
      int ar[]={1,2,3};
      ArrayList<Integer> list1=new ArrayList<Integer>();
      fun(ar,list1,0,3);
    }
}