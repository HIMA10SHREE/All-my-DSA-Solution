class FLOccurence{
	 static int first=-1;
	 static int last=-1;
	public static void Occurence(String x,int indx,char y){
		if(indx==x.length()){
			System.out.println(first);
			System.out.println(last);
			return;
		}
		char character=x.charAt(indx);
		if(character==y){
			if(first==-1){
				first=indx;
			}
			else{
				last=indx;
			}

		}
		Occurence(x,indx+1,y);
	}
	public static void main(String[] args){
		String x="abaacdaefaah";
		char y='a';
		Occurence(x,0,y);
	}
}