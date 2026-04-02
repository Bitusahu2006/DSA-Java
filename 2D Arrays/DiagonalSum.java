public class DiagonalSum{

    public static int SumofDiagonal(int matrix[][]){
        int startRow=0;
        int endCol=matrix[0].length-1;
        int startCol=0;
        int endRow=matrix.length-1;

        int sum=0;

        for(int j=startCol; j<=endCol; j++){
            for(int i=startRow; i<=endRow; i++){
                if(j==i || endCol==i+j){
                    sum+=matrix[i][j];
                }
            }
        }
        
        return sum;

    }
    public static void main(String[] args){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        System.out.print(SumofDiagonal(matrix));                
    }
}