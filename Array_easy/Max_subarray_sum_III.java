public class Max_subarray_sum_III {
    public static void MaxSubarray_sum_kadanes(int arr[]){
        int n=arr.length;
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i<n-1;i++){
            currSum=currSum +arr[i];
            if(currSum<0){
                currSum=0;
            }
            
            maxSum=Math.max(currSum, maxSum);
        }
        System.out.print("Max Subarray Sum :"+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        MaxSubarray_sum_kadanes(arr);
    }
}
