package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
    public static Integer checkout(String skus) {
    //        Our price table and offers:
    //+------+-------+----------------+
    //| Item | Price | Special offers |
    //+------+-------+----------------+
    //| A    | 50    | 3A for 130     |
    //| B    | 30    | 2B for 45      |
    //| C    | 20    |                |
    //| D    | 15    |                |
    //+------+-------+----------------+
        Map<Character, Integer> checkoutItems = new HashMap<>();

        for (int i = 0; i < skus.length(); i++) {
            char item = skus.charAt(i);
            checkoutItems.put(item,  )
        }




    }
}


