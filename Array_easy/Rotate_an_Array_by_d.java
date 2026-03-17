public class Rotate_an_Array_by_d {

    public static void RotateArray(int arr[], int d){
        int n=arr.length;
        int end=n-1;

        for(int i=0; i<d;i++){

            int first=arr[0];
            for(int j=0; j<n-1; j++){
                arr[j]=arr[j+1];
            }
            arr[end]= first;
        }
    }
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6};
        int d=2;
        RotateArray(arr, d);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");

        }
    }
    
}
