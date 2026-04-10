public class GetithBit {
    public static int Get_ith_bit(int n, int i){
        int bitMarks=1<<i;

        if((n&bitMarks)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args){
        System.out.println(Get_ith_bit(10,2));
        System.out.print(Get_ith_bit(7,2));
    }
}
