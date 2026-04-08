public class subString {
    public static void SubString(String str,int  si, int ei ){
        String subString="";
        for(int i=si; i<ei; i++){
            subString+=str.charAt(i);
        }
        System.out.print(subString);
    }
    public static void main(String[] args){
        String str="HelloWorld"; //lor
        SubString(str,3,6);
        System.out.println();
        //Using Function to find the substring
        System.out.print(str.substring(3,6));
    }
}
