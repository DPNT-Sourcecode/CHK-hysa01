package befaster.solutions.CHK;

import java.util.HashMap;
import java.util.Map;

import static befaster.solutions.CHK.ItemPriceMap.itemPriceMap;
import static befaster.solutions.CHK.FreebieOfferMap.freebieOfferMap;
import static befaster.solutions.CHK.MultiPriceOfferMap.multiPriceOfferMap;


public class CheckoutSolution {
    public static Integer checkout(String skus) {
        Map<Character, Integer> checkoutItems = new HashMap<>();
        Integer total = 0;

        if (skusIsInvalid(skus)) {
            return -1;
        } else if (skus.equals("")){
            return 0;
        }
        else {
            for (int i = 0; i < skus.length(); i++) {
                char c = skus.charAt(i);
                checkoutItems.put(c, checkoutItems.getOrDefault(c, 0) + 1);
            }

            for (Character freebieOfferItem : freebieOfferMap.keySet()) {
                
            }



            for (Map.Entry<Character, Integer> entry : checkoutItems.entrySet()) {
                Character item = entry.getKey();
                Integer quantity = entry.getValue();
                Integer price = itemPriceMap.get(item);


                if (multiPriceOfferMap.containsKey(item)) {
                    Integer offerQuantity = multiPriceOfferMap.get(item).quantity;
                    Integer offerPrice = multiPriceOfferMap.get(item).price;
                    if (offerQuantity < quantity) {
                        total += (quantity / offerQuantity) * offerPrice + (quantity % offerQuantity) * price;
                    }
                    else if (offerQuantity.equals(quantity)) {
                        total += offerPrice;
                    }
                    else {
                        total += quantity * price;
                    }
                } else {
                    total += quantity * price;
                }
            }
        }
        return total;
    }

    private static boolean skusIsInvalid(String skus) {
        char[] items = skus.toCharArray();
        for (char item : items) {
            if (!itemPriceMap.containsKey(item) || item == ' ') {
                return true;
            }
        }
        return false;
    }
}

