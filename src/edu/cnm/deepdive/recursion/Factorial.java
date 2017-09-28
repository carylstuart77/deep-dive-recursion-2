package edu.cnm.deepdive.recursion;

import java.math.BigInteger;

public class Factorial {
  //static provides access outside method; if not specified it is not accessable
  public static BigInteger factorial(int n) {
    //returns type BigInteger                           //create biginteger from other numbers
    return (n <= 1) 
        ? BigInteger.ONE 
            : factorial(n - 1).multiply(BigInteger.valueOf(n));
    
    //create biginteger from other numbers
    
    //int product = 1;
    //for (int i = 2; i <= n; i++) {
    //     product *= i;
    //if then else - Tireny sp?
   // return (n <= 1) ? 1 : n * factorial(n-1);
    
  }

}
