public class evenOdd{
    public static void EvenOdd(int n){
        int bitMarks=1;
        if((bitMarks&n)==0){
            System.out.println("Even Number.");
        }else{
            System.out.println("Odd number.");
        }
    }
    public static void main(String[] args){
        EvenOdd(5);
        EvenOdd(3);
        EvenOdd(12);
        EvenOdd(21);
    }
}