import java.util.*;

 class AdjMatrix{

	static int matrix[][];

	AdjMatrix(int vertices){
		matrix=new int[vertices][vertices];
	}

    public static void addedge(int source,int destination){
    	matrix[source][destination]=1;
    	matrix[destination][source]=1;

    }

    public static void main(String[] args){
    	int v=5,e=8;

        AdjMatrix a=new AdjMatrix(v);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<e;i++){
        	System.out.println("Enter edges");
        	int x=sc.nextInt();
        	int y=sc.nextInt();
        	a.addedge(x,y);
        }

        for(int i=0;i<v;i++){
        	for(int j=0;j<v;j++){
        		System.out.print(matrix[i][j]+" ");
        	}
        	System.out.println();
        }

    }


}