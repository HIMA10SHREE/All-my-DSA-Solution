

class Allpermutation{
public static void per(String s,String p){
	if(s.length()==0){
		System.out.println(p);
		return;
	}
	for(int i=0;i<s.length();i++){
		char x=s.charAt(i);
		String y=s.substring(0,i)+s.substring(i+1);
		per(y,p+x);

	}
}





	public static void main(String[] args){
		per("abcd","");


	}
}