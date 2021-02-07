// PROBLEM DESCR
// Each new term in the Fibonacci sequence is generated by adding the previous two terms.
// By starting with 1 and 2, the first 10 terms will be:

// 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

 // By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.terms.
// PROBLEM DESCR

public class Prob2 {

  public static void main (String args[]) {

    int max = Integer.parseInt(args[0]);
    int sum = 0;

    int prev = 1;
    int next = 2;

    while (next < max) {

      // System.out.println("Before " + next);

      if (next % 2 == 0) {
        sum += next;
      }
      int new_num = prev + next;
      prev = next;
      next = new_num;

      // System.out.println("After " + next);

    }

    System.out.println("sum " + sum);

  }
}
