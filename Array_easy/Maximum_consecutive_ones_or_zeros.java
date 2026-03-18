public class Maximum_consecutive_ones_or_zeros{

    public static int findMaxConsecutiveOnes(int arr[]) {
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static int findMaxOneZeroConsecutive(int arr[]) {
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;
            }
        }

        return Math.max(maxCount, count);
    }

    public static void main(String[] args) {
        int arr1[] = {0, 1, 0, 1, 1, 1, 1};
        int arr2[] = {0, 0, 0, 1, 0, 1, 0};

        System.out.println("Max consecutive 1s: " + findMaxConsecutiveOnes(arr1));
        System.out.println("Max consecutive same bits (0s or 1s): " + findMaxOneZeroConsecutive(arr2));
    }
}