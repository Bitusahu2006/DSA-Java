public class Max_subarray_sum_II {

    public static void maxSubarray_sum(int arr[]) {
      int n=arr.length;
      int prefix[]=new int[n];
      int maxSum = Integer.MIN_VALUE;
      int currSum=0;
      
      prefix[0]=arr[0];
      for(int i=1; i<n;i++){
        prefix[i]=arr[i]+prefix[i-1];
      }

      for(int i=0; i<n; i++){
        int st=i;
        
        
        for(int j=i; j<n; j++){

            int end=j;
            currSum= st==0? prefix[end]: prefix[end]-prefix[st-1];

            if(maxSum<currSum){
                maxSum=currSum;
            }
        }
        
    }
      System.out.println("Max Sum of subarray is: "+maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        maxSubarray_sum(arr);
    }
}