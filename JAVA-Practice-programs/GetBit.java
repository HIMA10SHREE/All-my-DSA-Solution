import java.util.*;
class GetBit{
	public static void main(String[] args){
		int n=5;
		int pos=2;
		int bitMask=1<<pos;
		if((bitMask & n)==0){
			System.out.println("bit is 0");
		}
		else{
			System.out.println("bit is 1");
		}
	}
}