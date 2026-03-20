public class Max_subarray_sum_I{
    public static void maxSubarraySum(int arr[]){

        int maxSum=Integer.MIN_VALUE;
        int n=arr.length;

        for(int i=0; i<n; i++){
            int st=i;
            for(int j=i; j<n; j++){
                int end=j;
                int currSum=0;
                for(int k=st; k<=end; k++){
                    currSum+=arr[k];

                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.print("Max sub Array Sum is: "+ maxSum +" ");
    }

    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxSubarraySum(arr);
    }


}
