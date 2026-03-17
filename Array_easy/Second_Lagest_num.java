public class Second_Lagest_num {

   public static int SecLagestNumber(int[] var0) {
      int var1 = -1;
      int var2 = -1;

      for(int var3 = 0; var3 < var0.length; ++var3) {
         if (var0[var3] > var1) {
            var2 = var1;
            var1 = var0[var3];
         } else if (var0[var3] > var2 && var0[var3] != var1) {
            var2 = var0[var3];
         }
      }

      return var2;
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{12, 35, 1, 10, 34, 1};
      int var2 = SecLagestNumber(var1);
      if (var2 == -1) {
         System.out.println("Not present");
      } else {
         System.out.println("Second largest element is: " + var2);
      }

   }
    
}
