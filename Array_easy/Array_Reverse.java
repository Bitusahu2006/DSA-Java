public class Array_Reverse {
    public static void Reverse_array(int arr[]){
        int e = arr.length - 1;
        int s = 0;

        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;      
            e--;      
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 5};
        Reverse_array(arr);

        System.out.print("Reverse of an array is: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}