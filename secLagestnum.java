public class secLagestnum {

    public static int SecLagestNumber(int arr[]) {
        int Max_val = -1;
        int Second_max = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > Max_val) {
                Second_max = Max_val;
                Max_val = arr[i];
            } 
            else if (arr[i] > Second_max && arr[i] != Max_val) {
                Second_max = arr[i];
            }
        }
        return Second_max;
    }

    public static void main(String[] args) {

        int arr[] = {12, 35, 1, 10, 34, 1};
        int second_lagest = SecLagestNumber(arr);

        if (second_lagest == -1) {
            System.out.println("Not present");
        } else {
            System.out.println("Second largest element is: " + second_lagest);
        }
    }
}