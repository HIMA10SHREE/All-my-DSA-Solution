class OptimisedPower{

    public static int pow(int a,int b){

    	if(b==0){
    		return 1;
    	}

    	int temp=pow(a,b/2);
    	temp=temp*temp;

    	if(b%2==0){
    		return temp;
    	}

    	else{
    		return a*temp;
    	}

    }
	public static void main(String[] args){
		int a=5,b=7;
		int powerr=pow(5,2);

		System.out.println(powerr);
	}
}