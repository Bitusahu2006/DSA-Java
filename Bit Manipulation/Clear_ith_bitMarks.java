public class Clear_ith_bitMarks {
    public static int ClearIthBit(int n, int i){

        int bitMarks= ~(1<<i);
        return n&bitMarks;      

    }
    public static void main(String[] args){
        System.out.print(ClearIthBit(10,1));
    }
}
