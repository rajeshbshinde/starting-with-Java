package src.rajesh.LinkedList;

public class MatrixTraversal {
// ++++++++++++++++++++

    public static void dfs(char M[][],int i, int j){
        int row = M.length;
        int column = M[0].length;
        if(i<0 || i>= row || j < 0 || j>= column || M[i][j] != '1'){
            return;
        }
        M[i][j]=0;
        dfs(M,i+1,j);//down
        dfs(M,i-1,j);//up
        dfs(M,i,j+1);//right
        dfs(M,i,j-1);//left
//
//        dfs(M,i+1,j-1);
//        dfs(M,i-1,j-1);
//        dfs(M,i-1,j+1);
//        dfs(M,i+1,j+1);
    }

    public static void main(String[] args) {
        char[][] M = {
                { '1', '1', '0', '0', '0' },
                { '0', '1', '0', '0', '1' },
                { '1', '0', '0', '1', '1' },
                { '0', '1', '0', '0', '0' },
                { '1', '0', '1', '1', '0' }
        };
         int row = M.length;
         int column = M[0].length;
         System.out.println("Rows are "+row+" Columns are "+column);
         int island = 0;
         for(int i = 0; i< row;i++){
             for(int j = 0; j< column;j++){
                 if(M[i][j]=='1'){
                     dfs(M,i,j);
                     island +=1;
                 }
             }
         }

         System.out.println("Count of Island are "+island);
    }
}
