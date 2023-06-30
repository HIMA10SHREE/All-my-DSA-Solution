//print first aand last character in string.

class FLstring{
	public static void Stlf(String x,int indx){
		if(indx==0){
			System.out.println(x.charAt(0));
			return;

		}
			Stlf(x,indx-1);
		}


	
	public static void main(String[] args){
		String x="abaacddefaah";
		int indx=x.length()-1;
		//System.out.println(x.charAt(indx));
		Stlf(x,indx);
		System.out.println(x.charAt(indx));
	}
}
