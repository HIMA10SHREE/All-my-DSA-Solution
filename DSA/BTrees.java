import java.util.*;
class BTrees{

	static class Node{
		int data ;
		Node left;
		Node right;

		Node(int data){
			this.data = data;
			this.left=null;
			this.right=null;
		}
	}
    
    static int ind=-1;
	public static Node Btree(int nodes[]){
		ind++;
		if(nodes[ind]==-1){
			return null;
		}
		Node newnode=new Node(nodes[ind]);
		newnode.left=Btree(nodes);
		newnode.right=Btree(nodes);

		return newnode;

	}

	public static void inorder(Node root){
		if(root==null){
			return;
		}

		inorder (root.left);
		System.out.println(root.data +" ");
		inorder(root.right);
	}


/*level order without printing spaces*/

	public static void levelorder(Node root){
		Queue<Node>q=new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()){
			Node cur=q.remove();
			System.out.print(cur.data);
			if(cur.left!=null){
				q.add(cur.left);
			}
			if(cur.right!=null){
				q.add(cur.right);
			}
		}

	}


	/*level order with printing spaces*/

	public static void levelsorder(Node root){
		Queue<Node> q=new LinkedList<Node>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty()){
			Node cur=q.remove();
			if(cur==null){
				System.out.println();
				if(!q.isEmpty()){
					q.add(null);
				}
				else{
					break;
				}

			}
			else{
			System.out.print(cur.data);
			if(cur.left!=null){
				q.add(cur.left);
			}
			if(cur.right!=null){
				q.add(cur.right);
			}
		}
	}
	}

	

	public static int CountofNodes(Node root){
		if(root==null){
			return 0;
		}

		
			
	     int left=CountofNodes(root.left);
		 int right=CountofNodes(root.right);
		 return left + right+1;
	}


     public static int SumofNodes(Node root){
     	if(root==null){
     		return 0;
     	}

     	int left=SumofNodes(root.left);
     	int right=SumofNodes(root.right);

     	return left+right+root.data;
     }


     public static int HeightOfNodes(Node root){
     	if(root==null){
     		return 0;
     	}

     	int left=HeightOfNodes(root.left);
     	int right=HeightOfNodes(root.right);
     	int max=Math.max(left,right)+1;
     	return max;
     	}
      

/*Nodes taking O(n^2)*/

      public static int DiameterofNode(Node root){
      	if(root==null){
      		return 0;
      	}

        int diameter1=DiameterofNode(root.left);
        int diameter2=DiameterofNode(root.right);
        int diameter3=HeightOfNodes(root.left)+HeightOfNodes(root.right)+1;

        return Math.max(diameter3,Math.max(diameter1,diameter2));
      

       
}




/*Nodes taking O(n)*/

     static class Nodeinfo{
     	int dia;
     	int ht;

     	Nodeinfo(int dia,int ht){
     		this.dia=dia;
     		this.ht=ht;
     	}
     

     }

     public static Nodeinfo calcdia(Node root){
     	if(root==null){
     		return new Nodeinfo(0,0);
     	}

     	Nodeinfo left=calcdia(root.left);
     	Nodeinfo right=calcdia(root.right);
     	int myht=Math.max(left.ht,right.ht)+1 ;

     	int mydia=Math.max(Math.max(left.dia,right.dia),left.ht+right.ht+1);

     	Nodeinfo n=new Nodeinfo(mydia,myht);
     	return n;

     }



   /*Zigzag level order traversal*/

   public static ArrayList<Integer>ZigZag(Node root){
   	      Queue<Node>q=new LinkedList<Node>();
   	      ArrayList<Integer>ans=new ArrayList<Integer>();
   	      if(root==null){
   	      	return null;
   	      }

   	      
   	      q.add(root);
   	      int count=0;
   	      while(!q.isEmpty()){
   	      	count++;
   	      	ArrayList<Integer> temp=new ArrayList<Integer>();
            int sz=q.size();

            for(int i=0;i<sz;i++){
            	Node t=q.remove();
            	temp.add(t.data);
            	if(t.left!=null){
            		q.add(t.left);
            	}
            	if(t.right!=null){
            		q.add(t.right);
            	}
            	

            }

            if(count%2==0){
                 Collections.reverse(temp);
                 ans.addAll(temp);
          }
            else{
            	 ans.addAll(temp);
          }
            }
   	      
   	  return ans;    
   }




     


	public static void main(String[] args){

		//int nodes[]={2,4,9,-1,-1,-1,5,-1,-1};
		int nodes[]={2,4,9,2,1,6,-1,-1,-1,-1,-1,8,-1,5,-1,-1,-1};
        BTrees b=new BTrees();
        Node root=b.Btree(nodes);
      //  System.out.println(root.data);

      //  inorder(root);

        //levelorder(root);

      //levelsorder(root);  

       // int count=CountofNodes(root);
        //System.out.println(count);

         //int count= SumofNodes(root);
         //System.out.println(count);

        // int height=HeightOfNodes(root);
         //System.out.println(height);       
         //int diameter=DiameterofNode(root);
         //System.out.println(diameter);
         //Nodeinfo n=calcdia(root);
         //System.out.print(n.dia);

        ArrayList<Integer>z=ZigZag(root);
        for(int i=0;i<z.size();i++){
        	System.out.print(z.get(i));
        }
	}
}