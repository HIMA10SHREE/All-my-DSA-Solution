class BSTree{

	static class Node{

		int data;
		Node right;
		Node left;

		Node(int data){
			this.data=data;
			this.right=null ;
			this.left=null;
		}
	}

	public static Node insert(Node root,int val){
		if(root==null){
			root=new Node(val);
			return root;
		}
		if(root.data>val){
			root.left=insert(root.left,val);
		}
		else{
			root.right=insert(root.right,val);
		}

     return root;
	}


    public static void inorder(Node root){

    	ArrayList<Integer> arr=new ArrayList<>();
    	if(root== null){
    		return ;
    	}
    	inorder(root.left);
    	System.out.print(root.data+" ");

    	inorder(root.right);
    }


    public static boolean SearchTree(Node root,int key){
    	if(root==null){
    		return false;
    	}

    	if (root.data==key){
    		return true;
    	}

    	if(root.data>key){
    		return(SearchTree(root.left,key));
    	}
    	else{
    		return SearchTree(root.right,key);
    	}

    	
    }


	public static void main(String[] args){
		int nodes[]={5,3,2,9,6,11};
		Node root=null;
		for(int i=0;i<nodes.length;i++){
			root=insert(root,nodes[i]);
		}
           System.out.println(root.data);
           inorder(root);
           int key=1;
           System.out.println();
           boolean res=SearchTree(root,key);
           System.out.print(res);
	}
}