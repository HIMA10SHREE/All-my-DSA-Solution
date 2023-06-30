class PalindromeRecursion {
   
   public static boolean fun(String name,int i,int n){
       if(i>=n/2){
           return true;
       }
       if(name.charAt(i)!=name.charAt(n-i)){
           return false;
       }
      return fun(name,i+1,n);
   } 
 
    public static void main(String[] args) {
        String name="MADAM";
        int i=0;
        int n=name.length()-1;
        boolean x=fun(name,i,n);
    
        if(x==true){
            System.out.println("True");
        }
        else{
          System.out.println("False");
        }
    }
}