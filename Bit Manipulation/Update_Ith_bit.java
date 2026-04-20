public class Update_Ith_bit {
    public static int setIthBit(int n, int i){
        int bitMarks=1<<i;
        return n|bitMarks;   
    }
    public static int ClearIthBit(int n, int i){

        int bitMarks= ~(1<<i);
        return n&bitMarks;      

    }
    public static int UpdateIthBit(int n, int i, int newBit){
        if(newBit==0){
            return ClearIthBit(n,i);
        }else{
            return setIthBit(n,i);
        }      
    }
    public static void main(String[] args){
        System.out.print(UpdateIthBit(10,2,1));
    }

}
