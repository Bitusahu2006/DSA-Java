import java.util.Scanner;

public class basicString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char arr[] = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //length of this array
        System.out.print(arr.length);
        System.out.println();

        // String input
        String name1;
        String name2;

        // next() → single word
        name1 = sc.next();
        System.out.println("My name is: " + name1);
        System.out.print("Length of the name1 is : "+ name1.length()+"\n");

        sc.nextLine(); 

        // nextLine() → full sentence
        name2 = sc.nextLine();
        System.out.println("My full name is: " + name2);
        System.out.print("Length of the name2 is : "+ name2.length()+"\n");




    }
}