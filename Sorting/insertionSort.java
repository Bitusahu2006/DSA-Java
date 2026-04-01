public class insertionSort {

    public static void printinsertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int prev= i - 1;

            // shift elements
            while (prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev+ 1] = current;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};

        printinsertionSort(arr);
        printArray(arr);
    }
}