package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

public class CheckoutSolution {
    public static Integer checkout(String skus) {
        Map<Character, Integer> checkoutItems = new HashMap<>();

        for (int i = 0; i < skus.length(); i++) {
            char c = skus.charAt(i);
            checkoutItems.put(c, checkoutItems.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : checkoutItems.entrySet()) {
            Character item = entry.getKey();
            Integer quantity = entry.getValue();
            if (itemPriceMap.)
        }




    }
}

