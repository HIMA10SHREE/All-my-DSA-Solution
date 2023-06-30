import java.util.*;
class AdjList{
	static int vertices;
	static LinkedList<Integer>ad[];

	AdjList(int vertices){
		this.vertices=vertices;
		ad=new LinkedList[vertices];
		for(int i=0;i<vertices;i++){
			ad[i]=new LinkedList<Integer>();
		}
	  }

	 public static void addedge(int source,int destination){
	 	ad[source].add(destination);
	 	ad[destination].add(source);

	 	}

	 public static void printgraph(){
	 	for(int i=0;i<vertices;i++){
	 		System.out.println("element "+i+ " is connected to"+"--");
	 		for(int j=0;j<ad[i].size();j++){
                  System.out.print(ad[i].get(j)+"-->");
	 		}
	 		System.out.print("null");

	 		System.out.println();
	 	}

	 }	


	 public static void main(String[] args){
	 	AdjList a=new AdjList(5);
	 	a.addedge(0,1);
	 	a.addedge(0,2);
	 	a.addedge(0,3);
	 	a.addedge(0,4);
	 	a.addedge(1,2);
	 	a.addedge(1,4);
	 	a.addedge(2,4);
	 	a.addedge(3,4);
        a.printgraph();
	 }	
	 } 

