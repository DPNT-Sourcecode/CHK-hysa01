package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;
import java.util.Map;

import static befaster.solutions.CHK.ItemPriceMap.itemPriceMap;

public class CheckoutSolution {
    public static Integer checkout(String skus) {
        Map<Character, Integer> checkoutItems = new HashMap<>();
        Integer total = 0;

        for (int i = 0; i < skus.length(); i++) {
            char c = skus.charAt(i);
            checkoutItems.put(c, checkoutItems.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : checkoutItems.entrySet()) {
            Character item = entry.getKey();
            Integer quantity = entry.getValue();
            Integer price = itemPriceMap.get(item);

            if (itemPriceMap.containsKey(item)) {
                if (OfferPriceMap.offerPriceMap.containsKey(item)) {
                    Integer offerQuantity = OfferPriceMap.offerPriceMap.get(item).quantity;
                    Integer offerPrice = OfferPriceMap.offerPriceMap.get(item).price;
                    if (offerQuantity < quantity) {
                        total += (quantity / offerQuantity) * offerPrice + (quantity % offerQuantity) * price;
                    }
                    else if (offerQuantity.equals(quantity)) {
                        total += offerPrice;
                    }
                    else {
                        total += quantity * price;
                    }
                }
            }
            else {
                return -1;
            }
        }




    }
}




