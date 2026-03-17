import java.util.Arrays;

public class Third_lagest_num {
    public static int Third_largest_element_value(int arr[]){
        Arrays.sort(arr);
        int n=arr.length;

        return arr[n-3];

    }

    public static void main(String[] args) {

        int arr[]={1, 14, 2, 16, 10, 20};
        System.out.println(Third_largest_element_value(arr));
    }
}
