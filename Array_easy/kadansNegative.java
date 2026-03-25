public class kadansNegative {

    public static void kadane_maxsubaaray_Sum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        for(int i=0; i<arr.length; i++){
            currSum=currSum+arr[i];
            if(currSum>maxSum){
                maxSum=currSum;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        System.out.print("Max subarray sum: "+ maxSum);
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,-4};
        kadane_maxsubaaray_Sum(arr);
    }
    
}
