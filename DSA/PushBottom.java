import java.util.*;
class PushBottom{
	public static void pushBottom(int data,Stack<Integer>st){
		if(st.isEmpty()){
			st.push(data);
			return;
		}
		int top=st.pop();
		pushBottom(data,st);
		st.push(top);
	}


	public static void main(String[] args){
		Stack<Integer>s=new Stack<>();
		s.push(4);
		s.push(2);
		s.push(6);
		s.push(7);
		s.push(8); 
		pushBottom(5,s);
		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}

	}
}