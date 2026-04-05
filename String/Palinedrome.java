public class Palinedrome {
    public static boolean CheckPalindrome1(String str){
        int n=str.length();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.print("not palindrome");
                return false;
            }
        }
        System.out.print(str+ " Is Palindrome.");
        return true;
    }
    public static boolean CheckPalindrome2(String str){

        String  rev =new StringBuilder(str).reverse().toString();

        if(str.equals(rev)){
            System.out.print("\n"+str+" Is palindrome");
            return true;
        }
        System.out.println();
        System.out.println("\nNot palindrome");
        return false;

    }
    public static boolean CheckPalindrome3(String str){
        int n=str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.print("\n"+str+" is not palindrome.");
                return false;
            }
        }
        System.out.print("\n"+str+" is palindrome.");
        return true;
    }

    public static void main(String[] args){
        String str="madam";
        CheckPalindrome1(str);
        CheckPalindrome2("racecar");
        CheckPalindrome3("noon");
    }
}
