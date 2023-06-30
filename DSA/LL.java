
import java.util.*;

class LL{
	Node head;

    class Node{
    	int data;
    	Node next ;

    	Node(int data){
    		this.data=data;
    		this.next=null;
    	}
    }


public void AddFirst(int data){
	Node newnode=new Node(data);
	if(head==null){
		head=newnode;
		return;
	}
    
   newnode.next=head;
   head=newnode;


}

public void LastNode(int data){
	Node newnode=new Node(data);
	if(head==null){
		head=newnode;
		return;
	}
	Node curr=head;
	while(curr.next!=null){
		curr=curr.next;
	}
	curr.next=newnode;
}



public void AddSpecific(int data,int pos){
	Node newnode=new Node(data);
	if(head==null){
		head=newnode;
		return;
	}
	Node curr=head;
	Node currnext=curr.next;
	int count=2;
	if(pos==1){
		AddFirst(data);
		return;
	}

	while(currnext!=null){
		if(count==pos){
			curr.next=newnode;
			newnode.next=currnext;
			return;


		}
		count++;
		curr=currnext;
		currnext=currnext.next;
	}
	curr.next=newnode;
	newnode.next=null;
	}


public void DeleteFirst()
{
	if(head==null){
		System.out.print("No list found");
		return;
	}

	head=head.next;
}

public void DeleteLast(){
	if(head==null){
		System.out.print("No list found");
		return;
	}

	if(head.next==null){
		head=null;
		return;
	}

	Node seccurr=head;
	Node curr=head.next;

	while(curr.next!=null){
		seccurr=curr;
		curr=curr.next;

	}
	seccurr.next=null;
}    

public void DeleteSpecific(int pos){
	if(head==null){
		System.out.print("No list found");
		return;
	}
	if(head.next==null){
		head=null;
		//System.out.print("No list");
		return;
	}

	if(pos==1){
		head=head.next;

	}
    
    Node seccurr=head;
	Node curr=head.next;
	//Node seccurr=head;
	int count=2;
	while(curr!=null){
		if(count==pos){
			seccurr.next=curr.next;
			curr=curr.next;
			return;

		}
		count++;
		seccurr=curr;
		curr=curr.next;
	}



}

public void Print(){
	if(head==null){
		System.out.print("List empty");
		return;
	}
	Node curr=head;
	while(curr!=null){
		System.out.print(curr.data+"->");
		curr=curr.next;
	}
	System.out.print("Null");
	System.out.println();

}


//Reverse list through iteration
public void Reversel(){
	if(head==null){
		System.out.println("List empty");
		return;
	}

	if(head.next==null){
		//System.out.println(head);
		return;

	}

	Node prev=head;
	Node curr=head.next;
	//Node currnext=curr.next;
	while(curr!=null){
		Node currnext=curr.next;
		curr.next=prev;
		prev=curr;
		curr=currnext;
		//currnext=currnext.next;

	}
	
	
	head.next=null;
	head=prev;
}


//Reverse list through recursion

public Node ReverseRec(Node head){
	if(head==null|| head.next==null){
		return head;
	}

	Node newHead=ReverseRec(head.next);
	head.next.next=head;
	head.next=null;

   return newHead;

}


	public static void main(String[] args){

		LL obj=new LL();
		/*System.out.println("1.Add First\n2.Add Specific\n3.Add Last\n4.Delete First\n5.DeleteLast\n6.DeleteSpecific\n7.Print ");
		Scanner sc=new Scanner(System.in);
		while(true){
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			int x=sc.nextInt();
			obj.AddFirst(x);
            break;
        case 2: 
        	System.out.println("Enter pos");
            int z=sc.nextInt();
            System.out.println("Enter data");
            int y=sc.nextInt();
			obj.AddSpecific(y,z);
            break;

        case 3: 
        	System.out.println("ENTER VALUE");
            int t=sc.nextInt();
			obj.LastNode(t);
            break; 
   
        case 4: 
			obj.DeleteFirst();
            break;

        case 5:
            obj.DeleteLast();
            break;

        case 6:
        	System.out.println("Enter position where you want to delete");
        	int r=sc.nextInt();

             obj.DeleteSpecific(r);
             break;   
        
        case 7:
        	obj.Print();
        	break ;

        default:
        	System.out.println("Not correct choice input");
 
		}
}
*/
		obj.LastNode(4);
	    obj.LastNode(5);
	    obj.LastNode(7);
	    obj.LastNode(2);
	    obj.AddFirst(1);
	    obj.LastNode(3);
	    obj.LastNode(9);
	    obj.AddFirst(8);
	    obj.Print();
	    obj.DeleteLast();
	    obj.Print();
	    obj.DeleteFirst();
	    obj.Print();
	    obj.DeleteSpecific(1);
	    obj.Print();
	    obj.DeleteSpecific(4);
	    obj.Print();
	    obj.AddSpecific(8,5);
	    obj.Print();
	    obj.AddSpecific(2,3);
	   obj.Print();
	   obj.head=obj.ReverseRec(obj.head);
	   obj.Print();

	}
}



