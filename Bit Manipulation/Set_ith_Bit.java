public class Set_ith_Bit {
    public static int setIthBit(int n, int i){
        int bitMarks=1<<i;

        int value= n|bitMarks;
        return value;
    }
    public static void main(String[] args){
        System.out.print(setIthBit(10,2));
    }
}
