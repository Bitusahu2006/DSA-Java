public class LargestString {

    public static void printLargest(String fruits[]) {
        String largest = fruits[0];

        for (int i = 1; i < fruits.length; i++){
            if (largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        System.out.println("Largest string is: " + largest);
    }
    public static void main(String[] args){
        String fruits[] = {"apple", "mango", "banana", "zebra"};
        printLargest(fruits);
    }
}