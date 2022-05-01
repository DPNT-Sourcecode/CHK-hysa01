package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
    public Integer checkout(String skus) {
    //        Our price table and offers:
    //+------+-------+----------------+
    //| Item | Price | Special offers |
    //+------+-------+----------------+
    //| A    | 50    | 3A for 130     |
    //| B    | 30    | 2B for 45      |
    //| C    | 20    |                |
    //| D    | 15    |                |
    //+------+-------+----------------+
        Map<String, Integer> itemList = new HashMap<>();
        itemList.put("A", 50);
        itemList.put("B", 30);
        itemList.put("C", 20);
        itemList.put("D", 15);
        return 0;


    }
}
