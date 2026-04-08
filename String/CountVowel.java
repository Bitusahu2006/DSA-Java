import java.util.Scanner;

public class CountVowel {

    public static void lowerCaseCount(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i)); // handle uppercase भी

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No vowels found.");
        } else {
            System.out.println(count + " vowels in the entered string.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your information: ");
        String str = sc.nextLine();
        lowerCaseCount(str);
    }
}