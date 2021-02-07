// PROBLEM DESCR

// The prime factors of 13195 are 5, 7, 13 and 29.
// What is the largest prime factor of the number 600851475143 ?

/// PROBLEM DESCR

// command to solve mentioned problem ::: java Prob3 600851475143


public class Prob3 {

  public static void main (String args[]) {

    long numb = Long.parseLong(args[0]);
    long maxprime = 2;


    // outer for loop
    for (long factor = 2 ; factor * factor < numb ; factor++ ) {

      while (numb % factor == 0) {
        System.out.print(factor + " ");
        if (maxprime < factor) maxprime = factor;
        numb = numb / factor;
      }

    }
     // end outer for loop
     if (numb > maxprime) maxprime = numb;

     if (numb > 1) System.out.println(numb);
     else System.out.println();

    System.out.println("ans " + maxprime);


  }

}
