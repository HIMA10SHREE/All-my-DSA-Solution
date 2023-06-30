import java.util.*;
class Ksorted{
    public static void main(String[] args){
             int n=3,m=3;
             int x=0;
        int[][] arr=new int[n][m];
        ArrayList <Integer> a=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                x=sc.nextInt();
                arr[i][j]=x;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        
        for(int i=0;i<1;i++){
            for(int j=0;j<m;j++){
                a.add(arr[i][j]);
            }
        }


            /*   for(int j=0;j<m;j++){
                System.out.print(a.get(j));
            }

            System.out.println(a.size()-1);
        */


        
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int y=a.size()-1;
                while(y>=0){
                    if(arr[i][j]<a.get(y)){
                        y--;
                    }
                }
                a.add(arr[i][j],y);
            }
        }
        
        for(int i=0;i<n*m;i++){
            System.out.print(a.get(i));
        }
    }
}