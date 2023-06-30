//Implementation using LinkedList

class StackClass{
     Node head;

     class Node{
     	int data ;
     	Node next ;

     	Node(int data){
     		this.data=data;
     		this.next=null;
     	}
     }

     	public boolean isEmpty(){
     		if(head==null)
     			return true;
     		return false;
     	}


     	public void push(int data){
     		Node newnode=new Node(data);
     		if(isEmpty()){
     			head=newnode;
     			return;

     		}
     		newnode.next=head;
     		head=newnode;
     	}
     
        public int pop(){
        	if(isEmpty()){
        		return -1;
        	}

        	int top=head.data;
        	head=head.next;
        	return top;
        }

        public int peek(){
        	if(isEmpty()){
        		return -1;
        	}
        	return head.data;
        }
    


	public static void main(String[] args){

		StackClass s=new StackClass();
		s.push(1);
		s.push(4);
		s.push(5);
		s.push(8);
		s.push(2);
		s.pop();
		while(!s.isEmpty()){
			System.out.println(s.peek());
			s.pop();
		}

	}
}



//Implementation using ArrayList






















