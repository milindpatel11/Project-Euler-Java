public class Prob1 {

  public static void main (String args[]) {

    int  max = Integer.parseInt(args[0]);
    int sum = 0;

    for (int i=1; i<max; i++) {
      if ( i % 3 == 0 || i % 5 == 0) sum += i;
    }

    System.out.println(sum);


    // altenative efficient solution for large nums  using following formula ::
    // sum for numbes divisible by x =  (n / 2) (a + l) where n being number of terms, a first term and l last term.
    // n can be get using ((max - 0) / x) + 1 , last term by loops below; a being 0 to account for all cases
    //
    // use double to avoid lossy conversion later when divided by 2

    double max_three = 0;
    double max_five = 0;
    double max_fift = 0;

    // find largest in below max that is divisible by 3

    for (int i=max-1 ; i>=0; i--) {

      if ( i % 3 == 0) {
        max_three = i;
        break;
      }
    }

    // find largest in below max that is divisible by 5

    for (int i=max-1 ; i>=0; i--) {

      if ( i % 5 == 0) {
        max_five = i;
        break;
      }
    }

    // find largest in below max that is divisible by 15

    for (int i=max-1 ; i>=0; i--) {

      if ( i % 15 == 0) {
        max_fift = i;
        break;
      }
    }


    double sum_threes = ( ( (max_three-0 )/3  + 1) / 2 ) * ( 0 + max_three);
    double sum_fives = ( ( (max_five-0 )/5  + 1) / 2 ) * ( 0 + max_five);
    double sum_fifts = ( ( (max_fift-0 )/15 +  1) / 2 ) * ( 0 + max_fift);


    double new_sum = sum_threes + sum_fives - sum_fifts;
    // System.out.println(sum_threes + " " + sum_fives + " " + sum_fifts);
    System.out.println("Alt " + new_sum);



  }
}
