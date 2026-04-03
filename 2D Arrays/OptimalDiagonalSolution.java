public class OptimalDiagonalSolution {
    public static int DiagonalSum(int matrix[][]){
        int n=matrix.length;
        int sum=0;

        for(int i=0; i<n; i++){
            //Primary Diagonal
            sum+=matrix[i][i];
            //Secondary Diagonal
            if(i!=n-i-1){
                sum+=matrix[i][n-i-1]; 

            }

        }
        return sum;
    }
    public static void main(String [] args){
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.print(DiagonalSum(matrix));
    }
}
