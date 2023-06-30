class Mazepath{
    public static int calc(int i,int j,int m,int n){
    	if(i==m || j==n){
    		return 0;
    	}
    	if(i==m-1 && j==n-1){
    		return 1;
    	}

    int path1=calc(i+1,j,m,n)+calc(i,j+1,m,n);
    return path1;
    }
	public static void main(String[] args){
		int count =calc(0,0,3,3);
		System.out.print(count);

	}
}