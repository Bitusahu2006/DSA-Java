public class Sort_an_array_in_wave_form {
    
    public static void sort_array_inWave(int arr[]){
        int n=arr.length;


        for(int i=1; i<n; i+=2){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;

        }
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        sort_array_inWave(arr);

        for (int i= 0; i< arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}
