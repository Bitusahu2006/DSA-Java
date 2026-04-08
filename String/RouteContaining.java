public class RouteContaining {
    public static float  findShortest_path(String direction){
        int x=0;
        int y=0;

        for(int i=0; i<direction.length(); i++){
            if(direction.charAt(i)=='N'){
                y++;
            }
            if(direction.charAt(i)=='S'){
                y--;
            }
            if(direction.charAt(i)=='E'){
                x++;
            }
            if(direction.charAt(i)=='W'){
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String [] args){
        String direction="WNEENESENNN";
        System.out.print(findShortest_path(direction));
    }
}
