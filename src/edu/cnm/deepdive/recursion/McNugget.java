package edu.cnm.deepdive.recursion;

public class McNugget {
  //                           vArray
  private static final int[] PACK_SIZES = {29, 9, 6};
  public static boolean test(int n) {
    if (n<0) {
      return false;
    }
    if (n==0) {
      return true;
    }
    return test (n, PACK_SIZES, 0);
  }
  //Two test method with two methods = Overload; offset is look at 0, then 1, then 2
  /*private static boolean test(int n, int[] packSizes, int offset) {
    if (n < 0) {
      return false;
    } 
    if (n==0) {
      return true;
    }
      return test(n, PACK_SIZE);
    }
    */
  private static boolean test(int n, int[] packsizes, int offset) {
    if (n < 0) {
      return false;
    }
    if (n == 0) {
      return true;
    }
    boolean trial = false;
    for (int i = offset; i < packsizes.length; i++) {
      
      trial = test(n - packsizes[i], packsizes, i);
      //since boolean it is like trial = TRUE cuz if condition behaves that way.
      if (trial) {
        break;
        
      }
    }
    return true;
  }
  //invokes method test
  /*public static void main(String[] args) {
    System.out.println(test(33));
    */
    
    public static void main(String[] args) {
       //    vThis is an array
      // int[] packsizes;
      //packsizes = new int [] = {5, 7, 13, 15};
      //                          vThis is an array
      System.out.println(test(95, new int[] {15, 12, 8}, 0));
      //System.out.println(test(95, packsizes, 0));
  }
}

