// PROBLEM DESCR

// The sum of the squares of the first ten natural numbers is == 385
// The square of the sum of the first ten natural numbers is == 3025
// Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
// 3025  − 385 = 2640 .
// Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


/// PROBLEM DESCR

// command to solve mentioned problem ::: java Prob6 100


public class Prob6 {


  public static void main (String args[]) {

    int max = Integer.parseInt(args[0]);

    // sum of square upto n is : [n(n + 1)(2n + 1)] / 6
    long sum_of_sq = ( max * (max + 1) * (2*max + 1)) / 6 ;

    // sum of first n terms :: n(n+1) / 2 then square it
    long sum_of_terms =( max * (max +1) ) / 2;
    long sq_of_sums = sum_of_terms * sum_of_terms;


    System.out.println(sq_of_sums - sum_of_sq);

  }

}
