public class ConcatinationAnd1stElemInString {
    public static void main(String[] args){
        //Concatination
        String firstName="Bitu";
        String lastName="Sahu";

        String fullName=firstName+lastName;

        System.out.print("My full name is: "+fullName+"\n");

        // first charcter of the fullName 
        System.out.print(fullName.charAt(0)+",");

        // all character print from the fullNma string 
        for(char i=1; i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+",");
        }
        

    }
}
