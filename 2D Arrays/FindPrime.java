public class FindPrime {
    public static  void findPrime(int arr[][]){
        int n=arr.length;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<arr[0].length;j++){

                if(arr[i][j]%2!=0){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args){
        int array[][] = { {4,7,8},{8,8,7} };
        findPrime(array);
    }
}
