// PROBLEM DESCR

// A palindromic number reads the same both ways.
//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
// Find the largest palindrome made from the product of two 3-digit numbers.

/// PROBLEM DESCR

// command to solve mentioned problem ::: java Prob4


public class Prob4 {

  public static boolean isPalindrome (int a) {

    String regular = Integer.toString(a);
    char [] chars = regular.toCharArray();
    String reverse = "";

    for (int i = chars.length - 1 ; i >=0 ; i-- ) reverse += chars[i];
    return (regular.equals(reverse));

  }


  public static void main (String args[]) {


    // Naive brute method - without duplicates
    //

    int max_peli = 0;

    for (int i = 999 ; i > 99 ; i -- ) {
      for (int j = i ; j > 99 ; j -- ) {

        int prod = i * j;

        if ( isPalindrome(prod) && prod > max_peli) max_peli = prod;

      }
    }

    System.out.println(max_peli);

    //  Little smarter brute method - without duplicates
    //

    max_peli = 0;
    int temp_a = 1;
    int temp_b = 1;

    // First try to get first peli
    for (int i = 999 ; i > 99 ; i -- ) {
      for (int j = i ; j > 99 ; j -- ) {

        int prod = i * j;

        if ( isPalindrome(prod)) {
          max_peli = prod;
          temp_a = i;
          temp_b = j;
          break;
        };

      }
    }

    // Second try to limit loop to numbers above min of a and break;

    for (int i = 999 ; i >= temp_a ; i -- ) {
      for (int j = i ; j >= temp_b ; j -- ) {

        int prod = i * j;

        if ( isPalindrome(prod) && prod > max_peli ) max_peli = prod;

      }
    }


    System.out.println(max_peli);



  }

}
