public class Sorted_Rotated_array {
    public static void sorted_rotatedArray(int nums[]){
        int n=nums.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        sorted_rotatedArray(arr);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
