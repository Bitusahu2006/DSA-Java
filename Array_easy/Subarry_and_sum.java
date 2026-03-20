
import java.util.Scanner;

public class Subarry_and_sum{
    public static void print_sunArray(int arr[]){
        int total_subarray =0;
        
        int last=arr.length-1;

        for(int i=0; i<arr.length; i++){
            int sum_last=0;
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                int sum=0;
                for(int k=start; k<=end; k++){
                    System.out.print(arr[k]+ " ");
                    sum = sum+arr[k];

                }
                
                total_subarray++;
                System.out.println("=" + sum);
                sum_last=sum;
                
            }

            System.out.println("1st & last = " +(arr[start]+sum_last));
        }

        System.out.println("="+ total_subarray);
        System.out.println("="+ (arr[0]+arr[last]));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();

        System.out.println("Enter your array element :");
        int arr[]=new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        print_sunArray(arr);
    }
    
}
