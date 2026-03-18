import java.util.Arrays;

public class Maximum_product_of_a_triplet {

    public static int  Maximum_product_three(int arr[]){
        int n=arr.length;
        Arrays.sort(arr);

        return Math.max(arr[n-1]*arr[n-2]*arr[n-3] , arr[0]*arr[1]*arr[n-1]);
    }

    public static void main(String[] args) {
        int arr[]={1, -4, 3, -6, 7, 0};
        System.out.println(Maximum_product_three(arr));

    }
    
}
