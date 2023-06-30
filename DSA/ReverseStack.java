import java.util.*;
class ReverseStack{
    public static void reverse(Stack<Integer>s,Stack<Integer>t){
    	if(s.isEmpty()){
    		return;
    	}
    	t.push(s.pop());
    	reverse(s,t);

    }

	public static void main(String[] args){
		Stack<Integer>s=new Stack<Integer>();
		Stack<Integer>t=new Stack<Integer>();
		s.push(4);
		s.push(5);
		s.push(3);
		s.push(9);
		s.push(10);
		reverse(s,t);
		while(!t.isEmpty()){
			System.out.println(t.peek());
			t.pop();
		}

	}
}



//using only one stack

/*

class ReverseStack{
 
public static void reverse(Stack<Integer>s){
	
}


public static void main(String[] args){
		Stack<Integer>s=new Stack<Integer>();
		Stack<Integer>t=new Stack<Integer>();
		s.push(4);
		s.push(5);
		s.push(3);
		s.push(9);
		s.push(10);
		reverse(s);
		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}

	}

}


*/