// PROBLEM DESCR

// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

// What is the smallest positive number that is EVENLY divisible by all of the numbers from 1 to 20?

/// PROBLEM DESCR

// command to solve mentioned problem ::: java Prob5 20


public class Prob5 {

  public static long gcd (long a, long b) {
    if (b == 0) return a;
    return gcd (b, a % b);
  }

  public static long lcf (long a, long b) {

    long gcd = gcd (a, b);
    long mult = a * b;
    long lcf = mult / gcd;

    return lcf;
  }


  public static void main (String args[]) {

    int max = Integer.parseInt(args[0]);
    long running_lcm = 1;

    for (long i = 2; i <= max; i++ ) {
      running_lcm = lcf (running_lcm, i);
    }

    System.out.println(running_lcm);
    // System.out.println( lcf (3,4) );

  }

}
