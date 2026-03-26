public class Trapped_Rain_water {

    public static void TrappedRaionWater(int height[]){
        int n=height.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];      

        // Fill leftmax array (max height from left to current index)
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        
        // Fill rightmax array (max height from right to current index)
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],height[i]);
        }
        
        // Calculate trapped water
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftmax[i],rightmax[i]);
            trappedWater+=waterLevel-height[i];
        }
        
        System.out.println("Trapped Water: "+trappedWater);
    }
    public static void main(String[] args) {
        int nums[]={4,2,0,6,3,2,5};
        TrappedRaionWater(nums);
    }
}
